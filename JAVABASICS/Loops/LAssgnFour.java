package Java.Loops;

import java.util.*;
public class LAssgnFour{
    public static void main(String args[]){
        // Multiplication of integers entered by the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int range = sc.nextInt();
        int MulValue = 1;
        int i = 1;

        do{
            System.out.print("Enter the integer: ");
            int integer = sc.nextInt();
            MulValue *= integer;
            i++;
        } while(i <= range);
        System.out.println("The multiplied value is: " + MulValue);
    }
}
