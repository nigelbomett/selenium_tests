package com.nkb.tests;

import com.nkb.pages.LoginPage;
import com.nkb.pages.SecureAreaPage;
import com.nkb.utils.BaseTest;
import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class LoginTest extends BaseTest {

    @Test
    @Description("Test to verify login functionality")
    public void loginTest(){
        driver.get(config.baseUrl() + "/login");
        LoginPage loginPage = new LoginPage(driver);
        SecureAreaPage secureAreaPage = loginPage.login("tomsmith","SuperSecretPassword!");

        Assertions.assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"));
    }
}
