
import java.util.*;

public class Question
{
   private People[] peopleArray = new People[24];
   private int attribute;
   private int choice;
   private boolean returnfinal;
   private int personIndex;
   private boolean truefalse;
   Scanner Keyboard = new Scanner(System.in);
   
   public Question(People[] array, int person){
       peopleArray = array;
       personIndex = person;
       System.out.println(/*1. Graduation Year
       2. Hair Color
       3. Shirt Color
       4. Gender 
       5. Ethnicity
       6. Has Glasses
       7. Guess Who!*/);
       
       System.out.print("Enter an integer for the attribute you want to guess about from the menu above: ");
       attribute = Keyboard.nextInt();
       System.out.println();
       
       if (attribute == 1)
            returnfinal = guessGradYear();
       else if (attribute == 2)
            returnfinal = guessHairColor();
       else if (attribute == 3)
            returnfinal = guessShirtColor();     
       else if (attribute == 4)
            returnfinal = guessGender();     
       else if (attribute == 5)
            returnfinal = guessEthnicity();     
       else if (attribute == 6)
            returnfinal = guessGlasses();   
       else if (attribute == 7)
            returnfinal = guessWho();  
       else {
            System.out.println("Invalid entry");
            returnfinal = false;
        }
    }
   public boolean guessGradYear(){
           System.out.print("Enter the graduation year you want to guess: ");
           choice = Keyboard.nextInt();
           System.out.println();
           if (peopleArray[personIndex].getGradYear() == choice)
                truefalse = true;
           else
                truefalse = false;
           return truefalse;
       }
   public boolean guessHairColor(){    
           System.out.println(/*1. Black
           2. Brown
           3. Dirty Blonde
           3. Bleach Blonde */);
           System.out.print("Enter an integer for the hair color you want to guess: ");
           choice = Keyboard.nextInt();
           System.out.println();
           if (peopleArray[personIndex].getHairColor() == choice)
                truefalse = true;
           else
                truefalse = false;
           return truefalse;
        }
   public boolean guessShirtColor(){       
           System.out.println(/*1. Red
           2. Blue
           3. Black
           4. Grey
           5. Pattern*/);
           System.out.print("Enter an integer for the shirt color you want to guess: ");
           choice = Keyboard.nextInt();
           System.out.println();
           if (peopleArray[personIndex].getShirtColor() == choice)
                truefalse = true;
           else
                truefalse = false;
           return truefalse;
        }
   public boolean guessGender(){
           System.out.print("Enter a 1 to guess boy, and a 2 to guess girl: ");
           choice = Keyboard.nextInt();
           System.out.println();
           if (peopleArray[personIndex].getGender() == choice)
                truefalse = true;
           else
                truefalse = false;
           return truefalse;
        }
   public boolean guessEthnicity(){
           System.out.print("Enter a 1 to guess asian, and a 2 to guess white: ");
           choice = Keyboard.nextInt();
           System.out.println();
           if (peopleArray[personIndex].getEthnicity() == choice)
                truefalse = true;
           else
                truefalse = false;
           return truefalse;
        }
   public boolean guessGlasses(){
           System.out.print("Enter a 1 to guess glasses, and a 2 to guess no glasses: ");
           choice = Keyboard.nextInt();
           System.out.println();
           if (peopleArray[personIndex].getGlasses() == choice)
                truefalse = true;
           else
                truefalse = false;
           return truefalse;
        }
   public boolean guessWho(){
           System.out.print("Enter the name you want to guess: ");
           String str = Keyboard.next();
           System.out.println();
           if (peopleArray[personIndex].getName() == str)
                truefalse = true;
           else
                truefalse = false;
           return truefalse;
        }
    }

