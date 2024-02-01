package Functions;

import java.util.*;
public class CheckifPrime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if(num <= 1){
            System.out.println("Not a Prime number.");
        } else if((num > 1) && (num <= 3)){
            System.out.println("The number is a Prime number.");
        } else if((num % 2 == 0) || (num % 3 == 0)){
            System.out.println("The number is not a Prime number.");
        } else{
            Boolean isPrime = true;
            int i = 5;
            while(i*i <= num){
                if((num % i == 0) || (num % (i+2) == 0)){
                    isPrime = false;
                    System.out.println("Not a Prime number.");
                    break;
                }
                i += 6;
            }
            if(isPrime){
                System.out.println("The number is a Prime number");
            } else{
                System.out.println("The number is not a Prime number");
            }
        }
    }    
}
