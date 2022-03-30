package com.cybertek.tests.day3_webElementIntro;

import com.cybertek.utilities.WebDriverFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class denemeUrlnotChange {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("http://www.amazon.com");
        WebElement searchbox = driver.findElement(By.xpath("//span[@dir='auto']"));
        searchbox.sendKeys("selenium");
        WebElement ClickButton = driver.findElement(By.xpath("//span[@dir='auto']"));
        ClickButton.click();


        // driver.quit();

    }

}

