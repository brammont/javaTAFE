@echo off
REM Set the JUnit jar path
set JUNIT_JAR=path\to\junit-platform-console-standalone-<version>.jar
set JUNIT_API_JAR=path\to\junit-jupiter-api-<version>.jar

REM Compile the test file with the JUnit library included
javac -cp ".;%JUNIT_JAR%;%JUNIT_API_JAR%" computemethodsapp\ComputeMethodsAppIT.java
pause