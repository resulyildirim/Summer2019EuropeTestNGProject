package com.cybertek.tests.day5Xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathTest {

    public static void main(String[] args) {
        WebDriver driever = WebDriverFactory.getDriver("chrome");
        driever.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement homelink =driever.findElement(By.xpath("/html/body/nav/ul/li/a"));
        homelink.click();

        WebElement button3= driever.findElement(By.xpath("//button[@onclick='button3()']"));
        button3.click();





    }
}
