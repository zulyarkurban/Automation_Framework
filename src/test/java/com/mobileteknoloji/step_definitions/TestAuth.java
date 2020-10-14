package com.mobileteknoloji.step_definitions;

import com.mobileteknoloji.pages.LoginPage;
import com.mobileteknoloji.pages.HomePage;
import com.mobileteknoloji.utilities.BrowserUtils;
import com.mobileteknoloji.utilities.ConfigurationReader;
import com.mobileteknoloji.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TestAuth {
    HomePage homePage=new HomePage();
    LoginPage loginPage=new LoginPage();

    @Given("user open the Test Auth website")
    public void user_open_the_Test_Auth_website() {
        Driver.getDriver().get(ConfigurationReader.getProperty("auth.url"));
    }
    @When("user enter {string} and {string}")
    public void user_enter_and(String name, String pwd) {

        BrowserUtils.wait(3);
        loginPage.username.sendKeys(name);
        loginPage.password.sendKeys(pwd);
        loginPage.loginButton.click();

    }


    @Then("user should be login to website")
    public void user_should_be_login_to_website() {

        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),3);
        wait.until(ExpectedConditions.visibilityOf(loginPage.HomePage));

        String expected="Your Profile";
        String actual=loginPage.HomePage.getText();
        Assert.assertEquals(actual,expected);
    }

}
