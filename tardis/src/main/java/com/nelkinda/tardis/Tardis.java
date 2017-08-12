package com.nelkinda.tardis;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

import static java.time.Instant.ofEpochMilli;
import static java.time.ZoneOffset.UTC;

public class Tardis extends Clock {
    private Clock delegate = Clock.systemUTC();

    @Override
    public Instant instant() {
        return delegate.instant();
    }

    @Override
    public ZoneId getZone() {
        return delegate.getZone();
    }

    @Override
    public Clock withZone(ZoneId zone) {
        return delegate.withZone(zone);
    }

    public void setClock(Clock clock) {
        this.delegate = clock;
    }

    /**
     * Sets the current time of the Tardis to be fixed to the specified millis since Epoch in UTC.
     * @param millis Milliseconds since Epoch in UTC to which the Tardis clock will be fixed.
     */
    public void fixToMillis(long millis) {
        delegate = Clock.fixed(ofEpochMilli(millis), UTC);
    }
}
