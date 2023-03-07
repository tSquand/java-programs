package personapp;

public class Faculty extends Person{ //subclass of Person
    private String division;
    public Faculty(){
        division = "";
    }
    public void setDivision(String division) {
        this.division = division;
    }
    public String getDivision() {
        return division;
    }
    public String toString(){        
        return super.toString() + "\nDivision: " + division + "\n"; //returns Person's toString() method and adds info from Faculty
    }
    public void printText(){
        System.out.print(toString());
    }
    
}