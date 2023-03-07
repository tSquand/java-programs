package personapp;

public class Student extends Person{ //subclass of Person
    private String major;
    public Student(){
        major = "";
    }
    public void setMajor(String major){
        this.major = major;
    }
    public String getMajor(){
        return major;
    }
    public String toString(){
        return super.toString() + "\nMajor: " + major + "\n"; //returns Person's toString() method and adds info from Student
    }
    public void printText(){
        System.out.print(toString());
    }
    
}
