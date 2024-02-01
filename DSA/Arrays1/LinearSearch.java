package Java.DSA.Arrays1;

import java.util.*;
public class LinearSearch{
    public static int linearsearch(int numbers[], int key){
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numbers[] = {10,20,30,40,50,60,70,80,90};
        int key = 50;
        int index = linearsearch(numbers, key);
        System.out.println("The key is at index: " + index);
    }
}
