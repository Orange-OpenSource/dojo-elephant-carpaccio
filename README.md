[![MIT licensed](https://img.shields.io/badge/license-MIT-blue.svg)](LICENSE)

# Elephant Carpaccio dojo
The Elephant Carpaccio exercise is a great way for software people to practice &amp; learn how to break stories into really thin vertical slices. It also leads to interesting discussions about quality and tech practices.

The exercise was invented by Alistair Cockburn. See [here](http://alistair.cockburn.us/Elephant+Carpaccio+Exercise).

Henrik Kniberg [description](https://docs.google.com/document/d/1TCuuu-8Mm14oxsOnlk8DqfZAA1cvtYu9WGv67Yj_sSk/pub) and [handout](https://docs.google.com/document/d/1Ls6pTmhY_LV8LwFiboUXoFXenXZl0qVZWPZ8J4uoqpI/edit).

# Build
- ```./mvnw clean install``` if you haven't already installed maven 3
- ```mvn clean install``` if you have maven 3 installed

# Useful dependencies

 - [AssertJ - Fluent assertions for java](https://joel-costigliola.github.io/assertj/)
 
 - [Mockito - Tasty mocking framework for unit tests in Java](https://site.mockito.org/)
 
# Installation without network
In case you do not have network access to download maven or the dependencies, you can proceed as follows:
 - the maven wrapper (`./mvnw`) is configured to "download" a local file, found in `.mvn/wrapper/apache-maven-3.6.1-bin.zip`
 - for the java dependencies, you can unzip the `m2.zip` file and copy the `repository` content in your local `.m2/repository` directory 

# License
Copyright (C) 2016 Orange - The MIT License
