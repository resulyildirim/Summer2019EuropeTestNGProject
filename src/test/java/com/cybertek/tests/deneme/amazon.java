package com.cybertek.tests.deneme;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
    public static void main(String[] args) {
       /** go to amazon
        Go to ebay
        enter search term
        click on search button
        verify title contains search term
        **/
       WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://www.amazon.com");
        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("movei");
        System.out.println(searchBox.getText());
       // String Title= driver.getTitle();


    }
}
