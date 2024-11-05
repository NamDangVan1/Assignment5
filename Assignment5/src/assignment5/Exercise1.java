package assignment5;

import java.util.Random;
import java.util.Scanner;

public class Exercise1
{
    public static void main( String[] args ) 
    {
        Random random = new Random();
        Scanner sc = new Scanner( System.in );
        int randomNumber = random.nextInt( 1, 50 );
        int guessingNumber;
        do
        {
            System.out.print("Guessing number: ");
            guessingNumber = sc.nextInt();
            if ( guessingNumber > randomNumber )
            {
                System.out.println("Your number is higher");
            }else if ( guessingNumber < randomNumber )
            {
                System.out.println("Your number is lower");
            }else
            {
                System.out.println("Congratulations!");
            }
        }while( randomNumber != guessingNumber );
    }
    
}
