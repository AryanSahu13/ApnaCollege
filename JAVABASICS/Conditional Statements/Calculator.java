import java.util.*;
public class Calculator{
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A: ");
        int a = sc.nextInt();
        System.out.println("Enter B: ");
        int b = sc.nextInt();
        System.out.println("Enter Operator: ");
        char Operator = sc.next().charAt(0); //next() takes string, CharAt(0) takes single letter, we'll learn this in strings

        switch(Operator){
            case '+' : System.out.println("The sum is: " + (a + b));
            break;
            case '-' : System.out.println("The subtracted value is: " + (a-b));
            break;
            case '*' : System.out.println("The multiplied value is: " + (a * b));
            break;
            case '/' : System.out.println("The divided value is: " + (a/b));
            break; 
            case '%' : System.out.println("The remainder is: " + (a%b));
            break;
            default: System.out.println("Wrong Operator");
            break;
        }
    }    
}
