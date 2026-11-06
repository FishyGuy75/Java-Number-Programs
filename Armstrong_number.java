import java.util.Scanner;
/**
 * This is Armstrong number program.
 * Armstrong number: A number which equals the sum of its own digits, each being raised to the power of number of digits.
 * Example: 153=1^3+5^3+3^3=1+125+27=153
 * @version 6.11.2026
 */
public class Armstrong_number
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int userInput=sc.nextInt();//Takes input from user
        long temporary=userInput;//Stores the user input for comparing number and sum of number raised to power
        long sumOfPower=0;//Stores sum of numbers raised to power
        int totalDigit=0;//Stores total number of digit
        int digit=0;//Stores seperated digits
        long digitPower=0;//Stores digits raised to power
        //While loop is used for digit seperation
        while(userInput!=0)
        {
            totalDigit++;//Increments as digts are removed
            userInput=userInput/10;//Removes digit
        }
        temporary=userInput;//Reassigns orignal value
        //Now digits will be seperated and added
        while(userInput!=0)
        {
            digit=userInput%10;//Seperates digit
            digitPower=(long)Math.pow(digit,totalDigit);//Raises to power
            sumOfPower=sumOfPower+digitPower;//Adds digits raised to power
            userInput=userInput/10;//Removes last used digit
        }
        if (userInput==sumOfPower)
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println("Not an Armstrong number");
        }
    }
}