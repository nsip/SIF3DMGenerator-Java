/*
 * DataModelMarshalFactory.java
 * Created: 23/09/2014
 *
 * Copyright 2014 Systemic Pty Ltd
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License 
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */
package sif.dd.us32.conversion;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import sif.dd.us32.model.ObjectFactory;
import sif3.common.CommonConstants.SchemaType;
import sif3.common.conversion.MarshalFactory;
import sif3.common.exception.MarshalException;
import sif3.common.exception.UnsupportedMediaTypeExcpetion;
import sif3.common.utils.JAXBUtils;

public class DataModelMarshalFactory implements MarshalFactory
{
    protected final Logger logger = LoggerFactory.getLogger(getClass());

	private static final HashMap<Class<?>, Method> CREATE_METHODS = new HashMap<Class<?>, Method>();

	//List of supported media types.
	private static final HashSet<MediaType> supportedMediaTypes = new HashSet<MediaType>(Arrays.asList(MediaType.APPLICATION_XML_TYPE, MediaType.TEXT_XML_TYPE, MediaType.APPLICATION_JSON_TYPE));
	
	private ObjectFactory objFactory = new ObjectFactory();
  
	/**
	 * Pre-populate Create Method Cache for faster marshaling of objects.
	 */
	static
	{
		Method[] methods = ObjectFactory.class.getMethods();
		for (int i = 0; methods != null && i < methods.length; i++)
		{
			Method method = methods[i];
			if ((method != null) && (method.getParameterTypes() != null) && (method.getParameterTypes().length == 1) && (method.getReturnType().equals(JAXBElement.class)))
			{
				CREATE_METHODS.put(method.getParameterTypes()[0], method);
			}
		}
	}
	
	@Override
	public String marshalToXML(Object obj) throws MarshalException, UnsupportedMediaTypeExcpetion
	{
		String result = null;
		try
		{
			Method method = findCreateMethod(obj);
			if (method != null)
			{
				JAXBElement<?> element = (JAXBElement<?>) method.invoke(objFactory, obj);
				if (element != null)
				{
					result = JAXBUtils.marshalToXML(element);
				}
			}
		}
		catch (Exception e)
		{
			logger.error("An error occurred marshalling object to XML", e);
			throw new MarshalException("An error occurred marshalling object to XML", e);
		}
		return result;
	}
	
	@Override
	public String marshalToJSON(Object obj) throws MarshalException, UnsupportedMediaTypeExcpetion
	{
		String result = null;
		try
		{
			Method method = findCreateMethod(obj);
			if (method != null)
			{
				JAXBElement<?> element = (JAXBElement<?>) method.invoke(objFactory, obj);
				if (element != null)
				{
					result = JAXBUtils.marshalToJSON(element, SchemaType.goessner);
				}
			}
		}
		catch (Exception e)
		{
			logger.error("An error occurred marshalling object to JSON", e);
			throw new MarshalException("An error occurred marshalling object to JSON", e);
		}
		return result;
	}

    /* (non-Javadoc)
     * @see sif3.common.conversion.MarshalFactory#marshalToJSON(java.lang.Object, sif3.common.CommonConstants.SchemaType)
     */
    @Override
    public String marshalToJSON(Object obj, SchemaType jsonSchema) throws MarshalException, UnsupportedMediaTypeExcpetion
    {
        String result = null;
        try
        {
            Method method = findCreateMethod(obj);
            if (method != null)
            {
                JAXBElement<?> element = (JAXBElement<?>) method.invoke(objFactory, obj);
                if (element != null)
                {
                    result = JAXBUtils.marshalToJSON(element, jsonSchema);
                }
            }
        }
        catch (Exception e)
        {
            logger.error("An error occurred marshalling object to JSON", e);
            throw new MarshalException("An error occurred marshalling object to JSON", e);
        }
        return result;
    }

	@Override
	public String marshal(Object obj, MediaType mediaType) throws MarshalException, UnsupportedMediaTypeExcpetion
	{
		if (mediaType != null)
		{
			if (MediaType.APPLICATION_XML_TYPE.isCompatible(mediaType) || MediaType.TEXT_XML_TYPE.isCompatible(mediaType))
			{
				return marshalToXML(obj);
			}
			else if (MediaType.APPLICATION_JSON_TYPE.isCompatible(mediaType))
			{
				return marshalToJSON(obj, SchemaType.goessner);
			}
		}
		// If we get here then we deal with an unknown media type
		throw new UnsupportedMediaTypeExcpetion("Unsupported media type: " + mediaType + ". Cannot marshal the given input to this media type.");
	}
	
    /* (non-Javadoc)
     * @see sif3.common.conversion.MarshalFactory#marshal(java.lang.Object, javax.ws.rs.core.MediaType, sif3.common.CommonConstants.SchemaType)
     */
    @Override
    public String marshal(Object obj, MediaType mediaType, SchemaType jsonSchema) throws MarshalException, UnsupportedMediaTypeExcpetion
    {
        if (mediaType != null)
        {
            if (MediaType.APPLICATION_XML_TYPE.isCompatible(mediaType) ||   MediaType.TEXT_XML_TYPE.isCompatible(mediaType))
            {
                return marshalToXML(obj);
            }
            else if (MediaType.APPLICATION_JSON_TYPE.isCompatible(mediaType))
            {
                return marshalToJSON(obj, jsonSchema);
            }
        }
        // If we get here then we deal with an unknown media type
        throw new UnsupportedMediaTypeExcpetion("Unsupported media type: " + mediaType + ". Cannot marshal the given input to this media type.");
    }

    /*
	 * (non-Javadoc)
	 * @see sif3.common.conversion.MediaTypeOperations#getDefault()
	 */
	@Override
    public MediaType getDefault()
    {
	    return MediaType.APPLICATION_XML_TYPE;
    }

	/*
	 * (non-Javadoc)
	 * @see sif3.common.conversion.MediaTypeOperations#isSupported(javax.ws.rs.core.MediaType)
	 */
	@Override
    public boolean isSupported(MediaType mediaType)
    {
		if (mediaType != null)
		{
			Set<MediaType> mediaTypes = getSupportedMediaTypes();
			for (Iterator<MediaType> iter = mediaTypes.iterator(); iter.hasNext();)
			{
				if (mediaType.isCompatible(iter.next()))
				{
					return true;
				}
			}
		}
		
		return false;
    }
	
	/* (non-Javadoc)
     * @see sif3.common.conversion.MediaTypeOperations#getSupportedMediaTypes()
     */
    @Override
    public Set<MediaType> getSupportedMediaTypes()
    {
	    return supportedMediaTypes;
    }

    /*---------------------*/
    /*-- Private Methods --*/
    /*---------------------*/
    /*
     * Finds the method that has one parameter of the type provided.
     * 
     * @param obj object that needs to be marshaled.
     * @return method - method to invoke to convert object into a jaxb element.
     */
	private Method findCreateMethod(Object obj)
	{
		Method result = null;
		if (obj != null && obj.getClass() != null)
		{
			result = CREATE_METHODS.get(obj.getClass());
		}
		return result;
	}
}
