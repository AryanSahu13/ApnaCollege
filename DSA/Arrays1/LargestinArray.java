package Java.DSA.Arrays1;

import java.util.*;
public class LargestinArray{
    public static int largest(int numbers[]){
        int largest = Integer.MIN_VALUE;            //-infinity
        // int smallest = Integer.MAX_VALUE;           //+infinity
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
        }
        return largest;        
    }
    public static void main(String args){
        int numbers[] = {2,4,6,8,10,1,5,7,3,12,18};
        System.out.println("The largest value is: " + largest(numbers));
    }
}
