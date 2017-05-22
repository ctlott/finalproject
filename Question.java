
import java.util.*;

public class Question
{
   private People person;
   public static int attribute;
   private int choice;
   public static boolean returnfinal;
   public static boolean guessedCorrectlyQuestion = false;
   private boolean truefalse;
   Scanner Keyboard = new Scanner(System.in);
   
   public Question(People peeps){
       person = peeps;
       System.out.println("\n1. Graduation Year\n2. Hair Color\n3. Shirt Color\n4. Gender\n5. Ethnicity\n6. Has Glasses\n7. Guess Who!");
       
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
       else if (attribute == 7){
            returnfinal = guessWho();
            this.guessedCorrectlyQuestion = true;
        }
       else {
            System.out.println("Invalid entry");
            returnfinal = false;
        }
    }
   public boolean guessGradYear(){
           System.out.print("Enter the graduation year you want to guess: ");
           choice = Keyboard.nextInt();
           System.out.println();
           if (person.getGradYear() == choice)
                truefalse = true;
           else
                truefalse = false;
           return truefalse;
       }
   public boolean guessHairColor(){    
           System.out.println("\n1. Black\n2. Brown\n3. Dirty Blonde\n4. Bleach Blonde\n");
           System.out.print("Enter an integer for the hair color you want to guess: ");
           choice = Keyboard.nextInt();
           System.out.println();
           if (person.getHairColor() == choice)
                truefalse = true;
           else
                truefalse = false;
           return truefalse;
        }
   public boolean guessShirtColor(){       
           System.out.println("\n1. Red\n2. Blue\n3. Black\n4. Grey\n5. Pattern\n");
           System.out.print("Enter an integer for the shirt color you want to guess: ");
           choice = Keyboard.nextInt();
           System.out.println();
           if (person.getShirtColor() == choice)
                truefalse = true;
           else
                truefalse = false;
           return truefalse;
        }
   public boolean guessGender(){
           System.out.print("Enter a 1 to guess boy, and a 2 to guess girl: ");
           choice = Keyboard.nextInt();
           System.out.println();
           if (person.getGender() == choice)
                truefalse = true;
           else
                truefalse = false;
           return truefalse;
        }
   public boolean guessEthnicity(){
           System.out.print("Enter a 1 to guess asian, and a 2 to guess white: ");
           choice = Keyboard.nextInt();
           System.out.println();
           if (person.getEthnicity() == choice)
                truefalse = true;
           else
                truefalse = false;
           return truefalse;
        }
   public boolean guessGlasses(){
           System.out.print("Enter a 1 to guess glasses, and a 2 to guess no glasses: ");
           choice = Keyboard.nextInt();
           System.out.println();
           if (person.getGlasses() == choice)
                truefalse = true;
           else
                truefalse = false;
           return truefalse;
        }
   public boolean guessWho(){
           System.out.print("Enter the name you want to guess: ");
           String str = Keyboard.next();
           System.out.println();
           if ( person.getName().equals(str) )
                truefalse = true;
           else
                truefalse = false;
           
           return truefalse;
        }
   public boolean getBoolean(){
           return this.returnfinal;
    }
   public boolean getGuessedCorrectly(){
       return guessedCorrectlyQuestion;
    }
    }

