package org.example.Pages;

import org.example.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestQKartLoginPage extends BasePage {
    //Locators
   private static final By LOGIN_LINK = By.xpath("//button[text()='Login']");
   private static final By USERNAME_TEXT_FIELD =By.xpath("//input[@id='username']");
   private static final By PASSWORD_TEXT_FIELD =By.xpath("//input[@id='password']");
   private static final By LOGINTOQKART_BUTTON = By.xpath("//button[@type='button' and contains(text(),'Login to QKart')]");





    //Actions
    public void validLogin(String email, String pass){
        ClickElement(LOGIN_LINK);
        EnterText(USERNAME_TEXT_FIELD, email);
        EnterText(PASSWORD_TEXT_FIELD, pass);
        ClickElement(LOGINTOQKART_BUTTON);
    }


    public void InvalidLogin(String email, String pass){
        ClickElement(LOGIN_LINK);
        EnterText(USERNAME_TEXT_FIELD, email);
        EnterText(PASSWORD_TEXT_FIELD, pass);
        ClickElement(LOGINTOQKART_BUTTON);

    }







}
