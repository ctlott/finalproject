//Caroline and Alexa
//Guess Who Game

To run the program: compile and run CLIENT

Game description: 
This game of "guess who" requires two players.
In order to win, each player must know the characteristics of their classmates.
Each player chooses the person for the other player to guess.
Each turn, the player guesses an attribute about the mystery person.
They are given the answer to that question, and then prompted to remove people from their board based on that answer.
In order to remove someone, they must enter the x and y coordinates of the location of that person.
If they make a mistake by removing the wrong person, they can add them back to the board by reentering their coordinates.

Displayer class:
This class is in charge of displaying the graphics to our program, 
and the different boards with all of the pictures of the students.

People class:
This class is the blueprint for each student in the class and all of their characteristics.
It also contains all of the get methods to get all of the characteristics.

Player class:
This class is in charge of creating the skeleton of the game for the person who is playing.

Turn class:
This class is in charge of running each turn for each player. 
It contains methods to update the board, and calls the question class for each player.

Question class:
This class contains all the possible questions that the user can ask.
It separates each question and organizes them through menus.
It returns whether the answer to the question is true or false.

Client class:
This class is what runs the game.
It references the player class, turn class, and displayer class.

