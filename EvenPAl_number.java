import java.util.Scanner;
/**
 * This is EvenPal number program.
 * EvenPal: A number which is Palindrome and sum of its digit is even number
 * Example: 121, 121 is Palindrome & 1+2+1=4 which is even
 * @version 7.11.2026
 */
public class EvenPAl_number
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");//Prompts user to enter number
        int userInput=sc.nextInt();//Takes input from user
        int numberOrignal=userInput;//Stores a copy of input
        int numberReverse=0;//Stores reversed number
        int digit=0;//Stores seperated digits
        int sumOfDigits=0;//Stores sum of digit
        //Digit seperation and reconstruction will be done using while loop
        while(userInput!=0)
        {
            digit=userInput%10;//Seperates digit
            sumOfDigits=sumOfDigits+digit;//Adds sum of digits
            numberReverse=numberReverse*10+digit;//Reconstructs number
            userInput=userInput/10;//Removes last used digit
        }
        boolean Palindrome=numberReverse==numberOrignal;//Checks and stores condition(true or false)
        boolean sumOfDigitEven=sumOfDigits%2==0;//Same as above syntax
        //Now condition will be checked if both condition are true
        if(Palindrome && sumOfDigitEven)
        {
            System.out.println("Palindrome number");//If both conditions are true
        }
        else
        {
            System.out.println("Not a Palindrome number");
        }
    }
}