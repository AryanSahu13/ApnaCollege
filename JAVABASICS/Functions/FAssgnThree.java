package Functions;

// Write a java program to check if a number is palindrome in Java. (121 is a palindrome, 321 is not).
// A number is palindrome if the number is equal to the reverse of a number e.g., 121 is a palindrome because the reverse
// of 121 is 121 itself. On the other hand, 321 is not a palindrome because the reverse of 321 is 123, which is not equal to 321.

import java.util.*;
public class FAssgnThree{
    public static boolean Pal(int num){
        int Mynum = num;
        int rev = 0;
        while(Mynum > 0){
            int LD = Mynum % 10;
            rev = (rev*10) + LD;
            Mynum /= 10;                
        }
       return num == rev;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        boolean result = Pal(num);
        if(result){
            System.out.println("The given number is a Palindrome number.");
        } else{
            System.out.println("It is not a palindrome number.");
        }
    }    
}
