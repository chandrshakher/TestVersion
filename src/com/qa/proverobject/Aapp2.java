package com.qa.proverobject;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Aapp2 {

	public static void main(String[] args) {
		try (InputStream input = Aapp2.class.getClassLoader().getResourceAsStream("user.div" +"../config.properties")) {

            Properties prop = new Properties();

            if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
                return;
            }

            //load a properties file from class path, inside static method
            prop.load(input);

            //get the property value and print it out
            System.out.println(prop.getProperty("username"));
            System.out.println(prop.getProperty("password"));

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}