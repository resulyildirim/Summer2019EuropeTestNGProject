package com.cybertek.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties;

    static {
        try {
            //what file to read
            String path = "configuration.properties";
            //read the file into java,finds the file using the string path
            FileInputStream input = new FileInputStream(path);
            //properties-->class that store properties in key/value format
            properties = new Properties();
            //the values from the file input is loaded fed in to the prooerties object
            properties.load(input);

            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static String get(String keyName){
        return properties.getProperty(keyName);
    }
    }





