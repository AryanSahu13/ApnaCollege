package Java.Loops;

import java.util.*;
public class LAssgnThree{
    public static void main(String args[]){
        // Factorial
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int n = sc.nextInt();

        if(n == 0 || n == 1){
            System.out.println(1);
        } else{
            long factorial = 1;
            for(int i =2; i <= n; i++){
                factorial *= i;
            }
            System.out.println("Factorial of " + n + " is: " + factorial);
        }
    }
}
