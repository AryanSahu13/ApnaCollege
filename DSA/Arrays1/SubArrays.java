package Java.DSA.Arrays1;

import java.util.*;
public class SubArrays{
    public static void subarray(int array[]){
        for(int i = 0; i < array.length; i++){
            int start = i;
            for(int j = i+1; j < array.length; j++){
                int end = j;
                for(int k = start; k<=end; k++){
                    System.out.print( + array[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int array[] = {2,4,6,8,10};
        // (2,4), (2,4,6), (2,4,6,8), (2,4,6,8,10), .......
        subarray(array);

    }
}
