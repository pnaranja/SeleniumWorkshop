package org.stpconference.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by Paul on 4/4/16.
 */
public class LoginPage extends BasePage {

    String LOGINURL = "http://the-internet.herokuapp.com/login";

    By usernamefield = By.id("username");
    By passwordfield = By.id("password");
    By loginform = By.id("login");
    By submitbutton = By.cssSelector("button");
    By loginstatus = By.cssSelector("div[id='flash']");

    public LoginPage(WebDriver driver){
        super(driver);
        driver.get(LOGINURL);
        Assert.assertTrue(driver.findElement(loginform).isDisplayed(),
                "LoginPage form did not display");
    }

    public void with(String username, String password){
        type(usernamefield, username);
        type(passwordfield, password);
        click(submitbutton);
    }

    public boolean loginSuccess(){
        String a = driver.findElement(loginstatus).getText();
        return a.contains("You logged into a secure area");
    }

    public boolean loginFailed(){
        String a = driver.findElement(loginstatus).getText();
        return a.contains("Your password is invalid");
    }

}
