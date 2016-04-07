package org.stpconference;

import org.stpconference.pageobjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Paul on 4/4/16.
 */
public class LoginTest extends BaseTest {
    LoginPage loginpage;

    protected String USER = "tomsmith";
    protected String PASSWORD = "SuperSecretPassword!";
    protected String BAD_PASSWORD = "SuperSecretPassword";

    @Test
    void loginTest()
    {
        loginpage = new LoginPage(driver);
        loginpage.with(USER,PASSWORD);
        Assert.assertTrue(loginpage.loginSuccess(), "LoginPage did not successfully login");
    }

    @Test
    void badLoginTest(){
        loginpage = new LoginPage(driver);
        loginpage.with(USER,BAD_PASSWORD);
        Assert.assertTrue(loginpage.loginFailed(), "Was not expecting to login successfully");

    }

}
