package com.qa.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import com.qa.constant.FrameworkConstant;
import com.qa.enums.ConfigProperties;

public final class PropertiesUtils 
{
	private static Properties property =new Properties();
	private static final HashMap<String, String> CONFIGMAP = new HashMap<>();
	private PropertiesUtils()
	{



	}



	static {
		try(FileInputStream file = new FileInputStream(FrameworkConstant.getConfigFilePath()))
		{
			property.load(file);
			for(Map.Entry<Object,Object> entry : property.entrySet())
			{
				CONFIGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()).trim());
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
			System.exit(0);
		}
	}




	public static String get(ConfigProperties key) throws Exception
	{
		if(Objects.isNull(key)||Objects.isNull(CONFIGMAP.get(key.name().toLowerCase())))
		{
			throw new Exception("Property Name: " + key + "is not found. Please check config.properties");
		}
		return CONFIGMAP.get(key.name().toLowerCase());
	}


}
