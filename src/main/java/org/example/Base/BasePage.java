package org.example.Base;

import org.example.Driver.DriverManager;
import org.example.Driver.DriverManagerTL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage {
    //Common Method


    public void ClickElement(By locator){
        WebElement element = DriverManagerTL.getDriver().findElement(locator);
        element.click();
    }

    public void EnterText(By locator, String value){
        WebElement element = DriverManagerTL.getDriver().findElement(locator);
        element.sendKeys(value);
    }

}
