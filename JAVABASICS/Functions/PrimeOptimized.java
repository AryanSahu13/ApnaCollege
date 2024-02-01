package Functions;

import java.util.*;
public class PrimeOptimized{
    // only for num >= 2
    public static boolean isPrime(int num){
        // corner case
        if(num == 2){
            return true;
        }
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                System.out.println("The provided number is not a prime number.");
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if(isPrime(num)){
            System.out.println(isPrime(num) + ", the provided number " + num + " is a Prime number.");
        }
    }
}
