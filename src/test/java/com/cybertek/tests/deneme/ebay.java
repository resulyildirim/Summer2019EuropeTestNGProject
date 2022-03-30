package com.cybertek.tests.deneme;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebay {
    public static void main(String[] args) {
        // enter search term
        // click on search button
        // print number of results
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.ebay.co.uk");
        WebElement searchterm = driver.findElement(By.xpath("//input[@type='text']"));
        searchterm.sendKeys("books");
        WebElement searchbutton=driver.findElement(By.xpath("//input[@type='submit']"));
        searchbutton.click();
        WebElement print =driver.findElement(By.tagName("h1"));
       // String  yaz= print.getText();
        System.out.println(" Result:" +print.getText());
        WebElement al =driver.findElement(By.partialLinkText("Sell"));
        al.click();
        driver.quit();
    }
}