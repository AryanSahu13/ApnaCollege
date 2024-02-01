package Java.DSA.Arrays1;

// self test

import java.util.*;
public class MaxSubarraySum{
    public static void subPairs(int array[]){
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
            int start = i;
            for(int j = i+1; j < array.length; j++){
                int end = j;
                int sum = 0;
                for(int k = start;  k < end; k++){
                    sum += array[k];
                    System.out.println("Sum is: " + sum);
                }
                maxsum = Math.max(maxsum, sum);
                System.out.println("Max Sum is: " + (maxsum));
            }
        }
        System.out.println("Final Max Sum is: " + maxsum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int array[] = {2,4,6,8,10};
        subPairs(array);
    }    
}
