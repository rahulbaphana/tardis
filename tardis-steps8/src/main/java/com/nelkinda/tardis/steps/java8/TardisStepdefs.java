package com.nelkinda.tardis.steps.java8;

import com.nelkinda.tardis.steps.javabase.TardisStepdefsBase;
import cucumber.api.java8.En;

public class TardisStepdefs extends TardisStepdefsBase implements En {

    {
        Given(FIX_TARDIS_TO, this::fixTardisTo);

        Then(ASSERT_TARDIS_IS_AT, this::assertTardisIsAt);

        Given(FIX_TARDIS_TO_MILLIS, this::fixTardisToMillis);
    }

}
