package com.cybertek.tests.day4_basicLocators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassLocatorTest {
    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //navigate to webside
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement homelink =driver.findElement(By.className("nav-link"));
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement messageElement =driver.findElement(By.className("h3"));
        String  messaga =messageElement.getText();
        System.out.println(messaga);
        //2.way
        System.out.println(driver.findElement(By.className("h3")).getText());






    }
}
