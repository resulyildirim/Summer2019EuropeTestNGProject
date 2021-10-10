package com.cybertek.tests.day7typeofElement;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class denemeradioButton {

    @Test
    public void radioButton() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blueRButton = driver.findElement(By.id("blue"));
        WebElement redRButton = driver.findElement(By.id("red"));

        System.out.println("is blue selected :" + blueRButton.isSelected());
        System.out.println("is red selected :" + redRButton.isSelected());
        //verify that blue radio button selected
        Assert.assertTrue(blueRButton.isSelected(), "verify that blue radio button selected");
        Assert.assertFalse(redRButton.isSelected(), "verify that red radio button selected");

        redRButton.click();


    }

    @Test
    public void test2() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        WebElement inputbox = driver.findElement(By.cssSelector("#input-example>input"));
        System.out.println("is input  enable "+inputbox);
        inputbox.sendKeys("Mike");
    }
}