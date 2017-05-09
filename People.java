public class People
{
    private int x, y, gradYear, hairColor, shirtColor, gender, ethnicity, glasses;
    //private picture;
    
    public People(int gY, int hC, int sC, int gen, int e, int gla){
        gradYear = gY;
        hairColor = hC;
        shirtColor = sC;
        gender = gen;
        ethnicity = e;
        glasses = gla;
    }
    public int getGradYear(){
        return this.gradYear;
    }
    public int getHairColor(){
        return this.hairColor;
    }
    public int getShirtColor(){
        return this.shirtColor;
    }
    public int getGender(){
        return this.gender;
    }
    public int getEthnicity(){
        return this.ethnicity;
    }
    public int getGlasses(){
        return this.glasses;
    }
}
