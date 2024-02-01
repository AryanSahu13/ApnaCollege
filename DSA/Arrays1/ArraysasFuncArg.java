package Java.DSA.Arrays1;

import java.util.*;
public class ArraysasFuncArg{
    public static void update(int marks[]){
        for(int i = 0; i < marks.length; i++){              // we go through each index of an array
            marks[i] += 1;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[50];
                                                                        //input
        System.out.print("Enter sub1 marks: ");
        marks[0] = sc.nextInt();
        System.out.print("Enter sub2 marks: ");
        marks[1] = sc.nextInt();
        System.out.print("Enter sub3 marks: ");
        marks[2] = sc.nextInt();

        System.out.println();   
                                                                        //output
        System.out.println("The marks of Sub1 is: " + marks[0]);
        System.out.println("The marks of Sub2 is: " + marks[1]);
        System.out.println("The marks of Sub3 is: " + marks[2]);

        System.out.println();
        update(marks);                                                 //updates the marks

        System.out.print("The updated marks are: ");
        for(int i = 0; i < 3; i++){
            System.out.print(marks[i] + ", ");
        }

        System.out.println();
        System.out.println();

        System.out.println("The updated marks of sub1 is: " + marks[0]);
        System.out.println("The updated marks of sub2 is: " + marks[1]);
        System.out.println("The updated marks of sub3 is: " + marks[2]);
    }
}
