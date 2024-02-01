package Functions;

import java.util.*;
public class ParameterReturnStatement{
    public static int CalculateSum(int a , int b){             // here it is parameters (definition)
        int Sum = a+b;
        return Sum;                                            // return statement used. Void ke badle int.
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = sc.nextInt();
        System.out.print("Enter B: ");
        int b = sc.nextInt();
        int Sum = CalculateSum(a,b);                           // here (a,b) are arguments (calling)
        System.out.println("The Sum is: " + Sum);
    }
}

// arguments, calling name should be the same.
// parameters, you can give any name for this.


//parameters ==> machine is defining it.
//argumenets ==> we are giving it.