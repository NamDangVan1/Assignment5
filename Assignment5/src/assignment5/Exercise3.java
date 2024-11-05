package assignment5;

import java.util.Scanner;

public class Exercise3 
{
    public static void main( String[] args ) 
    {
        Scanner sc = new Scanner( System.in );
        System.out.print("n = ");
        int n = sc.nextInt();
        
        System.out.print("Multiplication Table: ");
        
        for ( int i = 1; i <= 10; i++ )
        {
            System.out.print(n*i + ", ");
        }
    }
}
