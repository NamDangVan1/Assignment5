package assignment5;

import java.util.Scanner;

public class Exercise2
{
    public static void main( String[] args ) 
    {
        Scanner sc = new Scanner( System.in );
        
        System.out.print("n = ");
        int n = sc.nextInt();
        
        int x0 = 0;
        int x1 = 1;
       
        System.out.print(x0 + ", " + x1 + ", ");
        
        for ( int i = 2; i < n; i++ ){
            int x = x0 + x1;
            x0 = x1;
            x1 = x;
            System.out.print(x + ", ");
        }
    }
}
