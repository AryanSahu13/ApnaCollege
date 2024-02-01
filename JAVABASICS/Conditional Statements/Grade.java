import java.util.*;
public class Grade{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int Marks = sc.nextInt();

        String Grade = ((Marks > 33)?"Pass":"Fail");
        System.out.println(Grade);
    }    
}
