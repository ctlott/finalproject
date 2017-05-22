//imports
import java.util.*;

public class Question
{
   //creates all variables necessary
   private People person;
   public static int attribute;
   private int choice;
   public static boolean returnfinal;
   public static boolean guessedCorrectlyQuestion = false;
   private boolean truefalse;
   Scanner Keyboard = new Scanner(System.in);
   
   /**
    * @param the person who is being asked about
    */
   public Question(People peeps){
       //sets instance vars
       person = peeps;
       
       //prints out the menu
       System.out.println("\n\n1. Graduation Year\n2. Hair Color\n3. Shirt Color\n4. Gender\n5. Ethnicity\n6. Has Glasses\n7. Guess Who!");
       System.out.print("\nEnter an integer for an attribute you want to guess about: ");
       
       //sets the attribute to the next user input
       attribute = Keyboard.nextInt();
       System.out.println();
       
       //for each integer, takes the user to each respective method
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
            //if they guess correctly, the variable guessedCorrectlyQuestion is set to true
            returnfinal = guessWho();
            if (returnfinal == true)
                this.guessedCorrectlyQuestion = true;
        }
       else {
            //catches invalid entries 
            System.out.println("Invalid entry");
            returnfinal = false;
        }
    }
   /**
    * lets the user guess the grad year
    * @ return whether their guess was true or false (right or wrong)
    */
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
   /**
    * lets the user guess the hair color
    * @ return whether their guess was true or false (right or wrong)
    */
   public boolean guessHairColor(){    
           System.out.println("\n\n1. Black\n2. Brown\n3. Dirty Blonde\n4. Bleach Blonde\n");
           System.out.print("Enter an integer for the hair color you want to guess: ");
           choice = Keyboard.nextInt();
           System.out.println();
           if (person.getHairColor() == choice)
                truefalse = true;
           else
                truefalse = false;
           return truefalse;
        }
   /**
    * lets the user guess the shirt color
    * @ return whether their guess was true or false (right or wrong)
    */
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
   /**
    * lets the user guess the gender
    * @ return whether their guess was true or false (right or wrong)
    */
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
   /**
    * lets the user guess the ethnicity
    * @ return whether their guess was true or false (right or wrong)
    */
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
   /**
    * lets the user guess whether they have glasses
    * @ return whether their guess was true or false (right or wrong)
    */
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
   /**
    * lets the user guess the person's name
    * @ return whether their guess was true or false (right or wrong)
    */
   public boolean guessWho(){
           System.out.print("Enter the name you want to guess: ");
           String str = Keyboard.next();
           System.out.println();
           if ( person.getName().equalsIgnoreCase(str) )
                truefalse = true;
           else
                truefalse = false;
           
           return truefalse;
        }
   /**
    * gets the result of the question method
    * @ return whether their guess was true or false (right or wrong)
    */
   public boolean getBoolean(){
           return this.returnfinal;
    }
   /**
    * returns the var that contains whether they guessed correctly in the guessWho method
    * @ return whether their guess was true or false (right or wrong)
    */
   public boolean getGuessedCorrectly(){
       return guessedCorrectlyQuestion;
    }

    }//end of class

