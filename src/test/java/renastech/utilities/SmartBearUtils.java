package renastech.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SmartBearUtils {

    public static void logInForSmartBear(WebDriver driver){

        //3- Enter username --->Tester
        WebElement username=driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        //4- Enter password --->test
        WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        //5- Click “Login” button
        WebElement login=driver.findElement(By.id("ctl00_MainContent_login_button"));
        login.click();
    }

    public static void negativeLoginForSmartBear(WebDriver driver,String userID,String passwordID){
        //3- Enter username --->Tester>>>Invalid Username
        WebElement username=driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys(userID);
        //4- Enter password --->test>>invalid Password
        WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys(passwordID);
        //5- Click “Login” button
        WebElement login=driver.findElement(By.id("ctl00_MainContent_login_button"));
        login.click();
    }

}
