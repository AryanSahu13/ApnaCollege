public class LogicalOp{
    public static void main(String args[]){
        //logical operators - &&, ||, !
        // logical AND (True if both cases are true), OR ( True if One is true), Logical NOT (True becomes false & vice-versa)
        int A = 10; int B = 5; int C = 20; int D = 12;
        System.out.println((A > B) && (C < D));
        System.out.println((A > B) || (C < D));
        System.out.println(!(A > C));
    }    
}
