package com.cybertek.tests.day7typeofElement;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest {

    @Test
    public void test1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blueRadioButton =driver.findElement(By.id("blue"));
        WebElement redRadioButton =driver.findElement(By.id("red"));
        //how to check radio button selected or not ?
        System.out.println("is blue selected: "+blueRadioButton.isSelected());
        System.out.println("is red selected: "+redRadioButton.isSelected());
        //verify that blue radio button sellected
        Assert.assertTrue(blueRadioButton.isSelected()," verify that blue radio button sellected");
        //verify that red radio button not selected ?
        Assert.assertFalse(redRadioButton.isSelected(),"verify that red button selected");
       //how to select radio button ?
        System.out.println("click red radio button");
        redRadioButton.click();


        System.out.println("is blue selected: "+blueRadioButton.isSelected());
        System.out.println("is red selected: "+redRadioButton.isSelected());
        //veryfy blue is not selected
        Assert.assertFalse(blueRadioButton.isSelected(),"verify that blue radio not button sellected");

        driver.quit();

    }
}
