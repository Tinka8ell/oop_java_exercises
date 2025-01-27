# Object Oriented Programming and Java

## Instructions

This repository contains challenges for you to undertake around Object-Oriented programming in Java. 
You can work on these challenges individually or in a pair.

(The instructions below assume you have got your laptop setup 
ready for running Java applications as per the pre-journey)

To get started you should "fork" this repository into your own Git account and the clone down to your machine.

Once cloned you can run the tests by running:

```
mvn test
```

You'll see that all the tests are currently failing.

Your job is to one by one fix the failing tests.

If you are working in a pair, we recommend working on one person's machine during pairing, 
but once your session has ended send over the code to your pair so that you both have a copy.

## Some facts about your objects

The objects you'll be working with are all types of Cat

Here's some facts about Cats....

By definition the blueprint for ALL cats is that they can do the following things:

    * Eat
    * Sleep
    * Run

They ALL have the following attributes

    * A piece of data that says whether they are asleep or not 
    * An average height represented in centimetres
    * A piece of data that indicates their setting such as "domestic" or "wild"
    * ALL cats go to sleep exactly the same way

After a cat has eaten its food their reaction tends to differ between species

    * A Lion will let out a victorious roar
    * A cheetah will let out a snoring sound as it becomes tired following a chase
    * A domestic cat tends to let our a purring sound


As a bonus exercise some domestic cats will randomly let out a dismissive 
"It will do I suppose" comment following eating.

We've created the Cat interface to get you started 

## Your solution should have...

* The usage of a Java interface

* The usage of a Java abstract class

* The usage of encapsulation, abstraction, polymorphism and inheritance

## My solution

### Phase One

Assuming that Cat is supposed to be an interface, and that is what is being tested, 
create minimum to get tests to compile:
* Created stub classes for CheaterCat, DomesticatedCat, LionCat
* Created an abstract class [Animal](src/main/java/com/techreturners/cats/Animal.java) for them all to inherit 
that temporarily implements the Cat interface
* Temporarily implement stub methods in Animal that satisfy the Cat interface
* Success! - all classes compile, tests run, but some tests fail - by fluke some pass ;-)

### Phase Two

* Remove interface fromm [Animal](src/main/java/com/techreturners/cats/Animal.java) - animals are not necessarily cats, 
but animals do all the things that cats might.
* Surprise! Surprise more tests pass, but not all yet!

### Phase Three

* Gave [DomesticCat](src/main/java/com/techreturners/cats/DomesticCat.java) a default constructor, so it can be domestic
* One more test passes!

### Phase Four

* Decided to make eat() abstract as each Animal will have to implement their own!
* Added implementations, as per spec, where required to compile.
* Many more tests pass!

### Phase Five

* Added default constructor to the "wild" cats to set the average height.
* Many more tests pass!

### Extension One

* As all the tests pass! I feel I should add some more to check for some basic edge cases that are missing.
* New tests actually pass!  

### Extension Two

* Refactored by inserting a Feline class for all cats to inherit from!
* New tests actually pass!  

### Extension Three

* Gave the Domestic Cat an occasional moan :-)
* New tests actually pass! 
* And then tey don't! As expected feedTheCat fails one in three!
* I'm not changing the test!

