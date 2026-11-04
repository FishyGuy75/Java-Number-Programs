import java.util.Scanner;
/**
 * This is Spy number program.
 * Spy number: A number whose sum of digits is equal to its product.
 * Example: 123, 1+2+3=1*2*3
 * @version 4.11.2026
 */
public class Spy_number
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int userInput=sc.nextInt();//Takes input from user
        int product=1;//Stores product of number
        int sum=0;//Stores sum of digit
        int digit=0;//For digit seperation
        //For digit seperation, we will use while loop
        while(userInput!=0)
        {
            digit=userInput%10;//Seperates digits
            sum=sum+digit;//Caculates sum
            product=product*digit;//Calculates product
            userInput=userInput/10;//Removes last digit
        }
        if(sum==product)
        {
            System.out.println("Spy number");
        }
        else
        {
            System.out.println("Not a spy number");
        }
    }
}