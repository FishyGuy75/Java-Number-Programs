import java.util.Scanner;
/**
 * This is Buzz number program.
 * Buzz Number: A number which is either divisible by 7 or ends with 7.
 * Example: 57, 343
 * @version 4.11.2026
 */
public class Buzz_number
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");//Prompts user to enter number
        int n=sc.nextInt();//Takes input from user 
        if(n%7==0||n/10==7)
        {
            System.out.println("Buzz number");
        }
        else
        {
            System.out.println("Not a buzz number");
        }
    }
}