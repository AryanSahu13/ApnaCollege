package Java.Patterns1;

import java.util.*;
public class CharPattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n = sc.nextInt();                       //n = range
        char letter = 'A';

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(letter + " ");
                letter++;
            }
            System.out.println();
        }
    }
}
