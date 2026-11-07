import java.util.Scanner;
/**
 * This is Niven number program. 
 * Niven number: A number which is divisble by its sum.
 * Example: 126, 1+2+6=9, 126%9=0
 * @version 7.11.2026
 */
public class Niven_number
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");//Promps user to enter number
        int userInput=sc.nextInt();//Takes input from user
        int sumOfDigits=0;//Stores sum of digits
        int temporary=userInput;//Stores a copy of user input
        int digit=0;//Stores sperated digit
        //Digts will be seperated and added using while loop
        while(temporary!=0)
        {
            digit=temporary%10;//Seperates digit
            sumOfDigits=sumOfDigits+digit;//Adds the sum of digit
            temporary=temporary/10;//Removes last digit
        }
        if(userInput%sumOfDigits==0)
        {
            System.out.println("Niven number");
        }
        else
        {
            System.out.println("Not a Niven number");
        }
    }
}