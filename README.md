# Tardis - Time Machine for Java

Tardis is a time machine for Java.
It works by providing an implementation of Clock that allows control over time.
Tardis is not dependent on any dependency injection framework, but designed to be used with one.

## Building

Tardis currently requires Java 9.
A backport to Java 8 is planned very shortly after the project is started.

- Ensure that Maven can find and run with Java 9, for example by exporting `JAVA_HOME` to point to Java 9.
- Run the Maven Wrapper.

For example, on Debian-derived Linux systems like Ubuntu, run:

```
export JAVA_HOME=/usr/lib/jvm/java-9-oracle
./mvnw clean install
```

## Design

Tardis provides an implementation of Clock that delegates to another Clock.
That other clock could be a fixed clock `Clock.fixed()`, a wall clock `Clock.systemUTC()` or any other clock.
Usually for testing it would be a fixed clock `Clock.fixed()`.

## Using Tardis

There are two possible ways how to use Tardis.
Both ways are based on using `Clock` as a bean.
- Use the same wiring to Tardis for testing and production code, and make Tardis work differently in tests.
- Wire Tardis for testing but a wall clock like `Clock.systemUTC()` for production.
