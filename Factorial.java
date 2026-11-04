import java.util.Scanner;
/**
 * This is factorial program
 * Factorial: It is the product of all numbers less than the number but greater than 1.
 * Example: 6!=720
 * @version 4.11.2026
 */
public class Factorial
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int userInput=sc.nextInt();//Takes input from user
        int factorial=1;//Stores factorial
        //We will use for loop for calculating factorial
        for (int i=1;i<=userInput;i++)
        {
            factorial=factorial*i;//Calculates factorial
        }
        System.out.println(userInput+"! ="+factorial);//Prints factorial
        /*
         * Alternatively, we can use do while loop for this program
         * 
         * do
         * {
         *     fatorial=factorial*i;
         *     i--;
         * }while (i>0)
         */
    }
}
