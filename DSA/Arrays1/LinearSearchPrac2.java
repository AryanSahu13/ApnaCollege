package Java.DSA.Arrays1;

// practicing for the second time

import java.util.*;
public class LinearSearchPrac2{
    public static int LS(int numbers[], int key){
        for(int i = 0;  i < numbers.length; i++){
            if(key == numbers[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {1,2,4,5,7,6,8,9,0,3};
        int key = 6;
        int result = LS(numbers, key);
        System.out.println("The key is at index: " + result);
    }
}
