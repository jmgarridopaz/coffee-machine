# coffee-machine

## An Hexagonal Application Quick Example.

## Thursday, July 21, 2022

---
![Coffe Machine](coffee-machine.png)


This is an application to control the operation of a coffee machine.


- Drivers (users of the application):

___Buyer___: Places orders for getting a drink from the machine.

___Maintenance man___: Checks the components of the machine to ensure that it works well.


- Driven actors (needed by the application to do something):

___Recipes Repository___: It stores the recipes of the drinks.

___Dispensers___: They dispense the ingredients of an ordered drink.


### Environment:

- OS: Ubuntu 20.04.4 LTS
- IDE: IntelliJ IDEA 2021.3.3 (Community Edition)
- JAVA: 1.8.0_311
- MAVEN: 3.8.6

### Run:

For running tests so far:

- Download this Github repo
- Open it as a project with the IDE
- Right click on "TestDriver" class file
- Click on "Run TestDriver.main()"
