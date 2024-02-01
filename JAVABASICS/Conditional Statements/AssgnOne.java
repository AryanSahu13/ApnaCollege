// Write a Java program to get a number from the user and print whether it is positive or negative

import java.util.*;
public class AssgnOne {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("The number is positive");
        } else{
            System.out.println("The number is negative");
        }
    }    
}
