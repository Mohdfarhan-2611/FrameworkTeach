package org.example.Test;

import org.example.BaseTest.BaseTest;
import org.example.Pages.TestQKartLoginPage;
import org.testng.annotations.Test;

public class TestQKartLogin extends BaseTest {

    TestQKartLoginPage login = new TestQKartLoginPage();

    @Test
    public void Loginuser(){
        login.validLogin("mhdfarhan2611@gamil.com", "Acc0@mf#7");

    }


    @Test
    public void InvalidLogin(){

        login.InvalidLogin("mh@gmail.com", "pass123@");
    }
}
