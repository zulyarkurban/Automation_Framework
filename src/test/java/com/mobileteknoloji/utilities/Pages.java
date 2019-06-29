package com.mobileteknoloji.utilities;

import com.mobileteknoloji.pages.LoginPage;
import com.mobileteknoloji.pages.HomePage;

public class Pages {
    public LoginPage loginPage;
    public HomePage homePage;

    public HomePage homePage(){
        homePage=new HomePage();
        return homePage;
    }
    public LoginPage loginPage(){
        loginPage= new LoginPage();
        return loginPage;
    }
}
