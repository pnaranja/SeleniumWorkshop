package org.stpconference;

import org.stpconference.pageobjects.DynamicPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Paul on 4/4/16.
 */
public class DynamicTest extends BaseTest {
    DynamicPage dynamicPage;

    @Test
    void dynamicTest(){
        dynamicPage = new DynamicPage(driver);
        dynamicPage.click(dynamicPage.startbutton);
        Assert.assertTrue(dynamicPage.helloWorldDisplayed());
    }
}
