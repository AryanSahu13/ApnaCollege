public class UnaryOp{
    public static void main(String args[]){
        int A = 10;
        int B = ++A;                                        //Pre-increment
        System.out.println("The Value of A is: " + A);
        System.out.println("The Value of B is: " + B);

        int C = 10;
        int D = C++;                                        //Post-increment                                
        System.out.println("The Value of C is: " + C);
        System.out.println("The Value of D is: " + D);

        int E = 10;
        int F = --E;                                        //Pre-Decrement
        System.out.println("The Value of E is: " + E);
        System.out.println("The Value of F is: " + F);

        int G = 10;
        int H = G--;                                        //Post-Decrement                                
        System.out.println("The Value of G is: " + G);
        System.out.println("The Value of H is: " + H);
    }
}