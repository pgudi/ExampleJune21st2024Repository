package com.sgtesting.actitime.driverscript;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/java/resources/FeatureFiles",
        glue = "com.sgtesting.actitime.stepdefinitions",
        tags = "@Execute"



)
public class DriverScript extends AbstractTestNGCucumberTests {
}
