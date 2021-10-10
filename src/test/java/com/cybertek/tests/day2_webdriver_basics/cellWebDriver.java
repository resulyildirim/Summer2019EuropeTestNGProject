package com.cybertek.tests.day2_webdriver_basics;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cellWebDriver {
    public static void main(String[] args) {

     /* WebDriver driver = WebDriverFactory.getDriver("chrome");
       driver.get("http://www.google.com");

        driver=new ChromeDriver();
        driver.get("https://etsy.com");*/



    /* WebDriver driver =WebDriverFactory.getDriver("chrome");
     driver.get("http://www.ebay.co");
        System.out.println(driver.getTitle());*/

      WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.com");
        System.out.println(driver.getTitle());



    }




}
