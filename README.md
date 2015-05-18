# MONTY HALL SIMULATION

Simulates the [Monty Hall problem](http://en.wikipedia.org/wiki/Monty_Hall_problem)
with different strategies.

Currently, the following three strategies are evaluated:

* __Always switch__ - Player always reselects door when given the opportunity.
* __No switch__ - Player does not reselect door during the game.
* __Switch on last__ - Player reselects door only on the last opportunity to do so.

## Usage

First, clone the project, navigate to the project root and use Maven to build:

    mvn assembly:assembly -DdescriptorId=jar-with-dependencies

Then execute the simulation by executing this command in the command line:

    java -jar target/monty-hall-*-jar-with-dependencies.jar

You can specify the number of doors (default: 10), and the number of iterations (default: 100).

     java -jar monty-hall-*-jar-with-dependencies.jar -d 100 -i 1000

