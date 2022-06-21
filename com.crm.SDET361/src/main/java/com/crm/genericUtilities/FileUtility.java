package com.crm.genericUtilities;

import java.io.FileInputStream;
import java.util.Properties;
/**
 * 
 * @author Darshan
 *
 */
public class FileUtility {
	/**
	 * it is used to get common data from property file based on the key which you have specified as a argument
	 * @return
	 */
	public String getPropertyKeyValue(String key) throws Throwable {
		FileInputStream fileInputStream=new FileInputStream(".\\src\\test\\resources\\data.properties.txt");
		Properties pres=new Properties();
		pres.load(fileInputStream);
		
		String value=pres.getProperty(key);
		return value;
	}
}