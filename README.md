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
