package org.example.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverFactory {

public static WebDriver getDriver (String browserName){
    WebDriver driver;

    switch (browserName.toLowerCase()){
        case "chrome":
            WebDriverManager.chromedriver().setup();
             driver = new ChromeDriver();
            break;

        case "firefox":
            WebDriverManager.chromedriver().setup();
           driver = new FirefoxDriver();
            break;
        default:
            System.out.println("Unknown Browser "+browserName);
            driver=null;
    }
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    return driver;

}

}
