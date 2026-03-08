# Maven Assignment

This project is a simple Java Maven application that takes a lowercase string as input from the user, capitalizes the input string, and generates the MD5 hex value of the input string. It also includes JUnit test cases for both functionalities and packages the project into a single executable JAR with all dependencies using `maven-shade-plugin`.

## Technologies Used

- Java
- Maven
- Apache Commons Lang
- Apache Commons Codec
- JUnit 5

## Features

- Capitalizes the input string
- Generates MD5 hex for the input string
- Includes unit tests for both functionalities
- Builds a shaded JAR file that can be run directly

## Maven Dependencies

- `commons-lang3` for capitalizing the string
- `commons-codec` for generating MD5 hex
- `junit-jupiter` for testing

## How to Run the Project

### Clean and Package

```bash
mvn clean package
