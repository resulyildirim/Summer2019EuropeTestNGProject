package com.cybertek.tests.day2_webdriver_basics;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeAndQuit {
    public static void main(String[] args) throws InterruptedException {

       /* WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

       driver.get("https://practice.cybertekschool.com");
       Thread.sleep(3000);
       //close()--> close the current tab
       driver.close();
       //after close browers  for new  one
        driver =new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/open_new_tab");
        Thread.sleep(5000);
        //quit() close allopen windows and tabs and pop ups
        driver.quit();*/

        WebDriver driver1 = WebDriverFactory.getDriver("chrome");
        driver1.get("http://www.ebay.com ");
        System.out.println(driver1.getTitle());
        Thread.sleep(3000);
        driver1.quit();
        //driver1.close();

    }
}
