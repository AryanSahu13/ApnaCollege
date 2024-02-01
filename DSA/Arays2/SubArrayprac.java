package Java.DSA.Arays2;

import java.util.*;
public class SubArrayprac{
    public static void subArray(int array[]){
        int MaxSum = Integer.MIN_VALUE;
        int n = array.length;
        for(int i = 0; i < n; i++){
            int start = i;
            for(int j = i; j < n; j++){
                int end = j;
                for(int k = start; k <= end; k++){
                    System.out.print(array[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int array[] = {1,4,5,7,9};
        subArray(array);
    }
}
