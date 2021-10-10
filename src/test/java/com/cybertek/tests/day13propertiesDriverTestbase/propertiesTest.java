package com.cybertek.tests.day13propertiesDriverTestbase;

import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class propertiesTest {
    @Test
    public void test(){
        String browser = ConfigurationReader.get("browser");
        System.out.println(browser);
        System.out.println(ConfigurationReader.get("url"));
        System.out.println(ConfigurationReader.get("salemanager_username"));

    }


}
