package org.example.Test;

import org.example.BaseTest.BaseTest;
import org.example.Listener.retryAnalyzer;
import org.example.Pages.TestQKartLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestQKartLogin extends BaseTest {

    TestQKartLoginPage login = new TestQKartLoginPage();

    @Test(description = "verify valid login", retryAnalyzer = retryAnalyzer.class)
    public void Loginuser(){
        login.validLogin("mhdfarhan2611@gamil.com", "Acc0@mf#7");

    }


    @Test(description = "verify invalid login", retryAnalyzer = retryAnalyzer.class)
    public void InvalidLogin(){

        login.InvalidLogin("mh@gmail.com", "pass123@");
        Assert.assertTrue(false);
    }
}
