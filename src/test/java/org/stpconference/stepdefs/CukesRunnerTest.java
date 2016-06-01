package org.stpconference.stepdefs;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

/**
 * Boilerplate code to run Cucumber tests
 */
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/org/stpconference/resources")
public class CukesRunnerTest extends AbstractTestNGCucumberTests {
}
