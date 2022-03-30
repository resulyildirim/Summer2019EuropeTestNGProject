package com.cybertek.tests.deneme;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homework {
    public static void main(String[] args) {
        //Go to the login page of VyTrack
        // •Enter valid credential (can be any role)
        // •Click login button •Verify that the user login successfully
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("http://qa1.vytrack.com/user/login");
        WebElement loginBox= driver.findElement(By.id("prependedInput"));
         //loginBox.sendKeys("resul");
         loginBox.sendKeys("user4");
          WebElement loginPass =driver.findElement(By.id("prependedInput2"));
          loginPass.sendKeys("UserUser123");
          WebElement login =driver.findElement(By.id("_submit"));
          login.click();
         // WebElement clickModule =driver.findElement(By.xpath("//span[@class='title title-level-1']"));
          //clickModule.click();
          WebElement launch =driver.findElement(By.className("oro-subtitle"));
          System.out.println(launch.getText());

          String expectedUrl="https://qa1.vytrack.com/";
          String  actualUrle =driver.getCurrentUrl();
          if(expectedUrl.equals(actualUrle)){
              System.out.println("PASS");
          }else{
              System.out.println("Fail");
          }


    }





}
