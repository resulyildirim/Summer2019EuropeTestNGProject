package com.cybertek.tests.day11action_jsexecutev;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HoverTest {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(2000);
        //driver.quit();
    }
    @Test
    public void test1() {
        driver.get("http://practice.cybertekschool.com/hovers");
        WebElement img = driver.findElement(By.tagName("img"));
        Actions actions = new Actions(driver);
        actions.moveToElement(img).perform();
        WebElement text = driver.findElement(By.xpath("//h5[.='name: user1']"));
        Assert.assertTrue(text.isDisplayed());
    }

    @Test
    public void test2() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/hovers");
        for (int i=1;i<4;i++){
            //create dynamic xpath using  i
            String imgXpath ="(//img)["+i+"]";
            System.out.println(imgXpath);
            //passing xpath to webElement
            WebElement img =driver.findElement(By.xpath("imgXpath"));
            //create actions object
            Actions actions=new Actions(driver);
            Thread.sleep(3000);
            //hovering over on the picture
            actions.moveToElement(img).perform();

            //creating  dynamic xpath for text
            String textXpath ="//h5[.='name: user" + i + "']";
            System.out.println(textXpath);
        }

//        for (int i = 1; i < 4; i++) {
//            //creating dynamic xpath using i
//            String imageXpath = "(//img)[" + i + "]";
//            System.out.println("after combining string" + imageXpath);
//            //passing xpath to weblement
//            WebElement img = driver.findElement(By.xpath(imageXpath));
//            //creating actions object
//            Actions actions = new Actions(driver);
//            Thread.sleep(1000);
//            //hovering over on the image
//            actions.moveToElement(img).perform();
//            //creating dynamic xpath for the text
//            String textXpath = "//h5[.='name: user" + i + "']";
//            System.out.println("textXpath = " + textXpath);
//            //passing xpath to webelement
//            WebElement text = driver.findElement(By.xpath(textXpath));
//            //verifying text is displayed
//            Assert.assertTrue(text.isDisplayed());
        //}
    }

    @Test
    public void StaleTest() {
        driver.get("http://google.com");
        WebElement input = driver.findElement(By.name("q"));
        input.sendKeys("Selenium" + Keys.ENTER);
        WebElement results = driver.findElement(By.id("resultStats"));
        Assert.assertTrue(results.isDisplayed());
        //go to google second time
        driver.navigate().back();
        input = driver.findElement(By.name("q"));
        input.sendKeys("Java" + Keys.ENTER);

    }
}






