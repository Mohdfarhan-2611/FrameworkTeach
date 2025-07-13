package org.example.Pages;

import org.apache.logging.log4j.Logger;
import org.example.Base.BasePage;
import org.example.Utils.LoggerUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestQKartLoginPage extends BasePage {

    Logger logger = LoggerUtility.getLogger(this.getClass());

    //Locators
   private static final By LOGIN_LINK = By.xpath("//button[text()='Login']");
   private static final By USERNAME_TEXT_FIELD =By.xpath("//input[@id='username']");
   private static final By PASSWORD_TEXT_FIELD =By.xpath("//input[@id='password']");
   private static final By LOGINTOQKART_BUTTON = By.xpath("//button[@type='button' and contains(text(),'Login to QKart')]");





    //Actions
    public void validLogin(String email, String pass){
        logger.info("Click login link");
        ClickElement(LOGIN_LINK);
        logger.info("Enter valid username");
        EnterText(USERNAME_TEXT_FIELD, email);
        logger.info("Enter valid password");
        EnterText(PASSWORD_TEXT_FIELD, pass);
        logger.info("Enter login button");
        ClickElement(LOGINTOQKART_BUTTON);
    }


    public void InvalidLogin(String email, String pass){
        logger.info("Click login link");
        ClickElement(LOGIN_LINK);
        logger.info("Enter invalid username");
        EnterText(USERNAME_TEXT_FIELD, email);
        logger.info("Enter invalid password");
        EnterText(PASSWORD_TEXT_FIELD, pass);
        logger.info("Enter login button");
        ClickElement(LOGINTOQKART_BUTTON);

    }







}
