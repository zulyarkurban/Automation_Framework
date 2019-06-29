package com.mobileteknoloji.pages;

import com.mobileteknoloji.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='ap_email']")
    public WebElement username;
    @FindBy(xpath = "//input[@id='ap_password']")
    public WebElement password;

    @FindBy(className = "a-alert-heading")
    public WebElement alertMessage;



}
