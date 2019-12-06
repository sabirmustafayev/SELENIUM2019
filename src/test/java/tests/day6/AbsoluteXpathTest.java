package tests.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class AbsoluteXpathTest {

    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        //driver.get("https://login1.nextbasecrm.com/?login=yes");
        driver.get("https://login1.nextbasecrm.com/?login=yes");
        //click on login without entering username and password
        //to invoke warning message
        driver.findElement(By.className("login-btn")).click();


        //WebElement warningMessage = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/div/div/div[2]"));

        WebElement warningMessage2 = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/div/div/div[2]"));

        //WebElement warningMessage2 = driver.findElement(By.xpath("//div[@class='errortext']"));

        System.out.println(warningMessage2.getText());

        String str = "Incorrect login or password";

        BrowserUtils.wait(3);

        if (warningMessage2.equals(str)){
            System.out.println("test pasd");
        }else
            System.out.println("sicdiq");

        driver.quit();




    }
}
