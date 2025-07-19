package org.example.Test;

import org.apache.logging.log4j.Logger;
import org.example.BaseTest.BaseTest;
import org.example.Listener.retryAnalyzer;
import org.example.POJO.User;
import org.example.Pages.TestQKartLoginPage;
import org.example.Utils.LoggerUtility;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({org.example.Listener.TestListener.class})
public class TestQKartLogin extends BaseTest {


    TestQKartLoginPage login = new TestQKartLoginPage();

    @Test(dataProviderClass = org.example.DataProvider.DataProviderGetData.class, dataProvider = "QKARTDATAFROMEXCEL", description = "verify valid login", retryAnalyzer = retryAnalyzer.class)
    public void Loginuser(User user){
        login.validLogin(user.getValidEmailAddress(), user.getValidPassword());

    }


    @Test(description = "verify invalid login", retryAnalyzer = retryAnalyzer.class)
    public void InvalidLogin(){
        login.InvalidLogin("mh@gmail.com", "pass123@");
    }


}
