package Java.DSA.Arays2;

// Max Sub Array - 1: Brute Force

import java.util.*;
public class MSA1{
    public static void MSA(int array[]){
        for(int i = 0; i < array.length; i++){
            int start = i;
            for(int j = i+1; j < array.length; j++){
                int end = j;
                for(int k = start; k < j; k++){
                    System.out.print(array[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void MSA2(int array[]){
        int MaxSum = Integer.MIN    _VALUE;
        for(int i = 0; i < array.length; i++){
            int start = i;
            for(int j = i+1; j < array.length; j++){
                int end = j;
                int sum = 0;
                for(int k = start; k < end; k++){
                    sum += array[k];
                }
                MaxSum = Math.max(MaxSum, sum);
            }
        }
        System.out.println("MaxSum is: " + MaxSum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int array[] = {1, -2, 6, -1, 3};
        MSA(array);
        MSA2(array);
    }
}
