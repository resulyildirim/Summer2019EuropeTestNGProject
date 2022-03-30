package com.cybertek.tests.day9popupstabsframes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class switchWindow {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
       // driver.quit();
    }
    @Test
    public void onewindow(){
        driver.get("http://practice.cybertekschool.com/windows");
        System.out.println("Before clicking the link " + driver.getTitle());
        //clicking click here link
        driver.findElement(By.linkText("Click Here")).click();
        System.out.println("After clicking the link " + driver.getTitle());
        String a=driver.getWindowHandle();
        String currentWindowHandle= driver.getWindowHandle();
        System.out.println(currentWindowHandle);

        Set<String> windowHandle=driver.getWindowHandles();
        System.out.println(windowHandle.size());
        for (String winhandle:windowHandle){
            if(!currentWindowHandle.equals(winhandle)){
                System.out.println(winhandle);
                driver.switchTo().window(winhandle);
            }
        }


    }
    @Test
    public void moreWindow(){
        driver.get("http://practice.cybertekschool.com/windows");
        String targetWindowTitle = "New Window";
        driver.findElement(By.linkText("Click Here")).click();
        Set<String>winHandles=driver.getWindowHandles();
        for (String handelWindows:winHandles){
            driver.switchTo().window(handelWindows);
            if(driver.getTitle().equals(targetWindowTitle)){
                //if they are equal stop looping.I want to keep that window driver.
                break;
            }
            System.out.println(handelWindows);

        }

    }
}
