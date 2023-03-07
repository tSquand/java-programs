
package pkg2hw4_2;
import java.util.ArrayList;
import java.util.Arrays;
/**
Tyler Sanders
* 03/01/2023
* Homework 4-2
* This program declares and utilizes a method to remove duplicates from ArrayLists.
 */
public class Main {
    public static void main(String[] args) {
            ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 1)); //creates an ArrayList of integers
            System.out.println("Original integer ArrayList: " + intList);
            intList = removeDuplicates(intList); //removes duplicates from the list using the removeDuplicates method
            System.out.println("The non-duplicate list is " + intList);
            
            ArrayList<Character> charList = new ArrayList<>(Arrays.asList('Z','B','D','B','Z','E','E','M'));
            System.out.println("Original character ArrayList: " + charList);
            charList = removeDuplicates(charList);
            System.out.println("The non-duplicate list is " + charList);
           
            ArrayList<String> stringList = new ArrayList<>(Arrays.asList("Boston", "Miami", "Denver", "Boston", "New York", "Denver"));
            System.out.println("The original String ArrayList: " + stringList);
            stringList = removeDuplicates(stringList);
            System.out.println("The non-duplicate list is " + stringList);
    }
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
        ArrayList<E> newList = new ArrayList<>(); //create a new ArrayList to hold the non-duplicate elements
        for (E element : list) { //iterate over each element in the original ArrayList
            if (!newList.contains(element)) { //if the new ArrayList doesn't already contain the element, add it
                newList.add(element);
            }
        }
        return newList;
    }
}
