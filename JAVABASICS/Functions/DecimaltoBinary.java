package Functions;

import java.util.*;
public class DecimaltoBinary{
    public static void DectoBin(int DecNumber){
        int Mynum = DecNumber;
        int power = 0;
        int BinaryNum = 0;
        while(DecNumber > 0){
            int rem = DecNumber % 2;
            BinaryNum = BinaryNum + (rem * (int)Math.pow(10,power));

            power++;
            DecNumber /= 2;
        }
        System.out.println("The binary number for " + Mynum + " is: " + BinaryNum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int dec = sc.nextInt();
        DectoBin(dec);

    }
}
