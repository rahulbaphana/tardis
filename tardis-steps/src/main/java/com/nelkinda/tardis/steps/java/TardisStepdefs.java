package com.nelkinda.tardis.steps.java;

import com.nelkinda.tardis.steps.javabase.TardisStepdefsBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TardisStepdefs extends TardisStepdefsBase {

    @Given(FIX_TARDIS_TO_MILLIS)
    public void fixTardisToMillis(Long millis) {
        super.fixTardisToMillis(millis);
    }

    @Then(ASSERT_TARDIS_IS_AT)
    public void assertTardisIsAt(String timeSpec) {
        super.assertTardisIsAt(timeSpec);
    }

    @Given(FIX_TARDIS_TO)
    public void fixTardisTo(String timeSpec) {
        super.fixTardisTo(timeSpec);
    }
}
