package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationDemo {
    public static void main(String[] args) throws InterruptedException {
         //setting up the browser
        WebDriverManager.chromedriver().setup();
        //import class CMD+ENTER or ALT+enter or CONTROL +SPACE
        //selenium object
        WebDriver driver = new ChromeDriver();
        //navigate to website
        driver.get("https://www.amazon.com");

driver.navigate().to("https://www.facebook.com");

driver.navigate().back();
  Thread.sleep(3000);
driver.navigate().forward();

driver.navigate().refresh();



    }




}
