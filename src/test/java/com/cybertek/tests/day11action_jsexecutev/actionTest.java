package com.cybertek.tests.day11action_jsexecutev;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class actionTest {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
        //driver.quit();
    }

    @Test
    public void hoverTest() {
        driver.get("http://practice.cybertekschool.com/hovers");
        //Actions --> class that contains all the user interactions
        //how to create actions object/ passing driver as a constructor
        Actions actions = new Actions(driver);
        WebElement img = driver.findElement(By.tagName("img"));
        //perform() --> perform the action. complete the action
        //moveToElement() --> move your mouse to webelement(hover over)
        actions.moveToElement(img).perform();
        Assert.assertTrue(driver.findElement(By.linkText("View profile")).isDisplayed(), "verify view profile displayed");
    }

    //https://demos.telerik.com/kendo-ui/dragdrop/index for hover over and drop and down
    @Test
    public void DragAndDrop() {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        //how to create actions object/ passing driver as a constructor
        Actions actions = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable"));

        WebElement target = driver.findElement(By.id("droptarget"));
        actions.pause(1000);
        //we have to provide source and target to this method , it will drag and drop
        actions.dragAndDrop(source, target).perform();



    }

    @Test
    public void DragAndDropChaaining() {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        //how to create actions object/ passing driver as a constructor
        Actions actions = new Actions(driver);
        //we drag this  element(sourse)
        WebElement source = driver.findElement(By.id("draggable"));
        //we drop here (target)
        WebElement target = driver.findElement(By.id("droptarget"));
        //pause ()--> waiting just like threat.sleep
        actions.pause(1000);
        //we have to provide source and target to thids method , it will drag and drop
        //if you are  chaining
        actions.moveToElement(source).clickAndHold().moveToElement(target).release().build().perform();

    }
    @Test
    public void demo(){
        driver.get("https://qa1.vytrack.com/");
        WebElement username=driver.findElement(By.id("prependedInput"));
        username.sendKeys("user4");
        WebElement password =driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123");
        WebElement login =driver.findElement(By.id("_submit"));
        login.click();
        Actions actions=new Actions(driver);
        WebElement fleet =driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
        WebElement costumer=driver.findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
        WebElement activities =driver.findElement(By.xpath("(//span[@class='title title-level-1'])[3]"));
        actions.pause(3000);
       actions.moveToElement(fleet).moveToElement(costumer).moveToElement(activities).build().perform();
        // model.click();
       // WebElement account =driver.findElement(By.xpath("//span[contains(text(),'Accounts')]"));
       // account.click();
       // actions.moveToElement(model).click().moveToElement(account).build().perform();

    }

    @Test
    public void DragAndDropFleet() {
        driver.get("https://qa1.vytrack.com/");
        //how to create actions object/ passing driver as a constructor
        WebElement username= driver.findElement(By.id("prependedInput"));
        username.sendKeys("user4");
        WebElement password =driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123");
        WebElement login =driver.findElement(By.id("_submit"));
        login.click();
        Actions actions=new Actions(driver);
        //WebElement sors=driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[4]/a/span"));
        WebElement sors=driver.findElement(By.xpath("//span[@class='title title-level-1'][1]"));

        actions.moveToElement(sors).perform();

        //Actions actions = new Actions(driver);
    }
}




















