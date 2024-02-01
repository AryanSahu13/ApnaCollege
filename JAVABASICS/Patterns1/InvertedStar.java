package Java.Patterns1;

import java.util.*;
public class InvertedStar{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int range = sc.nextInt();

        for(int i = 1; i <= range; i++){
            for(int j = 1; j<= (range-i+1); j++){                   //formula = (n-i+1) = (range-lines+1)
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
