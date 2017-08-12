package com.nelkinda.tardis.steps.java;

import com.nelkinda.tardis.Tardis;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.time.Clock;

import static java.time.Clock.fixed;
import static java.time.Instant.parse;
import static java.time.ZoneOffset.UTC;
import static org.junit.Assert.assertEquals;

public class TardisStepdefs {
    private final Clock tardis = new Tardis();

    @Given("^the Tardis time is fixed to millis \"([^\"]*)\",$")
    public void fixTardisToMillis(Long millis) {
        ((Tardis) tardis).fixToMillis(millis);
    }

    @Then("^the Tardis time is equal to \"([^\"]*)\"\\.$")
    public void assertTardisIsAt(String timeSpec) {
        assertEquals(parse(timeSpec), tardis.instant());
    }

    @Given("^the Tardis time is fixed to \"([^\"]*)\",$")
    public void fixTardisTo(String timeSpec) {
        ((Tardis) tardis).setClock(fixed(parse(timeSpec), UTC));
    }
}
