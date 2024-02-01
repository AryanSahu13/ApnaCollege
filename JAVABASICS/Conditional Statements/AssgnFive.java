// Write a Java program that takes a year from the user and print whether that year is a leap year or not.

import java.util.*;
public class AssgnFive {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
            System.out.println("This year is a Leap Year");
        } else{
            System.out.println("It is not a Leap Year");
        }
    }
}
