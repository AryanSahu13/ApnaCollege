package Functions;

import java.util.*;
public class OverloadingwithDataTypes{
    public static int Sum(int A, int B){
        return (A+B);
    }
    public static float Sum(float A, float B){
        return (A+B);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // Int datatype
        System.out.print("Enter the value of A: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of B: ");
        int b = sc.nextInt();
        System.out.println("The int sum of A and B is: " + (Sum(a,b)));
        System.out.println();

        // Float datatype
        System.out.print("Enter the float value of A: ");
        float af = sc.nextFloat(); 
        System.out.print("Enter the float value of B: ");
        float bf = sc.nextFloat();
        System.out.println("The float sum of A and B is: " + (Sum(af,bf)));
    }
}
