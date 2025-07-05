package org.example.BaseTest;

import org.example.Driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class BaseTest {


    @BeforeMethod
    public void setup() throws IOException {
        DriverManager.init();
    }


    @AfterMethod
    public void TearDown(){
        DriverManager.tearDown();
    }
}
