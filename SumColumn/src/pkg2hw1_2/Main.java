package pkg2hw1_2;
import java.util.Scanner;

/* Tyler Sanders
COP2805 - Homework #1_2
1/18/2023
This program reads a user entered matrix and returns the sum of all elements per column
 */

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3 by 4 matrix by row: ");
        double[][] m = {
            {input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble()},
            {input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble()},
            {input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble()}
        };
        for (int i = 0; i < m[0].length; i++) { //loop to print out the sums. able to just use m[0].length because all rows are the same length
            System.out.println("Sum of the elements at column " + (i + 1) + " is "  + sumColumn(m, i));
        }
        
    }
        public static double sumColumn(double[][] m, int columnIndex) { //method that returns the sum of a specific column
            double sumCount = 0;
            for (int i = 0; i < m.length; i++) {
              sumCount += m[i][columnIndex]; 
            }
            return sumCount;
        }
    
}
