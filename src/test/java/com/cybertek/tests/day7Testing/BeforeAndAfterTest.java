package com.cybertek.tests.day7Testing;

import org.testng.annotations.*;

public class BeforeAndAfterTest {

    @Test
    public  void test2(){
        System.out.println("this second test");
    }
    @Test
    public  void test1(){
        System.out.println("this  is a test 1");
    }
    @BeforeMethod
    public void setUpMethod(){
        System.out.println("BEFORE METHOD");
        System.out.println(" OPENING THE BROWSER");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("CLOSE Browser");
    }
    @BeforeClass
    public  void  well(){
        System.out.println("BEFORE CLASS CODE......");
    }
    @AfterClass
    public  void afft(){
        System.out.println("After classs.......");
        System.out.println("REPORTING");
    }


}
