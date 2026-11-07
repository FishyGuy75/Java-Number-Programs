import java.util.Scanner;
/**
 * This is Pronic number program.
 * Pronic number: A number which is product of two consecutive integers.
 * Example: 3*8=24, 4*5=20, 24*25=600
 * @version 7.11.2026
 */
public class Pronic_number
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");//Prompts user to enter number
        int userInput=sc.nextInt();//Takes input from user
        int product=0;//Stores product of number
        boolean pronic=false;//Stores true or false as per condition
        for(int i=1;i<userInput;i++)
        {
            product=i*(i+1);
            /*
             * Here, by using i*(i+1) we can get two consecutive integer
             * 1*(1+1)
             * 2*(2+1)
             * 3*(3+1) and so on...
             */
            //This will check if product is equal to input
            if(product==userInput)
            {
                pronic=true;//Number is pronic
                break;//Breaks because no further multiplication required
            }
        }
        //This will print out put
        if(pronic)
        {
            System.out.println("Pronic number");
        }
        else
        {
            System.out.println("Not a Pronic number");
        }
    }
}