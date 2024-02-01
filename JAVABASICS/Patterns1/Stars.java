package Java.Patterns1;

import java.util.*;

public class Stars{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int range = sc.nextInt();
        for(int i = 1; i <= range; i++){                // i = line
            for(int j = 1; j <= i; j++){                // j = star
                System.out.print("* ");
            }
            System.out.println();
        }
    }
} 