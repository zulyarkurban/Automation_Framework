package com.mobileteknoloji.tests.smoke_tests.login;

import com.mobileteknoloji.utilities.ConfigurationReader;
import com.mobileteknoloji.utilities.TestBase;
import org.testng.annotations.Test;

import static org.testng.Assert.fail;

public class LoginTest extends TestBase {
    //open the application
    //enter login information

    @Test
    public void loginTest(){
        //if we dont create a test in the test method, this test will not show up in the report.html
        extentLogger=report.createTest("positive login test");
       pages.loginPage.britErpDemoButton.click();

       pages.loginPage.email.sendKeys(ConfigurationReader.getProperty("managerUsername"));
       pages.loginPage.password.sendKeys(ConfigurationReader.getProperty("managerPassword"));
       pages.loginPage.login.click();

    }
    @Test
    public void negativeLoginTest(){
        extentLogger=report.createTest("negative login test");
        pages.loginPage.britErpDemoButton.click();

        fail();
//        pages.loginPage.email.sendKeys(ConfigurationReader.getProperty("managerUsername"));
//        pages.loginPage.password.sendKeys(ConfigurationReader.getProperty("managerPassword"));
//        pages.loginPage.login.click();
//

    }


}
