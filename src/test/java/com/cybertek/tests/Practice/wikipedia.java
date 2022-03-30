package com.cybertek.tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;

public class wikipedia {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("http://www.wikipedia.org");
        WebElement searchTerm =driver.findElement(By.xpath("//input[@id='searchInput']"));
        searchTerm.sendKeys("selenium webdriver");
        WebElement searchbutton=driver.findElement(By.xpath("//i[@class='sprite svg-search-icon']"));
        searchbutton.click();

    }


}
