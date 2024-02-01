package Java.DSA.Arrays1;

import java.util.*;
public class Pairs{
    public static void pairing(int numbers[]){
        for(int i = 0; i < numbers.length; i++){
            int current = numbers[i];
            for(int j = i+1; j < numbers.length; j++){
                System.out.print("(" + current + "," + numbers[j] + ")");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int numbers[] = {1,2,4,5,7,6,8,9,0,3};
        pairing(numbers);

    }
}
