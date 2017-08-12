package com.nelkinda.tardis;

import org.junit.Test;

import java.time.Clock;
import java.time.Instant;

import static java.lang.Math.abs;
import static java.time.Clock.fixed;
import static java.time.Clock.systemUTC;
import static java.time.Instant.now;
import static java.time.Instant.ofEpochMilli;
import static java.time.ZoneOffset.UTC;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TardisTest {

    private Clock tardis = new Tardis();

    @Test
    public void initialize_with_current_time() {
        assertTrue(abs(tardis.millis() - systemUTC().millis()) <= 1);
    }

    @Test
    public void when_fixed_clock_returns_that_time() {
        final Instant now = now();

        ((Tardis) tardis).setClock(fixed(now, UTC));

        assertEquals(now, tardis.instant());
    }

    @Test
    public void when_fixed_clock_returns_the_time_set_by_user() {
        ((Tardis) tardis).fixToMillis(1502515372L);

        assertEquals(ofEpochMilli(1502515372), tardis.instant());
    }
}
