package com.qa.proverobject;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class UserNamePassword {
	
    	 
			
    public static void main(String[] args) throws IOException {
    	//UserNamePassword up=new UserNamePassword();
    	FileInputStream fs = new FileInputStream("E://Yadav Selenium//CSYadavProjectwebdrive//TestVersion//src//com/win//config//config.properties");
		 System.out.println(fs.toString());
		Properties pro=new Properties();

		pro.load(fs);
		  //   pro.getProperty("username")
		     System.out.println(pro.getProperty("username"));
		     System.out.println(pro.getProperty("password"));

	}
}
