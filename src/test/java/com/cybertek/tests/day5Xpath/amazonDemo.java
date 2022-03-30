package com.cybertek.tests.day5Xpath;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class amazonDemo {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://www.amazon.com");
        WebElement inbox=driver.findElement(By.id("twotabsearchtextbox"));
        inbox.sendKeys("iphone");
        WebElement clickButton=driver.findElement(By.xpath("//input[@value='Go']"));
        clickButton.click();
        WebElement  text =driver.findElement(By.xpath("//span[contains(text(),'results for')]"));
        String metin =text.getText();
        System.out.println(metin);
    }
}
