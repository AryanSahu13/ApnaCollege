package Functions;

import java.util.*;
public class BinarytoDecimal{
    public static void BintoDec(int BinaryNum){
        int Mynum = BinaryNum;
        int power = 0;
        int decimalNum = 0;
        while(BinaryNum > 0){
            int LD = BinaryNum % 10;
            decimalNum = decimalNum + (LD * (int)Math.pow(2,power));

            power++;
            BinaryNum /= 10;
        }
        System.out.println("Decimal of Binary Number " + Mynum + " is: " + decimalNum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Binary number: ");
        int Num = sc.nextInt();
        BintoDec(Num);
    }
}
