package Java.Loops;

import java.util.*;
public class ContinueProblem{
    public static void main(String args[]){
        // Display all numbers entered by user except the multiples of 10
        Scanner sc = new Scanner(System.in);

        // WITHOUT USING CONTINUE KEYWORD

        // do{
        //     System.out.print("Enter the number: ");
        //     int num = sc.nextInt();
        //     if(num % 10 != 0){
        //         System.out.println("The number is: " + num);
        //     } else{
        //         System.out.println("This number cannot be printed.");
        //     }
        // } while(true);

        // USING CONTINUE KEYWORD

        do{
            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            if(num % 10 == 0){
                System.out.println("This number cannot be printed.");
                continue;
            }
            System.out.println("The number is: " + num);
        } while(true);
    }
}
