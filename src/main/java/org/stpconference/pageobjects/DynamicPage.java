package org.stpconference.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Paul on 4/4/16.
 */
public class DynamicPage extends BasePage {

    String DYNAMICLOADINGURL = "http://the-internet.herokuapp.com/dynamic_loading/2";

    public By startbutton = By.cssSelector("button");
    public By helloworld = By.id("finish");

    int MAXTIME = 10;


    public DynamicPage(WebDriver driver){
        super(driver);
        driver.get(DYNAMICLOADINGURL);
    }

    public boolean helloWorldDisplayed(){
        return isDisplayed(helloworld, MAXTIME);
    }



}
