Feature: Tardis

  Scenario: Tardis fixed to instant.
    Given the Tardis time is fixed to "2016-01-01T00:00:00Z",
    Then the Tardis time is equal to "2016-01-01T00:00:00Z".

  Scenario: Tardis fixed to millis.
    Given the Tardis time is fixed to millis "1502519868000",
    Then the Tardis time is equal to "2017-08-12T06:37:48Z".
