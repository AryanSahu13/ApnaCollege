package Functions;

import java.util.*;
public class BinomialCoefficient{
    public static int FactorialValue(int a){
        int Fact = 1;
        if(a == 0 || a == 1){
            System.out.println("1");
        } else{
            for(int i = 1; i <= a; i++){
                Fact *= i;
            }
        }
        return Fact;
    }
    public static int Binomial(int n, int r){
        int nCr = (FactorialValue(n))/(((FactorialValue(r)))*((FactorialValue(n-r))));
        return nCr;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();                   // n
        System.out.print("Enter r: ");
        int r = sc.nextInt();
        int nCr = Binomial(n,r);
        System.out.print("Binomial Value is: " + nCr);     
    }
}
