package com.cybertek.tests.day8typeOfElement;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class NoSelectDropdown {

    @Test
    public void test1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement drpDownElmnt =driver.findElement(By.id("dropdownMenuLink"));
        drpDownElmnt.click();
        List<WebElement>links=driver.findElements(By.className("dropdown-item"));
        links.size();
        System.out.println(links.size());
        System.out.println(links.get(0).getText());

        for(WebElement menulink:links){
            System.out.println(menulink.getText());
            //System.out.println(menulink);
        }

//        WebElement dropdownElement =driver.findElement(By.id("dropdownMenuLink"));
//        //oppen the dropdown
//        dropdownElement.click();
//        List<WebElement>lostofLinks=driver.findElements(By.className("dropdown-item"));
//        System.out.println("Number of Links "+lostofLinks.size());
//        //print text of each link
//        for(WebElement ListofLink: lostofLinks) {
//            System.out.println(ListofLink.getText());
//
//            //text of fisrt element in the list
//            System.out.println(lostofLinks.get(0).getText());
//            //print text of each link
//            for (WebElement link :lostofLinks){
//                System.out.println(link.getText());

               // driver.findElement((By.linkText("Yahoo")).)

                //index of link

            }
        }









