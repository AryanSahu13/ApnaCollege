package Functions;

import java.util.*;
public class Product{
    public static int ProductValue(int a, int b){
        int product = a*b;
        return product;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = sc.nextInt();
        System.out.print("Enter B: ");
        int b = sc.nextInt();
        int product = ProductValue(a,b);
        System.out.println("The product is: " + product);
    }
}
