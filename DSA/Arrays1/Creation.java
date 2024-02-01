package Java.DSA.Arrays1;

import java.util.*;
public class Creation{
    public static void main(String args[]){
        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter the marks of Physics: ");
        marks[0] = sc.nextInt();
        System.out.print("Enter Maths marks: ");
        marks[1] = sc.nextInt();
        System.out.print("Enter chem marks: ");
        marks[2] = sc.nextInt();

        System.out.println();

        // output

        System.out.println("Physics Marks: " + marks[0]);
        System.out.println("Maths Marks: " + marks[1]);
        System.out.println("Chemistry Marks: " + marks[2]);

        System.out.println();
        // update

        marks[0] += 5;
        System.out.println("Updated Physics Marks: " + marks[0]);

        System.out.println();

        // percentage
        System.out.println("Percentage secured: " + ((marks[0] + marks[1] + marks[2]))/3 + " percentage.");

        System.out.println();

        // length
        System.out.println("Length of array is: " + marks.length);
        
    }
}