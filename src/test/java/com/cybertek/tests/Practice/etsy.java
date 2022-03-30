package com.cybertek.tests.Practice;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class etsy {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://etsy.com");
        //WebElement inputbox= driver.findElement(By.id("global-enhancements-search-query"));
        WebElement clickAccept= driver.findElement(By.xpath("//button[@class='width-full btn btn-outline btn-outline-black']"));
      clickAccept.click();

      WebElement signIn=driver.findElement(By.id("sign-in"));
      signIn.click();
      WebElement input =driver.findElement(By.xpath("//input[@id='join_neu_email_field']"));
      input.sendKeys("ser@gmail.com");
      WebElement password= driver.findElement(By.xpath("//input[@id='join_neu_password_field']"));
      password.sendKeys("54621jhdk");

       // driver.quit();
    }
}
