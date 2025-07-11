package org.example.Listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retryAnalyzer implements IRetryAnalyzer {

    private static final int MAX_ATTEMPS = 3;
    private static int currentAttempt =1;

    @Override
    public boolean retry(ITestResult result) {

        if(currentAttempt<MAX_ATTEMPS){
            currentAttempt++;
            return true;
        }


        return false;
    }
}
