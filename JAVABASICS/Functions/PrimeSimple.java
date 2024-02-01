package Functions;

import java.util.*;
public class PrimeSimple{
    public static boolean isPrime(int num){
        boolean isPrime = true;
        for(int i = 2; i <= num -1; i++){
            if(num % i == 0){
                isPrime = false;
                System.out.println("The provided number is not a prime number.");
                break;
            }
        }
        return isPrime;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if(isPrime(num)){
            System.out.println(isPrime(num) + ", the given number " + num + " is a Prime number.");
        }
    }
}
