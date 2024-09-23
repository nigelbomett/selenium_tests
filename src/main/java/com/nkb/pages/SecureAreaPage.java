package com.nkb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage extends BasePage {

    private By statusAlert = By.id("flash");

    public SecureAreaPage(WebDriver driver){
        super(driver);
    }

    public String getAlertText(){
        return driver.findElement(statusAlert).getText();
    }
}
