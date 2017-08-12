package com.nelkinda.tardis.steps.javabase;

import com.nelkinda.tardis.Tardis;

import java.time.Clock;

import static java.time.Clock.fixed;
import static java.time.Instant.parse;
import static java.time.ZoneOffset.UTC;
import static org.junit.Assert.assertEquals;

public abstract class TardisStepdefsBase {
    protected static final String FIX_TARDIS_TO_MILLIS = "^the Tardis time is fixed to millis \"([^\"]*)\"[,.]?$";
    protected static final String ASSERT_TARDIS_IS_AT = "^the Tardis time is equal to \"([^\"]*)\"[,.]?$";
    protected static final String FIX_TARDIS_TO = "^the Tardis time is fixed to \"([^\"]*)\"[,.]?$";

    private final Clock tardis = new Tardis();

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
