package utilities;

import java.util.Properties;

public class AccessPropertiesFile {

	static Properties prop=PropertiesFileReader.readPropertiesfile();
    /*
     Functions for reading properties file
     */

	//Function for accessing URL
	public static  String getUrl(){
		 String url = prop.getProperty("url");
		 if(url!= null) return url;
		 else throw new RuntimeException("driverPath not specified in the Config.properties file."); 
		 }
	
	//Function for accessing email
	public static String getUsername()
	{
			String uName=prop.getProperty("username");
			if(uName!=null) return uName;
			else throw new RuntimeException("Username not specified in the Config.properties file.");
	}
	
	//Function for accessing password
	public static String getPassword()
	{
			String pass = prop.getProperty("password");	
			if(pass!=null) return pass;
			else throw new RuntimeException("password not specified in the Config.properties file.");
	}
	
	
	public static String firstname() {
		String fName=prop.getProperty("firstName");
		if(fName!=null) return fName;
		else throw new RuntimeException("First Name not specified in the Config.properties file.");
	}
	
	
	public static String lastname() {
		String lName=prop.getProperty("lastName");
		if(lName!=null) return lName;
		else throw new RuntimeException("First Name not specified in the Config.properties file.");
	}
	
	//Function for accessing browser
	public static String getBrowser()
	{
			String browser = prop.getProperty("browser");	
			if(browser!=null) return browser;
			else throw new RuntimeException("browser not specified in the Config.properties file.");
	}
	
	//Function for accessing firefox_driverpath
	public String getFirefoxPath()
	{
			String firefoxpath = prop.getProperty("firefox_driverpath");	
			if(firefoxpath!=null) return firefoxpath;
			else throw new RuntimeException("firefox path not specified in the Config.properties file.");
	}
	
	//Function for accessing chrome_driverpath
	public String getChromePath()
	{
			String chromepath = prop.getProperty("chrome_driverpath");		
			if(chromepath!=null) return chromepath;
			else throw new RuntimeException("chrome path not specified in the Config.properties file.");
	}
	
	//Function for accessing opera_driverpath
	public String getOperaPath()
	{
			String operapath = prop.getProperty("opera_driverpath");		
			if(operapath!=null) return operapath;
			else throw new RuntimeException("Opera Path not specified in the Config.properties file.");
	}
}
