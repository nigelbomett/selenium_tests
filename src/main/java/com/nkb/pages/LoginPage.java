package com.nkb.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(id = "username")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(css = "button[type='submit']")
    private WebElement loginButton;

    public LoginPage(WebDriver driver){
        super(driver);
    }

    public SecureAreaPage login(String user, String pass){
        username.sendKeys(user);
        password.sendKeys(pass);
        loginButton.click();

        return new SecureAreaPage(driver);
    }

}
