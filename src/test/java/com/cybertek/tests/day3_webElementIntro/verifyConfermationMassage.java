package com.cybertek.tests.day3_webElementIntro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyConfermationMassage {
    /**
     * Verify confirmation message
     * open browser
     * go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
     * enter any email
     * verify that email is displayed in the input box
     * click on Retrieve password
     * verify that confirmation message says 'Your e-mail's been sent!'
     */

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailInputbox = driver.findElement(By.name("email"));

        String expectedEmail = "test@gmail.com";
        emailInputbox.sendKeys(expectedEmail);

        //String actualEmail =emailInputbox.getText(); normally use this one
        String actualEmail = emailInputbox.getAttribute("value");

        if (expectedEmail.equals(actualEmail)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        System.out.println("expectedEmail" + expectedEmail);
        System.out.println("actualEmail" + actualEmail);
        //locattind retrievePasswordButton usin id Attrubute

        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();
        //verify that confirmation message says 'Your e-mail's been sent!'
        String expectedMassage = "Your e-mail's been sent!";

        WebElement massageElement = driver.findElement(By.name("confirmation_message"));

        String actualMessage = massageElement.getText();

        System.out.println(actualMessage);

        if (expectedMassage.equals(actualMessage)) {
            System.out.println("expectedMassage" + expectedEmail);
        } else {
            System.out.println("actualMessage" + actualMessage);
        }


        driver.quit();
    }

}
