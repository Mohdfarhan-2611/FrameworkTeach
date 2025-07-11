package org.example.Driver;

import org.example.Utils.PropertiesReaderUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.IOException;
import java.util.Objects;

public class DriverManager {



    public static void init() throws IOException {
        String browser = PropertiesReaderUtils.readkey("browser");
        browser = browser.toLowerCase(); //firefox

        if(Objects.isNull(DriverManagerTL.getDriver())) {
            switch (browser) {
                case "chrome":
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("--start-maximized");
                    chromeOptions.addArguments("--incognito");
                    DriverManagerTL.setDriver(new ChromeDriver(chromeOptions));
                    DriverManagerTL.getDriver().get(PropertiesReaderUtils.readkey("url"));
                    break;

                case "firefox":
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    firefoxOptions.addArguments("--start-maximized");
                    firefoxOptions.addArguments("--incognito");
                    DriverManagerTL.setDriver(new FirefoxDriver(firefoxOptions));
                    DriverManagerTL.getDriver().get(PropertiesReaderUtils.readkey("url"));
                    break;

                case "edge":
                    EdgeOptions edgeOptions = new EdgeOptions();
                    edgeOptions.addArguments("--start-maximized");
                    edgeOptions.addArguments("--incognito");
                    DriverManagerTL.setDriver(new EdgeDriver(edgeOptions));
                    DriverManagerTL.getDriver().get(PropertiesReaderUtils.readkey("url"));
                    break;

                default:
                    System.out.println("Browser not found");
            }
        }
    }


    public static void tearDown(){
        if(Objects.nonNull(DriverManagerTL.getDriver()))
            DriverManagerTL.getDriver().quit();
            DriverManagerTL.setDriver(null);
    }
}
