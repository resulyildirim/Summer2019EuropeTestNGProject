package com.cybertek.tests.day8typeOfElement;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class checkboxdeneme {

    @Test
    public void test1(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement checkbox1 =driver.findElement(By.xpath("//input[1]"));
        WebElement checkbox2 =driver.findElement(By.xpath("//input[2]"));
        //verify that Checkbox 1 is unselected and 2 is selected
        Assert.assertFalse(checkbox1.isSelected(),"verifythat 1 is not selected");
        Assert.assertTrue(checkbox2.isSelected(),"verify that 2 is selected");

        checkbox1.click();

        Assert.assertTrue(checkbox1.isSelected(),"verifythat 1 is not selected");
        Assert.assertTrue(checkbox2.isSelected(),"verify that 2 is selected");




    }





}
