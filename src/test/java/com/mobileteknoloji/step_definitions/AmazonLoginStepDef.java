package com.mobileteknoloji.step_definitions;

import com.mobileteknoloji.pages.LoginPage;
import com.mobileteknoloji.pages.searchpage.HomePage;
import com.mobileteknoloji.utilities.BrowserUtils;
import com.mobileteknoloji.utilities.Pages;
import com.sun.source.tree.AssertTree;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class AmazonLoginStepDef{
    HomePage homePage=new HomePage();
    LoginPage loginPage=new LoginPage();
    @When("user open the login page")
    public void user_open_the_login_page() {

        homePage.loginButton.click();

    }

    @Then("user enter {string} and {string}")
    public void user_enter_and(String username, String password) {

        BrowserUtils.wait(3);
        loginPage.username.sendKeys(username);
        loginPage.password.sendKeys(password);

    }

    @Then("user should be login to amazon")
    public void user_should_be_login_to_amazon() {

        Assert.assertTrue(loginPage.alertMessage.isDisplayed());

    }

}
