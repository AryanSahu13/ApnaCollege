package Functions;

import java.util.*;
public class PrimesInRange{
    public static boolean isPrime(int num){
        // corner case
        if(num == 2){
            return true;
        }
        // for only i >= 2
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                // System.out.println("The provided number is not a prime number.");
                return false;
            }
        }
        return true;
    }
    // primes in range
    public static void primeinRange(int num){
        System.out.println("The prime numbers for the given range is: ");
        for(int i = 2; i <= num; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int num = sc.nextInt();
        // if(isPrime(num)){
        //     System.out.println(isPrime(num) + ", the provided number " + num + " is a Prime number.");
        // }
        primeinRange(num);
        if(isPrime(num)){
            System.out.println(num);
        } else{
            System.out.println();
        }
    }
}

