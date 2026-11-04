import java.util.Scanner;
/**
 * This is program for prime number. 
 * Prime number: A number which is divisible by 1 and itself.
 * Example: 11
 * @version 4.11.2026
 */
public class Prime_number
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int userInput=sc.nextInt();//Takes input from user
        int counter=0;//Counts number of divisible factor
        //Verifies if input is 1
        if(userInput==1)
        {
            System.out.println("It's a unique number");
        }
        else
        {
         for (int i=1;i<userInput;i++)
         {
             if(userInput%i==0)//Checks if number is divisible
             {
                 counter++;//Increments if divisble
             }
         }
         //Checks number of factors
         if(userInput<=2)//Since prime number is divisble by 1 and itself
         {
             System.out.println("Prime number");
         }
         else
         {
             System.out.println("Not a prime number");
         }
        }
    }
}