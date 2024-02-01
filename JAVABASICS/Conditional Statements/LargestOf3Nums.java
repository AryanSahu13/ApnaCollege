public class LargestOf3Nums{
    public static void main(String args[]){
        int A = 100; int B = 50; int C = 120;
        if ((A > B) && (A > C)){
            System.out.println("A is largest");
        } else if ((B>A) && (B>C)){
            System.out.println("B is largest");
        } else{
            System.out.println("C is largest");
        }
    }
}
