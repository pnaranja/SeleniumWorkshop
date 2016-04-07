package org.stpconference.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.stpconference.pageobjects.LoginPage;
import org.testng.Assert;

/**
 * Created by Paul on 4/5/16.
 */
public class LoginStepDefs {

    LoginPage loginPage = new LoginPage(LoginTestCucumber.driver);
    protected String USER = "tomsmith";
    protected String PASSWORD = "SuperSecretPassword!";

    @Given("^I am on the Login screen$")
    public void iAmOnTheLoginScreen()  {
        System.out.println("Hello1");
    }

    @And("^I submit the username and password and press login$")
    public void iSubmitTheUsernameAndPasswordAndPressLogin()  {
        loginPage.with(USER, PASSWORD);
        System.out.println("Hello2");
    }

    @Then("^I should go to the HomePage$")
    public void iShouldGoToTheHomePage()  {
        Assert.assertTrue(loginPage.loginSuccess(), "Did not Login successfully");
        System.out.println("Hello3");
    }
}
