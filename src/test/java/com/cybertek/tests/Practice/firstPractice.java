package com.cybertek.tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class firstPractice {
    @Test
    public void test1() {

        Assert.assertEquals("one", "one");

        //second
        Assert.assertEquals("Title", "Title");
    }
        @Test
        public void test2() {
       String actualTitle ="Cybertek";
       String expectedTitleBeginig="C";
        Assert.assertTrue(actualTitle.startsWith(expectedTitleBeginig),"verify title starts with  C");

       String actualmail="resul@gmail.com";
        String  expectedmail=" @";
        Assert.assertTrue(actualmail.contains("@"),"verify @ in email");
    }

           @Test
         public void test3(){
        Assert.assertNotEquals("one","two","one is not equal");

    }
        @Test
    public void test4(){
        Assert.assertFalse(1<0);
        }
    }








