package Java.Loops;

import java.util.*;
public class SumofN{
    //sum of first N natural numbers
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int range = sc.nextInt();
        int counter = 1;
        int Sum = 0;
        while(counter <= range){
            Sum += counter;
            counter++;
        }
        System.out.println("Sum of first N natural numbers is: " + Sum);
    }    
}
