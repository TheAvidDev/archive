//Avid Dev
//Monday, November 12, 2018
//Mr. Teacher
//A program which asks the user for some information then outputs it in a sentence.

//Declares variables.
char favLetter;
String favFood;
int favNumber;
double howTall;

void setup() {
  size(800, 500);
  background(51);
  
  //Gets all answers.
  favFood = getString("What is your favourite food?");
  favLetter = getChar("What is your favourite letter of the alphabet?");
  favNumber = getInt("What is your favourite number?");
  howTall = getDouble("How tall are you in metres?");

  //Prints all answers.
  fill(255);
  textSize(25);
  text("Ah, hello there human! You seem to really like the letter " + favLetter
    +". Tonight, for dinner, you would really enjoy a nice " + favFood
    +". Your choice of the number " + favNumber
    + " is rather special, considering that you are " + howTall
    +"m tall. \n\n Thanks for participating!", 100, 100, 600, 300);
}
