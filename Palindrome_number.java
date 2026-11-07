import java.util.Scanner;
/**
 * This is Palindrome number program.
 * Palindrome number: A number whose reverse is same as orignal number.
 * Example: 18381, 6776, 343, 99
 * @version 7.11.2026
 */
public class Palindrome_number
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");//Prompts user to enter number
        int userInput=sc.nextInt();//Takes input from user
        int numberOrignal=userInput;//Stores a copy of input
        int numberReverse=0;//Stores reversed number
        int digit=0;//Stores seperated digits
        //Now, numbers will be seperated and add
        while(userInput!=0)
        {
            digit=userInput%10;//Seperates digit
            numberReverse=numberReverse*10+digit;//Reconstructs number
            /*
             * Here, number reconstruction has been done using mathematical way of
             * 10x+y
             * This will work with number of any length
             * Since, initial value was 0, therefor first digit then will be x
             * Example: 831
             *          0*10+1
             *          1*10+3
             *          13*10+8
             *          138
             */
            userInput=userInput/10;//Removes last used digit
        }
        //This section will check if number is equal or not
        if(numberReverse==numberOrignal)
        {
            System.out.println("Palindrome number");
        }
        else
        {
            System.out.println("Not a Palindrome number");
        }
    }
}