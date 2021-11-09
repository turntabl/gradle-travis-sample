# Gradle Application with CI to Travis CI
# Introduction

This project uses gradle build tool to complete a set of questions aimed at teaching fundamentals of OOP Java, Junit 4 testing, Mockito, and CI pipelines using Travis CI

# Question Implemented in this code base
Turntabl has a number of clients who pay us to write code for them. We want to keep a register of clients so we can contact them.

There are two types of Client: Corporate and Private. Every client has a name, an ID, and a Service Level.

The Service Level is either Gold, Platinum, or Premium.

A Corporate Client has an Account Manager.
A Private Client is just a person.

Turntabl wants to get the Contact Name of a Client. In the case of a Corporate Client, that's the name of the Account Manager. In the case of a Private Client, that's the Client's name.

The Client Register should be initialised with a collection of both Corporate and Private Clients.

Model this scenario appropriately. Ensure you have appropriate tests for your model.
7. Using the Register
Extend your register to accommodate the following requirements.

1. I would like to get a list of the Contact Names of all the Gold clients.

2. I would like to get a Client's name by their ID. This should take into account the fact that there may be no Client with that ID.

3. I would like a Count of all clients at every Service Level. For example, there may be 5 Gold clients, 6 Platinum clients, and 2 Premium clients.
