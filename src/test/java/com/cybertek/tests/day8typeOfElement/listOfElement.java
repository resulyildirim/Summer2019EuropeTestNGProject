package com.cybertek.tests.day8typeOfElement;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class listOfElement {

    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        List<WebElement>buttoms =driver.findElements(By.tagName("button"));
        System.out.println(buttoms.size());
        Assert.assertEquals(buttoms.size(),6);
        for(WebElement btn:buttoms){
            System.out.println(btn.getText());
        }

//        List<WebElement> buttons=driver.findElements(By.tagName("button"));
//        System.out.println(buttons.size());
//        //verify that you got 6 webelement
//        Assert.assertEquals(buttons.size(), 6,"verify we got 6 buttons");
//
//        for (WebElement button : buttons) {
//            System.out.println(button.getText());
//        }
//
//        driver.quit();
    }
    @Test
    public void test2(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //wrong locator but we are not getting any error , we getting empty element list
        List<WebElement> buttons=driver.findElements(By.tagName("buttones"));
        System.out.println(buttons.size());

    }

}