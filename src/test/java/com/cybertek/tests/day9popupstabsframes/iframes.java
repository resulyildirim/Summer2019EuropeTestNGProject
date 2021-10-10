package com.cybertek.tests.day9popupstabsframes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class iframes {
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
   public void demo1() {
        driver.get("http://practice.cybertekschool.com/iframe");

//        driver.switchTo().frame("mce_0_ifr");
//        driver.findElement(By.id("tinymce")).sendKeys("ALOOOOO");
//
//        driver.switchTo().defaultContent();
//        driver.switchTo().frame(0);
//        driver.findElement(By.id("tinymce")).clear();
//        driver.findElement(By.id("tinymce")).sendKeys("Mike");
//        driver.switchTo().parentFrame();
//
//        WebElement frameElement =driver.findElement(By.tagName("iframe"));
//        driver.switchTo().frame(frameElement);
//        driver.findElement(By.id("tinymce")).sendKeys(" from webelemnet");
//    }
    }

    @Test
    public void test1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/iframe");
        //How to switch frame
        //1.Switch by using name or id attribute of iframe
        driver.switchTo().frame("mce_0_ifr");
        //clear text
        driver.findElement(By.id("tinymce")).clear();
//locate and send text
       driver.findElement(By.id("tinymce")).sendKeys("Heelooo");
        // go back ti first frame,useful when we have switched multiple
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        //2.way index
        driver.switchTo().frame(0);
        driver.findElement(By.id("tinymce")).clear();
//locate and send text
        driver.findElement(By.id("tinymce")).sendKeys("jonnnn");
        //go back to first frame , only to parant
        driver.switchTo().parentFrame();
        //3.way Webelement
        //laocating iframe with any valid locator
        WebElement frameElement = driver.findElement(By.tagName("iframe"));
        Thread.sleep(2000);
        //passing frame as a webelement
        driver.switchTo().frame(frameElement);
        driver.findElement(By.id("tinymce")).clear();
        //locate and send some text
        driver.findElement(By.id("tinymce")).sendKeys("We Located with WebElement");
    }
    @Test
    public void demeMiltibleFrame(){
        driver.get("http://practice.cybertekschool.com/nested_frames");
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-right");
        System.out.println(driver.findElement(By.tagName("body")).getText());
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);

    }

    @Test
    public void multipleFrame() {
        driver.get("http://practice.cybertekschool.com/nested_frames");
        //switch to fram top
        driver.switchTo().frame("frame-top");
        //frame top has 3 childen frame left middle and right
        //switch the middle
        driver.switchTo().frame("frame-middle");
        //get the middle text and print it
        System.out.println(driver.findElement(By.id("content")).getText());
        //go back to parent (top frame)to switch right
        driver.switchTo().parentFrame();
        //switching right using index
        driver.switchTo().frame(2);
        //print right from right frame
        System.out.println(driver.findElement(By.tagName("body")).getText());
        //go up to top level html directly
        driver.switchTo().defaultContent();

        //switch to frame bottom
        driver.switchTo().frame(1);
        System.out.println(driver.findElement(By.tagName("body")).getText());




    }
}



