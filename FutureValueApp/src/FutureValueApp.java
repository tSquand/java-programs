import java.util.*;
import java.text.*;
/*
FutureValueApp
Date created: 11/21/2022
Author: Tyler Sanders
This program calculates a future value based on interest rate and monthly investments. Includes data validation and error handling
 */
public class FutureValueApp
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Future Value Calculator\n");

        Scanner sc = new Scanner(System.in);
        String choice = "y";

        while (choice.equalsIgnoreCase("y"))
        {
            // get the input from the user
            System.out.println("DATA ENTRY");            
            double monthlyInvestment = getInvestmentWithinRange(0, 1000);  //sets the variables to the values returned by the validation methods.                    
            double interestRate = getInterestWithinRange(0, 30); //min/max values are passed as parameters.
            int years = getYearsWithinRange(1, 30);

            // calculate the future value
            double monthlyInterestRate = interestRate/12/100;
            int months = years * 12;
            double futureValue = calculateFutureValue(
                monthlyInvestment, monthlyInterestRate, months);

            // get the currency and percent formatters
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            NumberFormat percent = NumberFormat.getPercentInstance();
            percent.setMinimumFractionDigits(1);

            // format the result as a single string
            String results =
                  "Monthly investment:\t"
                      + currency.format(monthlyInvestment) + "\n"
                + "Yearly interest rate:\t"
                      + percent.format(interestRate/100) + "\n"
                + "Number of years:\t"
                      +  years + "\n"
                + "Future value:\t\t"
                      + currency.format(futureValue) + "\n";

            // print the results
            System.out.println();
            System.out.println("FORMATTED RESULTS");
            System.out.println(results);

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            sc.nextLine();  // discard any other data entered on the line
            System.out.println();
        }
    }

    public static double calculateFutureValue(double monthlyInvestment,
    double monthlyInterestRate, int months)
    {
        double futureValue = 0;
        for (int i = 1; i <= months; i++)
        {
            futureValue =
                (futureValue + monthlyInvestment) *
                (1 + monthlyInterestRate);
        }
        return futureValue;
    }
    
    public static double getInvestmentWithinRange(double min, double max) {
        double number = 0;
        boolean isValid = false;
        Scanner input = new Scanner(System.in);
        while (!isValid){ 
            System.out.print("Enter monthly investment: ");
            try{
                number =  input.nextDouble();
                if (number > max)
                    System.out.println("Error! Number must be less than " + max );
                if (number < min)
                    System.out.println("Error! Number must be greater than " + min);
                if (number >= min && number <= max)
                    isValid = true;              
                
            }
            catch(InputMismatchException ex){ //if the wrong datatype is entered will execute
            System.out.println("Invalid input. A double is expected. Try again.");
            input.nextLine();
            }
        }
        return number;
    }
    
        public static double getInterestWithinRange(double min, double max) {
        double number = 0;
        boolean isValid = false;
        Scanner input = new Scanner(System.in);
        while (!isValid){
            System.out.print("Enter yearly interest rate: ");
            try{
                number =  input.nextDouble();
                if (number > max)
                    System.out.println("Error! Number must be less than " + max );
                if (number < min)
                    System.out.println("Error! Number must be greater than " + min);
                if (number >= min && number <= max)
                    isValid = true;              
                
            }
            catch(InputMismatchException ex){
            System.out.println("Invalid input. A double is expected. Try again.");
            input.nextLine();
            }
        }
        return number;
    }
    
    public static int getYearsWithinRange(int min, int max) {
        int number = 0;
        boolean isValid = false;
        Scanner input = new Scanner(System.in);
        while (!isValid){
            System.out.print("Enter number of years: ");
            try{
                number = input.nextInt();
                if (number > max)
                    System.out.println("Error! Number must be less than " + max );
                if (number < min)
                    System.out.println("Error! Number must be greater than " + min);
                if (number >= min && number <= max)
                    isValid = true;                                           
            }
            catch(InputMismatchException ex){
                System.out.println("Invalid input. An integer is expected. Try again.");
                input.nextLine();
            }
        }
        return number;
    }
}