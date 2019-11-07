package com.cybertek.tests.day4_basicLocators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocatorTest {
    public static void main(String[] args) {
        WebDriver  driver = WebDriverFactory.getDriver("chrome");

        //navigate to webside
        driver.get("http://practice.cybertekschool.com/sign_up");
        WebElement fullnameInput= driver.findElement(By.name("full_name"));
        fullnameInput.sendKeys("Mike Smith");
        WebElement email =driver.findElement(By.name("email"));
        email.sendKeys("ali@gmail.com");
        WebElement singupBuuton =driver.findElement(By.name("wooden_spoon"));
        /**


        WebElement messageElemant =driver.findElement(By.name("signup_message"));
        String actualMessage = messageElemant.getText();
        //expected Message
        String expectedMessage ="Thank you for signing up. Click the button below to return to the home page124.";

        if(expectedMessage.equals(actualMessage)){
            System.out.println("Pass");
        }else {
            System.out.println("fail");
            System.out.println("actualMessage" +actualMessage);
            System.out.println("expectedMessage "+expectedMessage);
        }**/

//task
        //verify that you got "Thank you for signing up. Click the button below to return to the home page."
        WebElement messageElement = driver.findElement(By.name("signup_message"));
        String actualMessage = messageElement.getText();
        //expected message
        String expectedMessage = "Thank you for signing up. Click the button below to return to the home page.";
        if (expectedMessage.equals(actualMessage)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expectedMessage = " + expectedMessage);
            System.out.println("actualMessage = " + actualMessage);
        }
        //close the browser
        driver.quit();


    }



}
