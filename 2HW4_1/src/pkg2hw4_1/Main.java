
package pkg2hw4_1;

/*
Tyler Sanders
03/01/2023
Homework 4-1
This program prints a matrix and finds the rows/columns with the most 1's
 */

import java.util.Scanner;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size n: ");
        int arraySize = input.nextInt(); 
        int oneCounter = 0; //initialize a counter for the number of 1's in each row or column
        int highCounter = 0;//will store the amount of 1s found in the highest occurence rows/columns
        ArrayList<Integer> rowIndices = new ArrayList<>(); //initialize a list to store the row indices with the highest amount of 1's
        ArrayList<Integer> columnIndices = new ArrayList<>(); // ^ for column indices
        int[][] matrix;     
        matrix = new int[arraySize][arraySize]; // create the matrix
        
        System.out.print("The random array is: ");
        
        for(int i = 0;i<arraySize;i++) {           
            System.out.print("\n");
            for(int j = 0; j<arraySize;j++){
                matrix[i][j] = (int)Math.round((Math.random())); // generate a random 0 or 1 for each element of the matrix
                System.out.print(matrix[i][j]); // print the  matrix
                if (matrix[i][j] == 1){
                    oneCounter ++; //increment if the element is 1
                }
            }
            if (oneCounter > highCounter){ //check if the counter is greater than the current highest amount of 1s
                highCounter = oneCounter;
                rowIndices.clear(); //clears the row index list
                rowIndices.add(i); // adds the current row index to the list
            }
            else if (oneCounter == highCounter) { //if the amount of 1s counted is equal to the highest amount found in a given row, will add that index to the list
                rowIndices.add(i);
            }
            oneCounter = 0; // reset the counter for the next row
        }
        highCounter = 0; //reset the high amount for the column search
        for(int j = 0; j<arraySize;j++){ //same process as above but for the columns
            for(int i = 0; i<arraySize;i++){
                if (matrix[i][j] == 1){
                oneCounter += 1;
                }
            }
            if(oneCounter > highCounter){
            highCounter = oneCounter;
            columnIndices.clear();
            columnIndices.add(j);
            }
            else if(oneCounter == highCounter){
            columnIndices.add(j);
            }
        oneCounter = 0;
        }
        System.out.println("\nThe largest row index: " + rowIndices);
        System.out.println("The largest column index: " + columnIndices);
    }    
}
