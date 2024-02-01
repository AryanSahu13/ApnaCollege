import java.util.*;
public class IncomeTaxCalc{ 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;
        
        int A = 500000;
        int B = 1000000;

        if(income < A){
            tax = 0;
            System.out.println("0% Tax: " + tax);
        } else if ((income > A) && (income < B)){
            tax = (int) (income * 0.2);
            System.out.println("20% Tax: " + tax);
        } else if (income > B){
            tax = (int) (income * 0.3);
            System.out.println("30% Tax: " + tax);
        }
    }  
}
