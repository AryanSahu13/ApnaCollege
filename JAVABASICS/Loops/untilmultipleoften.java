package Java.Loops;

import java.util.*;
public class untilmultipleoften {
    public static void main(String args[]){
        // keep entering numbers until user enters a multiple of ten
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            if(num%10 == 0){
                break;
            }
        } while(true);
        System.out.println("I'm out of the loop");
    }
}
