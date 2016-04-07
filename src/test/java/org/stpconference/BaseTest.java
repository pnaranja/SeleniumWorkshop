package org.stpconference;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Paul on 4/4/16.
 */
public class BaseTest {
    protected WebDriver driver;

    String DRIVER_LOC = "/Users/Paul/IdeaProjects/chromedriver";

    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver", DRIVER_LOC);
        ThreadLocal<WebDriver> t = new ThreadLocal<>();
        t.set(new ChromeDriver());
        driver = t.get();
    }

    @AfterMethod
    void teardown(){
        driver.quit();
    }
}
