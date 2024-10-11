package com.sgtesting.actitime.driverscript;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/resources/FeatureFiles",
        glue = "com.sgtesting.actitime.stepdefinitions",
        plugin = {"pretty",
                "html:Reports/cucumber-report.html",
                "json:Reports/cucumber.json"},
        tags = "@Execute"



)
public class DriverScript extends AbstractTestNGCucumberTests {
}
