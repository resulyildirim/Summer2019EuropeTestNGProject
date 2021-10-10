package com.cybertek.tests.day7typeofElement;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisabledElementTest {

    @Test
    public void test1() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://wwww.practice.cybertekschool.com/radio_buttons");
        WebElement greenRadioButton= driver.findElement(By.id("green"));

        //how can we check
        System.out.println("Is element enable: "+greenRadioButton.isEnabled());
        Assert.assertFalse(greenRadioButton.isSelected(),"verify that green button is disable");
    }
    @Test
    public void test2(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        WebElement inputBox =driver.findElement(By.xpath("//input[@type='text']"));
        System.out.println("is input ebabled : "+inputBox);
        inputBox.sendKeys("Mike Joarden");
    }
}