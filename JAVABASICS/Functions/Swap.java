package Functions;

import java.util.*;
public class Swap{
    // call by value (wherever you call it, it prints that)
    public static void Swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("The swapped value of A is: " + a);
        System.out.println("The swapped value of B is: " + b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of A: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of B: ");
        int b = sc.nextInt();
        Swap(a,b);
    }
}
