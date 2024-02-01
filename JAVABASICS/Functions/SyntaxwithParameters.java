package Functions;

import java.util.*;
public class SyntaxwithParameters{
    public static void CalculateSum(int a , int b){             // here it is parameters
        int Sum = a+b;
        System.out.println("The Sum is: " + Sum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = sc.nextInt();
        System.out.print("Enter B: ");
        int b = sc.nextInt();
        CalculateSum(a,b);                                      // here (a,b) are arguments
    }
}


//parameters ==> machine is defining it.
//argumenets ==> we are giving it.