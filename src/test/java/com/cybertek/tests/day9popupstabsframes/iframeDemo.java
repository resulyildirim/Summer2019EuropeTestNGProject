package com.cybertek.tests.day9popupstabsframes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class iframeDemo {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
        //driver.quit();
    }

    @Test
    public void test1() {
       driver.get("http://practice.cybertekschool.com/iframe");
       driver.switchTo().frame(0);
       driver.findElement(By.id("tinymce")).sendKeys("Aloooooooooooooooo");
       driver.findElement(By.id("tinymce")).clear();
       driver.switchTo().parentFrame();
        WebElement webFrame =driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(webFrame);
        driver.findElement(By.id("tinymce")).clear();
        driver.findElement(By.id("tinymce")).sendKeys("Hellooooooo");
        driver.switchTo().defaultContent();
        driver.switchTo().frame("mce_0_ifr");
        driver.findElement(By.id("tinymce")).sendKeys("Aloooooooooooo");
    }
    @Test
    public void multipleFrame(){
        driver.get("http://practice.cybertekschool.com/nested_frames");
        //driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        System.out.println(driver.findElement(By.id("content")).getText());
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-left");
        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame-bottom");
    }
}