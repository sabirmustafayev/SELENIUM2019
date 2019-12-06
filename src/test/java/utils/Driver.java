package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private static WebDriver driver; // driver value is null for now

    //
    private Driver(){

    }

    public static WebDriver get(){
        //if webdrive object was not created yet

        if (driver==null){
            //create webdriver object based on browser value from properties file
            String browser = ConfigurationReader.getProperty("browser");

            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                default:
                    //if browser type is wrong, stop tests and throw exception
                    //no browser will be opened
                    throw new RuntimeException("Wrong browser type!");
            }
        }
        //if WebDriver object was created - you can us eit
        return driver;
    }

    public static void close(){
        //if driver still exist
        if (driver != null){
            //close all browsers
            driver.quit();
            //destroy driver object, ready for gc
            driver = null;
        }
    }


}
