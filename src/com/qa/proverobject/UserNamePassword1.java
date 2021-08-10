package com.qa.proverobject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UserNamePassword1 {
	  public static FileInputStream fs;
	  public static Properties prop;
	  
   public static void getUserPassord(){
	     try {
			FileInputStream fs=new FileInputStream("E://Yadav Selenium//CSYadavProjectwebdrive//TestVersion//src//com/win//config//config.properties");
			 prop=new Properties();
				prop.load(fs);
				System.out.println(prop.getProperty("username"));
	     }
			 catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	          
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		UserNamePassword1.getUserPassord();
		System.out.println("amber->"+prop.getProperty("username"));

	}

}
