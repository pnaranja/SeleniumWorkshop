package org.stpconference.stepdefs;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.stpconference.pageobjects.LoginPage;
import org.testng.Assert;

/**
 * Created by Paul on 4/5/16.
 */
public class LoginStepDefs {

    private WebDriver driver;
    private LoginPage loginPage;
    private String USER = "tomsmith";
    private String PASSWORD = "SuperSecretPassword!";


    @Before
    public void setup()
    {
        driver = new FirefoxDriver();
        loginPage = new LoginPage(driver);
    }

     @After
     public void teardown()
     {
         driver.close();
     }


    @Given("^I am on the Login screen$")
    public void iAmOnTheLoginScreen()  {
        System.out.println("Hello1");
    }

    @When("^I submit the username and password and press login$")
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
