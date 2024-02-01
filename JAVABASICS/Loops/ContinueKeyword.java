package Java.Loops;

import java.util.*;
public class ContinueKeyword{
    // to skip an iteration
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int range = sc.nextInt();
        int counter = 0;

        while (counter <= range){
            counter++;
            if(counter == 3){
                continue;
            }
            System.out.println(counter);
        }
    }    
}
