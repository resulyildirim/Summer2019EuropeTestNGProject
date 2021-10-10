package com.cybertek.tests.day14pomTest;

import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveLoginTest extends TestBase {

    @Test
    public void loginAsDriver(){
        LoginPage loginPage=new LoginPage();
        String username =ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");
        loginPage.login(username,password);

       /* LoginPage loginPage=new LoginPage();
        String username= ConfigurationReader.get("drive_username");
        String password =ConfigurationReader.get("driver_password");

        loginPage.login(username,password);*/

        Assert.assertEquals(driver.getCurrentUrl(),"https://qa3.vytrack.com/");
    }
    @Test
    public void loginstoreManager(){
        LoginPage loginPage=new LoginPage();
        String username =ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");
        loginPage.login(username,password);





    }



}
