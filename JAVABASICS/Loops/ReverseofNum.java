package Java.Loops;

import java.util.*;
public class ReverseofNum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.print("The reversed number is: ");
        while(num>0){
            int digit = num%10;
            System.out.print(digit + " ");            
            num = num/10;
        }
        System.out.println();
    }    
}
