package Functions;

// when using function overloading, call the function inside the print statement itself.

import java.util.*;
public class Overloading{
    public static int Sum(int A, int B){
        // Calls Sum for 2 integers
        return A+B;
    }
    public static int Sum(int A, int B, int C){
        // Calls sum for 3 integers
        return A+B+C;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // to get sum of two numbers
        System.out.print("Enter the Value - A: ");
        int a = sc.nextInt();
        System.out.print("Enter the Value - B: ");
        int b = sc.nextInt();
        System.out.print("The Sum of A and B is: " + (Sum(a,b)));

        System.out.println();

        // to get sum of 3 numbers
        System.out.print("Enter the Value - C: ");
        int c = sc.nextInt();
        System.out.println("The Sum of A, B and C is " + (Sum(a,b,c)));
    }    
}

