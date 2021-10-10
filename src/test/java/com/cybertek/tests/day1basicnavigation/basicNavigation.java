package com.cybertek.tests.day1basicnavigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicNavigation {

    public static void main(String[] args) {

        /*WebDriverManager.chromedriver().setup();
      //creating object for using selenium driver
        WebDriver driver=new ChromeDriver();

        // open browser
        driver.get("https://www.amazon.com");
        // get the title and print
        System.out.println(driver.getTitle());
       */

    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle());

        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();

       // driver.get("https://frontend.nopcommerce.com/");
       // System.out.println(driver.getTitle());









    }

}
