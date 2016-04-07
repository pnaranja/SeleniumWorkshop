package org.stpconference.stepdefs;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Paul on 4/7/16.
 */
public class LoginTestCucumber {
    public static WebDriver driver;

    String DRIVER_LOC = "/Users/Paul/IdeaProjects/chromedriver";

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", DRIVER_LOC);
        ThreadLocal<WebDriver> t = new ThreadLocal<>();
        t.set(new ChromeDriver());
        driver = t.get();
    }

    @After
    void teardown(){
        driver.close();
    }

}
