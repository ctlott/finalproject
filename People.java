
public class People
{
    //creates variables for each person
    private int x, y, gradYear, hairColor, shirtColor, gender, ethnicity, glasses;
    public boolean displayMe;
    public String name, fileName;

    
    /**
     * @param all of the required attributes for each person
     * @return nothing cuz its a constructor
     */
    public People(String n, String file, int gY, int hC, int sC, int gen, int e, int gla, int posX, int posY) {
        //set variables
        this.name = n;
        this.gradYear = gY;
        this.hairColor = hC;
        this.shirtColor = sC;
        this.gender = gen;
        this.ethnicity = e;
        this.glasses = gla;
        this.x = posX;
        this.y = posY;
        this.fileName = file;
        this.displayMe = true;

    }
    /**
     * returns the graduation year of this person
     */
    public int getGradYear(){
        return this.gradYear;
    }
    /**
     * returns the hair color of this person
     */
    public int getHairColor(){
        return this.hairColor;
    }
    /**
     * returns the shirt color of this person
     */
    public int getShirtColor(){
        return this.shirtColor;
    }
    /**
     * returns the gender of this person
     */
    public int getGender(){
        return this.gender;
    }
    /**
     * returns the ethnicity of this person
     */
    public int getEthnicity(){
        return this.ethnicity;
    }
    public int getGlasses(){
        return this.glasses;
    }
    /**
     * returns the name of this person
     */
    public String getName(){
        return this.name;
    }
    /**
     * returns the file name of this person
     */
    public String getFileName(){
        return this.fileName;
    }
    /**
     * returns the x location of this person
     */
    public int getXLocation(){
        return x;
    }
    /**
     * returns the y location of this person
     */
    public int getYLocation(){
        return y;
    }
    /**
     * returns whether or not the picture is displayed
     */
    public boolean getDisplayMe(){
        return displayMe;
    }
    /**
     * sets the displayMe variable to be false
     */
    public void noDisplay(){
        displayMe = false;
    }
    /**
     * returns the name of this person
     */
    public String toString(){
        return this.name;
    }
    
}