package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {
	private static Properties properties;
	 private static final String propertyFilePath= "C:\\Users\\ronit\\OneDrive\\Desktop\\Orange HRM mini project\\Configurations\\config.properties";
	 
	 
	 public static Properties readPropertiesfile(){
	 BufferedReader reader;
	 try {
	 reader = new BufferedReader(new FileReader(propertyFilePath));
	 properties = new Properties();
	 try {
		 	properties.load(reader);
		 	reader.close();
	 } catch (IOException e) {
		 				e.printStackTrace();
	 }
	 } catch (FileNotFoundException e) {
	 e.printStackTrace();
	 
	 throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
	 }
	 return properties;
}
}