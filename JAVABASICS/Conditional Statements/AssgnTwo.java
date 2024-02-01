// // Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever.
// publicclassSolution{publicstaticvoidmain(String[]args) {doubletemp=103.5;}}

public class AssgnTwo{
    public static void main(String args[]){
        double temp = 103.5;                    //double is a datatype that holds flioating values
        int GoodTemp = 100;
        if(temp > GoodTemp){
            System.out.println("You have a fever");
        } else{
            System.out.println("You don't have a fever");
        }
    }    
}
