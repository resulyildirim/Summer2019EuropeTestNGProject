package com.cybertek.tests.day2_webdriver_basics;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getUrlandTitle {
    public static void main(String[] args) {

      /*  WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("http://practice.cybertekschool.com");
    //get title of page
        String title= driver.getTitle();

        System.out.println("title = " + title);
        //get the current url of page
        String currentUrl =driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);*/
      WebDriverManager.chromedriver().setup();
      WebDriver driver=new ChromeDriver();
      driver.get("http://practice.cybertekschool.com");

      String Title =driver.getTitle();
        System.out.println("Title = " + Title);
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        String  pagesourse= driver.getPageSource();
        System.out.println(pagesourse);






    }
}
