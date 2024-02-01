package Java.DSA.Arrays1;

// prac 2

import java.util.*;
public class LargestNumPrac2{
    public static int LargerNum(int numbers[]){
        int LargerNumber = Integer.MIN_VALUE;       // - INFINITY
        for(int i = 0; i <= numbers.length; i++){
            if(LargerNumber < numbers[i]){
                LargerNumber = numbers[i];
            }
        }
        return LargerNumber;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numbers[] = {1,2,4,5,7,8,9,0,3};
        System.out.println("The largest number in the given array is: " + LargerNum(numbers));
    }
}
