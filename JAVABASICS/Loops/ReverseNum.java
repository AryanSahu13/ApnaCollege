package Java.Loops;

import java.util.*;
public class ReverseNum{
    // Reverse the original number itself
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int rev = 0;  

        System.out.print("Reversed original number: ");
        while(num>0){
            int lastdigit = num%10;
            rev = (rev * 10) + lastdigit;
            num = num/10;
        }
        System.out.println(rev);
    }
}
