package Java.Loops;

import java.util.*;
public class LAssgnTwo{
    // Find the sum of even and odd integers
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range: ");
        int range = sc.nextInt();
        
        int EvenSum = 0;
        int OddSum = 0;
        int i = 1;

        do{
            System.out.print("Enter the integer: ");
            int integer = sc.nextInt();
            if(integer % 2 == 0){
                EvenSum += integer;
            } else{
                OddSum += integer;
            }
            i++;
        } while(i <= range);
        System.out.println("Sum of Even integers: " + EvenSum);
        System.out.println("Sum of Odd integers: " + OddSum);
    }
}
