package tests.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BrowserFactory;

public class TestNGPractice {

    @Test
    public void test(){
        //to verify that expected and actual result is the same
        //if no - it will throw exception and stop the program
        //also, you will see in the console what was expected
        //and  What was actually
        //click and hold command/control button and use left click/single click to open the class
        //then the right top side  you will see "download sources" message
        //click on it
        Assert.assertEquals("apple", "apple", "Word is not correct! should be apple");
    }

    @Test
    public void verifyTitle(){
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");
        String expectedTitle = "Practice";
        String actualTitle  =driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Title is wrong");
        driver.quit();

    }

    //let's verify that Tst Automation Practice heading is displayed

    @Test
    public void verifyHeadingIsDisplayed(){
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");
        //if there is no element with this locator, w will get NoSuchElementException
        //and our program will stoop on the findElement line
        WebElement heading = driver.findElement(By.xpath("//span[text()='Test Automation Practice']"));
        //to make sure that element is visible to user
        //because element can be present, but not visible
        //we need to make sure element is visible
        //assertTrue - method that checks if something is true
        Assert.assertTrue(heading.isDisplayed(),"Element is not visible");
        driver.quit();
    }
}
