package com.mobileteknoloji.pages.searchpage;

import com.mobileteknoloji.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(className = "nav-input")
    public WebElement searchButton;

    @FindBy(xpath = "//span[@class='a-color-state a-text-bold']")
    public WebElement resultLabel;

}
