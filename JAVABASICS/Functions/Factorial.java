package Functions;

import java.util.*;
public class Factorial{
    public static int FactorialValue(int a){
        int fact = 1;
        if(a == 0 || a == 1){
            System.out.println("1");
        } else{
            for(int i = 1; i <= a; i++){
                fact *= i;
            }
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int value = sc.nextInt();
        int fact = FactorialValue(value);
        System.out.println(fact);
    }
}
