package com.cybertek.tests.day7Testing;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestNGAssertationsDemo {

    @Test
    public  void test1(){
        System.out.println("First Assertion");
        Assert.assertEquals("one","one");
        System.out.println("second Assertion");
        Assert.assertEquals("title","titleK");
    }
    @Test
    public void Ass(){
        System.out.println("First Assertion");
        Assert.assertEquals(1,1);
    }
    @Test
    public  void test2() {
        //verify that starts with C
        String actualTitle = "Cybertek";
        String expectedTitleBigining = "C";

        String actual ="ali";
        String expected="a";

        Assert.assertTrue(actual.startsWith(expected),"a");

        System.out.println("first Assertion");
        Assert.assertTrue(actualTitle.startsWith(expectedTitleBigining), "verify title");
        //verify that email includes @ sing
        Assert.assertTrue("aby@gmail".contains("@"), "verify @ in mail");
        Assert.assertTrue("alid@gmail.com".contains("@"),"verify that @ contains");
    }
        @Test
        public  void test(){
        Assert.assertNotEquals("one","two");
        }
        @Test
        public void  test4(){
        Assert.assertFalse(1<0);
        }



    }





