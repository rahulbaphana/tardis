package com.nelkinda.tardis.steps.java8;

import com.nelkinda.tardis.steps.javabase.TardisStepdefsBase;
import cucumber.api.java8.En;

public class TardisStepdefs extends TardisStepdefsBase implements En {

    {
        Given("^the Tardis time is fixed to \"([^\"]*)\",$", this::fixTardisTo);

        Then("^the Tardis time is equal to \"([^\"]*)\"\\.$", this::assertTardisIsAt);

        Given("^the Tardis time is fixed to millis \"([^\"]*)\",$", this::fixTardisToMillis);
    }

}
