package com.cybertek.tests.day3_webElementIntro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyUrlnotChangeed {
    /**Verify URL not changed
     open browser
     go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
     click on Retrieve password
     verify that url did not change

     *
     *
     */


    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        String expectedUrl = driver.getCurrentUrl();

        WebElement retrievePasswordButton =driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();
        String actualUlr =driver.getCurrentUrl();

        if (expectedUrl.equals(actualUlr)){
            System.out.println(" Pass");
        }else {
            System.out.println("Fail");
        }

        //close the broswer
        driver.quit();





    }




}
