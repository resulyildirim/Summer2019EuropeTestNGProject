package com.cybertek.tests.esty;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class assertDropbox {
    @Test
    public void test1() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://etsy.com");
        //WebElement inputbox= driver.findElement(By.id("global-enhancements-search-query"));
        WebElement clickAccept = driver.findElement(By.xpath("//button[@class='width-full btn btn-outline btn-outline-black']"));
        clickAccept.click();

        WebElement dropdown=driver.findElement(By.cssSelector("#catnav-primary-link-10923"));
        Select choose =new Select(dropdown);

        List<WebElement>list= choose.getOptions();
        System.out.println(list.size());

        for (WebElement webElem : list) {
            System.out.println(webElem.getText());

        }


    }
}