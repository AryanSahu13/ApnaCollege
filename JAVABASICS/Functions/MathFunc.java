package Functions;

// Question 4 :READ & CODE EXERCISE 
// Search about(Google) & use the following methods of the Math class in Java:
// a.Math.min( )
// b.Math.max( )
// c.Math.sqrt( )
// d.Math.pow( )
// e.Math.avg( )
// f.Math.abs( )

import java.util.*;
public class MathFunc{
    public static int avg(int a, int b){
        return (a+b)/2;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();
        
        int average = avg(num1, num2);
        int power = (int)Math.pow(num1, num2);

        System.out.println("The min of the two numbers is: " + Math.min(num1, num2));
        System.out.println("The max of the two numbers is: " + Math.max(num1, num2));
        System.out.println("The sqrt of the num1 numbers is: " + Math.sqrt(num1));
        System.out.println("The sqrt of the num2 numbers is: " + Math.sqrt(num2));
        System.out.println("The avg of num1 to num2 numbers is: " + average);
        System.out.println("The pow of num1 to num2 numbers is: " + power);
        System.out.println("The abs difference of the two numbers is: " + Math.abs(num1-num2));
    }
}


// HAVE TO DOOOOOOOO!!!!!!!!!!!!!!!!!!!!!!!