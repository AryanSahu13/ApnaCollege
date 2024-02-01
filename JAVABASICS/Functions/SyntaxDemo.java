package Functions;

import java.util.*;
public class SyntaxDemo{
    public static void printHelloWorld(){
        System.out.println("Hello World!");             //separate function for output
        System.out.println("Hello World!"); 
        System.out.println("Hello World!"); 
        return;
    }
    public static void main(String args[]){
        printHelloWorld();                      //call the function
    }
}

//void is the return type, void means empty. (return type)
//The function name is main. It is a reserved keyword.
//Input in main is string in arrguments (array). It's the output
//Public static is access modifier. We'll learn it in OOPs.

// import java.util.*;
// public class SyntaxDemo{
//     public static void main(String args[]){             
//         Scanner sc = new Scanner(System.in);
//         //body
//         System.out.println("Hello World!");
//         //Work1
//         System.out.println("Hello World!");
//         //Work2
//         System.out.println("Hello World!");
//     }
// }


