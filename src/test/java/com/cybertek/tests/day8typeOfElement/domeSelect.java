package com.cybertek.tests.day8typeOfElement;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class domeSelect {
    @Test
    public void test1() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.oddsking.com/registration");
        WebElement dropdownElm = driver.findElement(By.id("state"));
        Select listOfState = new Select(dropdownElm);
        List<WebElement> options = listOfState.getOptions();
        System.out.println(options.get(2).getText());
        for (WebElement option : options) {
            System.out.println(option.getText());
        }
    }
}