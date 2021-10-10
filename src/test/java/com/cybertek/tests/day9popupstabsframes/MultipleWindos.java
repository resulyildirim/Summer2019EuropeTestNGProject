package com.cybertek.tests.day9popupstabsframes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.Set;
public class MultipleWindos {


    public class MultipleWindows {
        WebDriver driver;

        @BeforeMethod
        public void setUpMethod() {
            driver = WebDriverFactory.getDriver("chrome");
        }

        @AfterMethod
        public void tearDownMethod() throws InterruptedException {
            Thread.sleep(3000);
            driver.quit();
        }

        @Test
        public void switchwin() {
            driver.get("");
        }

        @Test
        public void switchWindowsTest() {
            driver.get("http://practice.cybertekschool.com/windows");
            System.out.println("Before clicking the link " + driver.getTitle());
            //clicking click here link
            driver.findElement(By.linkText("Click Here")).click();
            System.out.println("After clicking the link " + driver.getTitle());
            String currentWindowHandle = driver.getWindowHandle();
            System.out.println(currentWindowHandle);

            //code for switching windows , we have to pass handle.
            //driver.switchTo().window()
//
//            String currentWindowHandle = driver.getWindowHandle();
//            System.out.println("currentWindowHandle = " + currentWindowHandle);
//            //after this line, our purpose is switching to new window
//
//            //Set is just like arraylist but without duplicate values
//            Set<String> windowHandles = driver.getWindowHandles();
//            //how many different handles it is keeping
//            System.out.println(windowHandles.size());
//            //our problem is how can we get new window handle from set of handles.There is no index.
//            //loop through all handles inside the Set of handles
//            for (String handle : windowHandles) {
//                //checking handle is not equal to current page
//                if (!currentWindowHandle.equals(handle)) {
//                    //switching to new window
//                    driver.switchTo().window(handle);
//                }
//            }
//            System.out.println("After switching " + driver.getTitle());
        }

        @Test
        public void moreThan2Windows() {
            driver.get("http://practice.cybertekschool.com/windows");
            String targetWindowTitle = "New Window";
            driver.findElement(By.linkText("Click Here")).click();
            //check how many windows we have
            System.out.println(driver.getWindowHandles().size());
            Set<String> windowHandles = driver.getWindowHandles();
            //we will keep switching windows until our title equals to targetWindowTitle.
            for (String handle : windowHandles) {
                //switch them one by one
                driver.switchTo().window(handle);
                //checking if the window title equals to my target window title
                if (driver.getTitle().equals(targetWindowTitle)) {
                    //if they are equal stop looping.I want to keep that window driver.
                    break;
                }
            }
            System.out.println("After loop title is : " + driver.getTitle());
        }

        @Test
        public void multipleFrame() {
            driver.get("http://practice.cybertekschool.com/nested_frames");
            //switching to frame top
            driver.switchTo().frame("frame-top");
            //frame top has 3 childen frame , left middle and right
            //switching to middle frame
            driver.switchTo().frame("frame-middle");
            //get the middle text and print it
            System.out.println(driver.findElement(By.id("content")).getText());
            //go back to parent (top frame) to switch right
            driver.switchTo().parentFrame();
            //switching right using index
            driver.switchTo().frame(2);
            //print right from right frame
            System.out.println(driver.findElement(By.tagName("body")).getText());
            //go up to top level html directly
            driver.switchTo().defaultContent();
            //switch to frame bottom
            driver.switchTo().frame(1);
            System.out.println(driver.findElement(By.tagName("body")).getText());
        }
    }
    }









