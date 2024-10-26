package org.zorba.propertiesFileOperation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromProperties {
    public static void main(String[] args) {
        try {
            File file = new File("/Users/abhishekgayen/Zorbra_Softed/1016_Batch/Java_1016_Batch_Class_Notes/FileInputOutputOperations/src/main/resources/application.properties");
            FileInputStream fileInputStream = new FileInputStream(file);
            //create Properties file Object
            Properties properties = new Properties();
            //Load to properties file
            properties.load(fileInputStream);
            //Read the data from the file
            String userName = properties.getProperty("username");
            String password = properties.getProperty("password");
            System.out.println(userName + " " + password);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
