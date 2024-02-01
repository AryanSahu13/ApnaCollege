package Java.DSA.Arrays1;

// practicing for the second time

import java.util.*;
public class BinarySearchPrac2{
    public static int BinSearch(int numbers[], int key){
        int start = 0;
        int end = numbers.length - 1;
        
        while(start <= end){
            int mid = (numbers.length/2);
            if(numbers[mid] == key){
                return mid;
            } else if(numbers[mid] > key){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numbers[] = {1,2,4,5,7,6,8,9,0,3};
        int key = 6;
        System.out.println("The key is at index: " + BinSearch(numbers,key) + ", found using binary search.");
    }
}
