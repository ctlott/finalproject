import java.util.*;

public class Question
{
   private People[][] peopleArray = new People[][];
   private int attribute;
   private int choice;
   Scanner Keyboard = new Scanner(System.in);
   
   public Question(People[][] array, String attribute){
       peopleArray = array;
       System.out.println(/*1. Graduation Year
       2. Hair Color
       3. Eye Color
       4. Shirt Color
       5. Gender 
       6. Ethnicity
       7. Has Glasses*/);
       
       System.out.print("Enter an integer for the attribute you want to guess about from the menu above: ");
       attribute = Keyboard.nextInt();
       System.out.println();
       
       if (attribute == 1)
            choice = gradYear();
       else if (attribute == 2)
            choice = hairColor();
       else if (attribute == 3)
            choice = eyeColor();
       else if (attribute == 4)
            choice = shirtColor();     
       else if (attribute == 5)
            choice = gender();     
       else if (attribute == 6)
            choice = ethnicity();     
       else if (attribute == 7)
            choice = hasGlasses();     
       else {
            System.out.println("Invalid entry");
            choice = 0;
        }
    }
   public int gradYear(){
           System.out.print("Enter the graduation year you want to guess: ");
           choice = Keyboard.nextInt();
           System.out.println();
           return choice;
       }
   public int hairColor(){    
           System.out.println(/*1. Black
           2. Brown
           3. Dirty Blonde
           3. Bleach Blonde */);
           System.out.print("Enter an integer for the hair color you want to guess: ");
           choice = Keyboard.nextInt();
           System.out.println();
           return choice;
        }
   public int eyeColor(){
           System.out.println(/*1. Brown
           2. Blue
           3. Green*/);
           System.out.print("Enter an integer for the hair color you want to guess: ");
           choice = Keyboard.nextInt();
           System.out.println();
           return choice;
        }
   public int shirtColor(){       
           System.out.println(/*1. blah 
           2. blah 
           3. blah*/);
           System.out.print("Enter an integer for the shirt color you want to guess: ");
           choice = Keyboard.nextInt();
           System.out.println();
           return choice;
        }
   public int gender(){
           System.out.print("Enter a 1 to guess boy, and a 2 to guess girl: ");
           choice = Keyboard.nextInt();
           System.out.println();
           return choice;
        }
   public int ethnicity(){
           System.out.print("Enter a 1 to guess asian, and a 2 to guess white: ");
           choice = Keyboard.nextInt();
           System.out.println();
           return choice;
        }
   public int hasGlasses(){
           System.out.print("Enter a 1 to guess glasses, and a 2 to guess no glasses: ");
           choice = Keyboard.nextInt();
           System.out.println();
           return choice;
        }
    }

