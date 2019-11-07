package com.cybertek.tests.day4_basicLocators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkTextAndParcialText {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //navigate to website
        driver.get("http://practice.cybertekschool.com/dynamic_loading");
//        WebElement link3 = driver.findElement(By.linkText("Example 3: Element on page that is hidden and become visible after 5 seconds"));
//        link3.click();
        //lazy way of clicking home
        //driver.findElement(By.linkText("Home")).click();
        //partial link text
        WebElement link6 = driver.findElement(By.partialLinkText("Example 6"));
        link6.click();

    }



}
