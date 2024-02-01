package Functions;

// Write a Java method to compute the sum of the digits in an integer.(Hint: Approach this question in the following way:
// a.Take a variable sum = 0
// b.Find the last digit of the number
// c.Add it to the sum
// d.Repeat a & b until the number becomes 0 )

import java.util.*;
public class FAssgnFive{
    public static int sum(int num){
        int Sum = 0;
        while(num > 0){
            int LD = num % 10;
            Sum += LD;
            num /= 10;
        }
        return Sum;        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int Sum = sum(num);
        System.out.println("The sum of the digits in the given number is: " + Sum);
    }
}
