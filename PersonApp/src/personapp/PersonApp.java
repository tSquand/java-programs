package personapp;

/*
Faculty and Student Data Program
Date created: 11/8/2022 - 11/28/2022
Author: Tyler Sanders
This program prints data from objects using their classes toString() method. 
11/28/2022 - updated to make Person an abstract class and implement the Printable interface
 */
public class PersonApp {

    public static void main(String[] args) {
        Faculty frankJones = new Faculty(); //creating and setting each objects values
        frankJones.setFname("Frank");
        frankJones.setLname("Jones");
        frankJones.setEmailAddress("jonesf@college.edu");
        frankJones.setDivision("Business, Industry and Technology");
        
        Faculty janeSmith = new Faculty();
        janeSmith.setFname("Jane");
        janeSmith.setLname("Smith");
        janeSmith.setEmailAddress("smithj.college.edu");
        janeSmith.setDivision("Math and Science");
        
        Student johnDoe = new Student();
        johnDoe.setFname("John");
        johnDoe.setLname("Doe");
        johnDoe.setEmailAddress("doej.college.edu");
        johnDoe.setMajor("Accounting");
        
        Student saraKing = new Student();
        saraKing.setFname("Sara");
        saraKing.setLname("King");
        saraKing.setEmailAddress("kings@college.edu");
        saraKing.setMajor("Information Technology");
        
        printMultiple(frankJones, 2);
        printMultiple(johnDoe, 3);
        
      /*          
        Person[] personArray = new Person[4];
        personArray[0] = frankJones;
        personArray[1] = janeSmith;
        personArray[2] = johnDoe;
        personArray[3] = saraKing;
                      
        for (int i = 0;i<personArray.length;i++){
            print(personArray[i]); //calls the print() method for each element of the array
        }
        */

    }
    /*public static void print(Person p){
        System.out.print(p.toString()); //calls each elements toString method and prints the returned string
    }
    */
    public static void printMultiple (Printable p, int count){
        for (int i = 0; i < count; i++){
            p.printText();
        }
        
    }
    
}
