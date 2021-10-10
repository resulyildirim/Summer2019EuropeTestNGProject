package com.cybertek.tests.day13propertiesDriverTestbase;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class singletonTest {

    @Test
    public void test(){
        String s1 = singleton.getInstance();
        String s2 = singleton.getInstance();

        System.out.println("s1 ="+s1);
        System.out.println("s2 ="+s2);

    }
    @Test
    public void test2(){
        //this is how we create webdriver object from now on
        //yepe of the driver will come from configuration.properties file
        WebDriver driver= Driver.get();
        //we are getting url from configuration.properties file
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().navigate().refresh();

    }
@Test
    public void test3() throws InterruptedException {
        Thread.sleep(3000);
         Driver.get().get("http://amazon.com");
}

}
