package personapp;

public abstract class Person implements Printable {
    private String fname;
    private String lname;
    private String emailAddress;
    
    public Person(){
        fname = "";
        lname = "";
        emailAddress = "";
    }
    public void setFname(String fname) {
        this.fname = fname;       
    }
    public String getFname() {
        return fname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public String getLname() {
        return lname;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public String getEmailAddress(){
        return emailAddress;
    }
    public String toString(){
        return "Name: " + fname + " " + lname + "\nEmail: " + emailAddress;
    }
    
}
