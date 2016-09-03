package org.stpconference.stepdefs;

import cucumber.runtime.java.picocontainer.PicoFactory;
import org.stpconference.pageobjects.LoginPage;

/**
 * Custom Pico Factory that will return a LoginPage
 */
public class CustomPicoFactory extends PicoFactory
{
    public CustomPicoFactory()
    {
        //DI only works with classes that only have default constructors?
        addClass(LoginPage.class);
    }

}
