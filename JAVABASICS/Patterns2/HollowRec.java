package Patterns2;

// basically from now on, we'll be visualizing these, in the form of a matrix.

import java.util.*;
public class HollowRec{
    public static void hollowrec(int rows, int cols){
        // outer loop
        for(int i = 1; i <= rows; i++){
            // inner loop
            for(int j = 1; j <= cols; j++){
                // cell - (i,j)
                if(i==1 || i == rows || j == 1 || j == cols){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        
        hollowrec(rows, cols);
    }
}
