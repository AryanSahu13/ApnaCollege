package Functions;

// Question-2: Write a method named isEven that accepts an int argument.
// The method should return true if argument is even, or false if otherwise. Also write a program to rtest your method.


import java.util.*;
public class FAssgnTwo{
    // Even method
    public static boolean isEven(int num){
        return num % 2 == 0;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        boolean result = isEven(number);
        System.out.println(number + ", is even: " + result);
    }
}