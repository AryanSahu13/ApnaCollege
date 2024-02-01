package Java.Loops;

import java.util.*;
public class LAssgnFive {
    // Find what is wrong in the given problem
    public static void main(String args[]){
        int num = 0;
        for(int i = 0; i <= 5; i++){
            System.out.println("i = " + i);
            num = i;
        }
        System.out.println("i after the loop is: " + num);
    }
}

// Hence figured out that i was assigned as integer inside the for loop but not outside. So used num to overcome the error.
