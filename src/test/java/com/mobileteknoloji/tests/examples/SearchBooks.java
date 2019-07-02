package com.mobileteknoloji.tests.examples;

import com.mobileteknoloji.pages.LoginPage;
import com.mobileteknoloji.utilities.BrowserUtils;
import com.mobileteknoloji.utilities.ExcelUtility;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SearchBooks {

    LoginPage loginPage=new LoginPage();

    @Test
    public void searchABook() {
        String path = "src/test/resources/credentials/credentials.xlsx";
        ExcelUtility excelUtility = new ExcelUtility(path, "credentials");

        List<Map<String, String>> userData = excelUtility.getDataList();
        Map<String, String> map = new HashMap<>();

        for (Map<String, String> user : userData) {
            map.put("username", user.get("username"));
            map.put("password", user.get("password"));

        }

        loginPage.username.sendKeys(map.get("username"));
        loginPage.password.sendKeys(map.get("password"));

        loginPage.loginButton.click();

    }


}
