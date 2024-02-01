//  What will be the value of x & y in thefollowing program:

// publicclassSolution{publicstaticvoidmain(Stringargs[]) {inta=63,b=36;booleanx= (a<b)?true:false;inty= (a>b)?a:b;}}


public class AssgnFour{
    public static void main(String[] args){
        int a = 63; int b = 36;
        boolean x = (a < b) ? true:false;
        System.out.println(x);
        int y = (a>b)?a:b;
        System.out.println(y);
    }
}
