package com.nelkinda.tardis.steps.java;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com.nelkinda.tardis.steps.java",
        features = "classpath:features"
)
public class RunCukesTest {
}
