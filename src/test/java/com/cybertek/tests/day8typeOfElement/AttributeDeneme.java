package com.cybertek.tests.day8typeOfElement;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AttributeDeneme {
@Test
    public void test1(){
    WebDriver driver= WebDriverFactory.getDriver("chrome");
    driver.get("  http://practice.cybertekschool.com/radio_buttons");
    WebElement radioButton =driver.findElement(By.id("blue"));
    System.out.println(radioButton.getAttribute("type"));


}


}
