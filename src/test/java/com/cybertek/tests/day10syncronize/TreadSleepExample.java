package com.cybertek.tests.day10syncronize;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TreadSleepExample {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void InterruptedExeption() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dynamic_loading/3");
        //wait for 3 second
        Thread.sleep(6000);
        driver.findElement(By.id("username")).sendKeys("makil Beslaemez");

    }
    @Test
    public void test() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dynamic_loading/4");
        //Thread.sleep(9000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String massage =driver.findElement(By.id("finish")).getText();
        System.out.println(massage);



    }

}