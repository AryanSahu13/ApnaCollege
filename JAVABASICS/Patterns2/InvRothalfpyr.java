package Patterns2;

import java.util.*;
public class InvRothalfpyr{
    public static void Halfpyr(int range){
        for(int i = 1; i <= range; i++){
            for(int j = 1; j <= range-i; j++){
                System.out.print("  ");
            }
            
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
        System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int range = sc.nextInt();
        
        Halfpyr(range);
    }
}
