package com.nelkinda.tardis.steps.java8;

import com.nelkinda.tardis.Tardis;
import cucumber.api.java8.En;

import java.time.Clock;

import static java.time.Clock.fixed;
import static java.time.Instant.parse;
import static java.time.ZoneOffset.UTC;
import static org.junit.Assert.assertEquals;

public class TardisStepdefs implements En {
    private final Clock tardis = new Tardis();

    {
        Given("^the Tardis time is fixed to \"([^\"]*)\",$", this::fixTardisTo);

        Then("^the Tardis time is equal to \"([^\"]*)\"\\.$", this::assertTardisIsAt);

        Given("^the Tardis time is fixed to millis \"([^\"]*)\",$", this::fixTardisToMillis);
    }

    public void fixTardisToMillis(Long millis) {
        ((Tardis) tardis).fixToMillis(millis);
    }

    public void assertTardisIsAt(String timeSpec) {
        assertEquals(parse(timeSpec), tardis.instant());
    }

    public void fixTardisTo(String timeSpec) {
        ((Tardis) tardis).setClock(fixed(parse(timeSpec), UTC));
    }
}
