// Variable = Condition? Statement1 : Statement 2
            // check(T/F)   Execute else Execute this

import java.util.*;
public class TernaryOp{
    public static void main(String args[]){
        // int num =  20;                           //You can give input directly here, else below way for user input
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // ternary operator
        String Type = ((num%2 == 0)? "Even":"Odd");
        System.out.println(Type);
    }
}