package com.cybertek.tests.day10syncronize;

import org.testng.annotations.Test;

public class FilePathExample {

    @Test
    public void test1() {

        //System.out.println(System.getProperty("user.dir"));
        String himm= System.getProperty("user.dir");
        System.out.println(himm);

        System.out.println("+_+_+_+_+_+_+_+_+-=-=");
        String ProjectPath = System.getProperty("user.dir");
        String relativePath = "src/test/resources/testfile.txt";
        String filePath =ProjectPath  + "/" +relativePath ;
        System.out.println("filePath = " + filePath);

    }
   @Test
    public void test2() {
        System.out.println(System.getProperty("user.dir"));

        String ProjectPath = System.getProperty("user.dir");
        String relativePath = "src/test/resources/testfile.txt";
        String filePath =ProjectPath  + "/" +relativePath ;
        System.out.println("filePath = " + filePath);


    }
}