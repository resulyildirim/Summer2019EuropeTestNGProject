package com.cybertek.tests.day3_webElementIntro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyUrlChanaged {
    /**
     Verify URL changed
     open browser
     go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
     enter any email
     click on Retrieve password
     verify that url changed to http://practice.cybertekschool.com/email_sent

     *
     */

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get(" http://practice.cybertekschool.com/forgot_password");
        WebElement email= driver.findElement(By.name("email"));
        email.sendKeys("email@gmail.com");

        WebElement inputpass =driver.findElement(By.id("form_submit"));
        inputpass.click();
         WebElement massage=driver.findElement(By.name("confirmation_message"));
        System.out.println("massage.getText = " + massage.getText());


//        //enter  any email
//        WebElement email =driver.findElement(By.name("email"));
//       email.sendKeys("email@gmail.com");
//
//       // WebElement emailInput = driver.findElement(By.name("email"));
//        //emailInput.sendKeys("email@gmail.com");
//
//        WebElement retrievePassword = driver.findElement(By.id("form_submit"));
//        retrievePassword.click();
//
//        String expectedUrl ="http://practice.cybertekschool.com/email_sent";
//        String  actualUrl = driver.getCurrentUrl();
//        if (expectedUrl.equals(actualUrl)){
//            System.out.println("PASS");
//
//
//
//        }else{
//            System.out.println("Fail");
//        }

        //close
      //  driver.quit();

    }


}
