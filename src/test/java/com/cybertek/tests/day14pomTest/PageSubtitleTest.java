package com.cybertek.tests.day14pomTest;

import com.cybertek.pages.CalendarEventsPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageSubtitleTest extends TestBase {

    @Test
    public void verifySubtitleTest(){
        LoginPage loginPage =new LoginPage();
        String username = ConfigurationReader.get("driver_username");
        String password= ConfigurationReader.get("driver_password");


        loginPage.login(username,password);
        DashboardPage dashboardPage= new DashboardPage();
        String expectedSubtitle ="Quick Launchpad";
        //actual title from web
        String actualSubtitle = dashboardPage.getPageSubTitle();
        //verify titles mathching
        Assert.assertEquals(actualSubtitle,expectedSubtitle,"verify subtitles");
        //Assert.assertEquals((actualSubtitle,expectedSubtitle,"Quick Launchpad"));

        dashboardPage.navigateToModule("Activities","Calendar Events");
       // dashboardPage.navigateToModule("Customers","Accounts");
        //dashboardPage.navigateToModule("System","Jobs");

        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

       Assert.assertEquals(calendarEventsPage.getPageSubTitle(),"Calendar Events","verify subtitle");
    }
}









