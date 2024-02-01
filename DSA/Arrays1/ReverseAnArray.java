package Java.DSA.Arrays1;

import java.util.*;
public class ReverseAnArray{
    public static void reverse(int array[]){
        int start = 0;
        int end = array.length - 1;
        while(start < end){
            int temp = array[end];
            array[end] = array[start];
            array[start] = temp;

            start++;
            end--;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int array[] = {2,4,6,8,0};
        reverse(array);

        System.out.println("The reversed array is: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
