package com.nelkinda.tardis.steps.java;

import com.nelkinda.tardis.steps.javabase.TardisStepdefsBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TardisStepdefs extends TardisStepdefsBase {

    @Given("^the Tardis time is fixed to millis \"([^\"]*)\",$")
    public void fixTardisToMillis(Long millis) {
        super.fixTardisToMillis(millis);
    }

    @Then("^the Tardis time is equal to \"([^\"]*)\"\\.$")
    public void assertTardisIsAt(String timeSpec) {
        super.assertTardisIsAt(timeSpec);
    }

    @Given("^the Tardis time is fixed to \"([^\"]*)\",$")
    public void fixTardisTo(String timeSpec) {
        super.fixTardisTo(timeSpec);
    }
}
