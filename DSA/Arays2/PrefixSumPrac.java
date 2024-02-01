package Java.DSA.Arays2;

import java.util.*;
public class PrefixSumPrac{
    public static void prefixsum(int array[]){
        int MaxSum = Integer.MIN_VALUE;
        int n = array.length;
        int prefixSum[] = new int[n];
        int currSum = 0;

        prefixSum[0] = array[0];
        for(int i = 1; i < array.length; i++){
            prefixSum[i] = prefixSum[i-1] + array[i];
        }
        for(int i = 0; i < n; i++){
            int start = i;
            for(int j = i+1; j < n; j++){
                int end = j;
                currSum = start == 0 ? prefixSum[end] : prefixSum[end] - prefixSum[start-1];

            if(MaxSum < currSum){
                MaxSum = currSum;
            }
        }
    }
    System.out.println(MaxSum);
}

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int array[] = {8,7,9,0,7,6,5,6,4,3,2,5,1,0};
        prefixsum(array);
    }
}