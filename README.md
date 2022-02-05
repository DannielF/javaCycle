# SK-U

## Getting Started

Welcome to the workshop N° 2 abstraction, interface and polymorphism

These are the task that I completed:

[SpaceShip classification article](https://moaramore.com/2016/05/14/clasificacion-de-las-naves-espaciales)

1. Retrieve interfaces and generic abstract attributes that you can take from the article, create interfaces and abstract classes you may think be correct about the article.
2. create at least two abstract methods for one spaceship
3. create at least four types of a spaceship with different methods, if it´s possible to make one overload and override method.
4. Make one main class to allow you to create the spaceships under the boolean condition or if-else or switch-case statement
5. The program must be run indefinitely until the user decides to stop the program.
6. the workshop must be delivery to the next [Link](https://forms.gle/RvYhVpPptLyogWyT7)


## How to run the program

*** Welcome to crafting spaceships ***

**Please follow the instructions below**
- Write all the attributes of the spaceships separate by a whitespace.
- Option 1 will create a new SpaceShip and option 2 will print the info of each SpaceShip
- Basic attributes:
  * option, typeSpaceShip, name, country, weight, height, typeFuel, engines, thrust
- If you want to build a shuttleVehicle add this:
  * typeLoad, weightLoad
- If you want to build a UnmannedShip add this:
  * typeShip, photoVCells, travelSpeed
- If you want to build a mannedShip add this:
  * purpose, capacity, numberOfCrew
- Example
  * 1 shuttlevehicle SaturnV USA 2900 100 queroseno 3 3500 satellite 500
  * 1 unmmanedship DragonXX EU 1200 20 monometilhidracina 4 2 ATV false 2000


## Structure

#### abstract classes
    * SpaceShip
    * ShuttleVehicle -- has the two abstract methods required in 2.
    * UnmannedShip
    * MannedShip

#### Interfaces
    * IshuttleShip
    * IunmannedShip
    * ImannedShip

#### Extra spaceShips
    * ApoloII
    * DragonXX
    * SaturnXIII
    * VikingV

## Folder Structure

The workspace contains two folders by default, where:

- `Workshop_abstract_interface/src`: the folder to maintain sources
- `Workshop_abstract_interface/lib`: the folder to maintain dependencies

