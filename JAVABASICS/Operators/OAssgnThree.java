public class OAssgnThree{
    public static void main(String args[]){
        // Question 3

        int x, y, z;
        x = y = z = 2;
        x += y;
        y -= z;
        z /= (x+y);
        System.out.println(x + y + z);

        // After correcting the code, output is 4
    }
}
