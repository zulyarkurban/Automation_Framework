package com.mobileteknoloji.pages;

import com.mobileteknoloji.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "username")
    public WebElement username;
    @FindBy(name = "password")
    public WebElement password;
    @FindBy(xpath = "//input[@class='btn btn-primary pull-right']")
    public WebElement loginButton;
    @FindBy(xpath = "//input[@class='btn btn-primary pull-right']")
    public WebElement alertMessge;
    @FindBy(className = "page-header")
    public WebElement HomePage;




}
