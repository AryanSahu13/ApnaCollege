package Java.DSA.Arays2;

import java.util.*;
public class MSASumBrute{
    public static void Brute(int array[]){
        int MaxSum = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
            int start = i;
            for(int j = i+1; j < array.length; j++){
                int end = array.length - 1;
                int currSum = 0;
                for(int k = start; k < end; k++){
                    currSum += array[k];
                }
                MaxSum = Math.max(MaxSum, currSum);
            }
        }
        System.out.println("The final MaxSum for the given array is: " + MaxSum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int array[] = {1,3,5,7,9};
        Brute(array);
    }
}


