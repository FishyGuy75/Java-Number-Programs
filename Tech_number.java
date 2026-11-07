import java.util.Scanner;
/**
 * This is tech number program.
 * Tech number: A number which has even number of digits and when split in two halves, there sum of squares is equal to orignal number.
 * Example: 3025, 3025=(30^2+25^2)=(55)^2=3025
 * @version 7.11.2026
 */
public class Tech_number
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");//Prompts user to enter number
        int userInput=sc.nextInt();//Takes input from user
        int firstHalf=userInput%100;//Stores first half of number
        int secondHalf=userInput/100;//Stores second half
        int sumOfHalves=firstHalf+secondHalf;//Stores sum of halves
        int squareOfSumOfHalves=sumOfHalves*sumOfHalves;//Stores square of sum of halves
        //Now, condition will be checked
        if(squareOfSumOfHalves==userInput)
        {
            System.out.println("Tech number");
        }
        else
        {
            System.out.println("Not a Tech number");
        }
        /*
         * This program specifically works only for 4 digit number.
         * for more than 4 digit, digits need to be counted and then split accordingly using 10 or its powers
         * Number of zeros are according to how many digits need to be split
         * To count number of digits, seperate counter variable will be needed and while loop will be required
         */
    }
}