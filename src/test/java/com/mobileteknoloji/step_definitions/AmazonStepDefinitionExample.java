package com.mobileteknoloji.step_definitions;

import com.mobileteknoloji.pages.searchpage.HomePage;
import com.mobileteknoloji.utilities.ConfigurationReader;
import com.mobileteknoloji.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class AmazonStepDefinitionExample {
    HomePage homePage=new HomePage();
    @Given("user open the Amazon")
    public void user_open_the_Amazon() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user enter {string} on searchbox")
    public void user_enter_on_searchbox(String string) {

        homePage.searchBox.sendKeys(string);
        homePage.searchButton.click();
    }

    @Then("user can see related info on result")
    public void user_can_see_related_info_on_result() {

        Assert.assertTrue(homePage.resultLabel.isDisplayed());
    }


}
