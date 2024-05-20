# Hangman

## Table of contents

| Title                  | Content                                                     |
|------------------------|-------------------------------------------------------------|
| Description            | A short description about the project and technologies used |
| How to install and Run | An explanation about how to install and run the project     |
| How to play            | A brief rundown of how to play the game                     |
| Credits                | List of credits                                             |


## Description

This is very basic and rudimentary version of the classic game 'Hangman', played entirely within the terminal. The game 
will pick a random word from a pre-determined list, and ask you to guess the letters until you either fully guess the 
word or run out of lives.

The project has been developed completely in Java, using the IntelliJ Community edition IDE combined with AWS Corretto 
V11 as the JDK. Additionally, JUnit is used for testing purposes. 

As this was my first proper Java application, it presented numerous challenges which include and was not limited to,
exceptions, altering specific array elements based on user input and obtaining + validating said user input. 

## How to install and run

The simplest method to install this project is to clone down this repository into a directory of your choosing. If you 
haven't already you will also need to install an IDE as well as a JDK. You can search for programs listed above that 
were used to make this game and download + plus install those. After all this has been completed, open your IDE, go to 
file and open the cloned project. 

Once you have the project opened, you can get it running by navigating to the GameElements package, opening the
Gameplay class and clicking the green arrow on the left hand side of the main method. After a few seconds your terminal
will open, and you will be prompted to select an option. Inputting 1 and pressing enter will begin the gameplay itself,
and entering anything else will close out the game and end the program.

## How to play

Once the program is running, you can begin to play. Should you have inputted 1, a random word will be selected. Once 
chosen, you will be presented with that word, hidden using underscores in between two curly braces. The number of 
underscores indicates how many letters the chosen word has. You will now be prompted to enter a guess. This guess can 
only be one letter, and doesn't care for casing. Inputting anything other than a letter, such as numbers, symbols or 
even multiple letters, will display an error message and advise the correct guess parameters. 

After you have inputted your guess, the game will check if this guess exists in the chosen word. If it does, each 
instance of the letter in the hidden word will be replaced, showing where that letter fits within the chosen word. You 
will also be informed your guess was correct. If your guess is wrong however the above will not happen, and instead you 
will lose a life, while also being informed of the incorrect guess. Irrespective of if the guess is correct or not, 
once the actions are complete you will be shown your guesses so far, your remaining lives, the state of the hidden word 
and finally be prompted to make a new guess. The game will continue until either you guess the word or run out of lives.

After you have won or lost the game, you will receive a relevant message. Following this you will be asked if you wish 
to play again. Here the same input state applies as did when you started the game. 1 to play again, anything else to
exit. 

## Credits

This project was made entirely by myself using the aforementioned tools.