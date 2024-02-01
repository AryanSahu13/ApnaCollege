package Java.DSA.Arrays1;

import java.util.*;
public class PairsSelfTest{
    // we can write a code, which has current value as start(i) and adds on the next value in j
    public static void Pairing(int array[]){
        for(int i = 0; i < array.length; i++){
            int current = array[i];
            for(int j = i+1; j < array.length; j++){
                System.out.print("(" + current + "," + array[j] + ") ");
            }
            System.out.println();
        }
    }    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int array[] = {2,4,6,8,10};
        Pairing(array);
    }
}
