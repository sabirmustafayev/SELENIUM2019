package tests.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class FindElementsTest {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        BrowserUtils.wait(3);
        //once we open the page, we ahve to capture a title
        String expectedTitle = driver.getTitle();
        //step 1. Open inspector in chrome and find locator for the element
        //Step 2. Create object of WebElement
        //step 3. Use WebElement
        WebElement button = driver.findElement(By.id("form_submit"));
        //to click on the element
        button.click();
        //read title again, after clicking
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Test passed");
        }else{
            System.out.println("Test Failed");
            System.out.println("Expected title: "+expectedTitle);
            System.out.println("Actual title: "+actualTitle);
        }
        BrowserUtils.wait(3);
        driver.close();
    }
}
