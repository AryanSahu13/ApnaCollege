public class OAssgnTwo{
    public static void main(String args[]){
        // Question 2

        int x = 200, y = 50, z = 100;
        if ((x>y) && (y>z)){
            System.out.println("Hello");
        }
        else if ((z>y) && (z<x)){
            System.out.println("Java");
        }
        else if (((y+200) < x) && ((y+150) < z)){
            System.out.println("Hello Java");
        }

        //  Output is Java
    }    
}
