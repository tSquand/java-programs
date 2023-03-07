
package ec2;
import java.util.Scanner;
/*
Tyler Sanders
COP2800 - Extra Credit 2
9/17/2022
This program takes a numerator and denominator for a fraction, determines 
if a proper or improper fraction and returns the answer or a mixed fraction/integer

 */
public class EC2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a numerator: ");
        int numerator = input.nextInt();
        System.out.println("Enter a denominator: ");
        int denominator = input.nextInt();
        
        if (numerator < denominator) //if numerator < denominator prints proper fraction message
            System.out.println(numerator + "/" + denominator + " is a proper fraction");
        else {
            System.out.print(numerator + "/" + denominator + " is an improper fraction and ");
            if (numerator % denominator == 0) //checks for a remainder, if not will just be reduced to an int
                System.out.println("it can be reduced to " + (numerator/denominator));
            else //prints mixed fraction message. calculates numerator divided by denominator, data type is an int so remainder will be truncated. displays the int + "remainder/denominator"
                System.out.println(" it's mixed fraction is " + (numerator/denominator) + "+" + (numerator % denominator) + "/" + denominator);
        }

           
        
    }
    
}
