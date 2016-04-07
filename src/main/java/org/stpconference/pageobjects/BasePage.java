package org.stpconference.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Paul on 4/4/16.
 */
public class BasePage {
    WebDriver driver;

    BasePage(WebDriver driver){
        this.driver = driver;
        driver.manage().window().maximize();
    }

    public void type(By field, String sendKeys){
        driver.findElement(field).sendKeys(sendKeys);
    }

    public void click(By button){
        driver.findElement(button).click();
    }

    public boolean isDisplayed(By locator, int maxWaitTime){
        try{
            waitFor(ExpectedConditions.visibilityOfElementLocated(locator), maxWaitTime);
            return true;
        }
        catch (TimeoutException e){
            e.printStackTrace();
            return false;
        }

    }

    public void waitFor(ExpectedCondition<WebElement> condition, Integer timeout){
        timeout = timeout != null ? timeout : 5;
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(condition);
    }
}
