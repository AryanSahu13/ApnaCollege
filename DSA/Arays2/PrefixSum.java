package Java.DSA.Arays2;

import java.util.*;
public class PrefixSum{
    public static void PrefSumm(int array[]){
        int MaximumSum = Integer.MIN_VALUE;
        int Prefix[] = new int[array.length];
        int currSum = 0;

        Prefix[0] = array[0 ];
        for(int i = 1; i < array.length; i++){
            Prefix[i] = Prefix[i-1] + array[i];
        }

        for(int i = 0; i < array.length; i++){
            int start = i;
            for(int j = i; j < array.length; j++){
                int end = j;
                currSum = start == 0 ? Prefix[end] : Prefix[end] - Prefix[start-1];

                if(MaximumSum < currSum){
                    MaximumSum = currSum;
                }
            }
        }
        System.out.println(MaximumSum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int array[] = {1, -2, 6, -1, 3};
        PrefSumm(array);
    }
}