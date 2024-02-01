package Functions;

// Question-1: Write a java method to compute the average of three numbers.
import java.util.*;
public class FAssgnOne{
    public static int Avgof3(int num1, int num2, int num3){
        return (num1+num2+num3)/3;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int range = sc.nextInt();
        if(range == 3){
            System.out.print("Enter the first number: ");
            int a = sc.nextInt();
            System.out.print("Enter the second number: ");
            int b = sc.nextInt();
            System.out.print("Enter the third number: ");
            int c = sc.nextInt();

            System.out.println();
            System.out.print("The average of the given three numbers - " + a + "," + b + ", and " + c + " is: " + Avgof3(a,b,c));
        } else{
            System.out.println("Range is not the required one.");
        }
    }    
}
