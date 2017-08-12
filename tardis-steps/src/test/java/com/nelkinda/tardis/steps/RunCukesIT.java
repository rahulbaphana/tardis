package com.nelkinda.tardis.steps;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com.nelkinda.tardis.steps",
        features = "src/test/resources/features"
)
public class RunCukesIT {
}
