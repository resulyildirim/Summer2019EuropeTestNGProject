package com.cybertek.tests.day9popupstabsframes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PopupsAndAlerts {
    WebDriver driver;
 @BeforeMethod
 public void setUpMethod(){
      driver=WebDriverFactory.getDriver("chrome");
 }
 @AfterMethod
         public void teaddownMethod(){

 }
    @Test
    public void test1() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");

        driver.findElement(By.xpath("//*[text()='Destroy the World']")).click();
// click no button
        driver.findElement(By.xpath("//*[taxt()='No']"));

    }
        @Test
        public void Alart() throws InterruptedException {
            driver.get("http://practice.cybertekschool.com/javascript_alerts");
            //click forJS Alet
            driver.findElement(By.xpath("//button[1]")).click();
            Alert alert =driver.switchTo().alert();
            alert.accept();
            driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
            alert.dismiss();

            driver.findElement(By.xpath("//button[3]")).click();
            driver.switchTo().alert();
            alert.sendKeys("Nurefsan yildirim");
            alert.accept();

          //controling alert using with Alert class
           //accept alert --->clicking ok in the alerts
//            Alert alert =driver.switchTo().alert();
//           alert.accept();
//           Thread.sleep(2000);
//           //click JS confirm
//            driver.findElement(By.xpath("//button[2]")).click();
//            //click x to close ,selecting ok/cancel
//            alert.dismiss();
//
//            driver.findElement(By.xpath("//button[3]")).click();
//            alert=driver.switchTo().alert();
//            alert.sendKeys("Mike Smith");
//            alert.accept();
        }
    }

