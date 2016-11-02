[![MIT licensed](https://img.shields.io/badge/license-MIT-blue.svg)](LICENSE)

# Elephant Carpaccio dojo
The Elephant Carpaccio exercise is a great way for software people to practice &amp; learn how to break stories into really thin vertical slices. It also leads to interesting discussions about quality and tech practices.

The exercise was invented by Alistair Cockburn. See [here](http://alistair.cockburn.us/Elephant+Carpaccio+Exercise).

Henrik Kniberg [description](https://docs.google.com/document/d/1TCuuu-8Mm14oxsOnlk8DqfZAA1cvtYu9WGv67Yj_sSk/pub) and [handout](https://docs.google.com/document/d/1Ls6pTmhY_LV8LwFiboUXoFXenXZl0qVZWPZ8J4uoqpI/edit).

# Build
- ```./mvnw clean install``` if you haven't already installed maven 3.3.x
- ```mvn clean install``` if you have maven 3.3.x installed

# Useful dependencies

 -[Zohhak - JUnit parameterized made simple](https://github.com/piotrturski/zohhak)
 
 -[Fest assert - Fluent Assertions](https://github.com/alexruiz/fest-assert-1.x)
 
 
You can find examples demonstrating how to use Zohhak and Lombok @Value under the test directory.

# License
Copyright (C) 2016 Orange - The MIT License
