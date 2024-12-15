import java.util.Scanner;

public class Challenge25 {
    public static void main(String[] args) {
        //WAP THAT SHOWS USE OF LEFT SHIFT OPERATOR
        //USER INPUT METHOD
        Scanner input=new Scanner(System.in);
        //READING USER INPUT
        System.out.println("LETS SEE LEFT SHIFT OPERATOR <<");
        System.out.print("LET THE F NUMBER BE:");
        int myFirstNumberr= input.nextInt();
       

       int resultt =myFirstNumberr << 4;
       System.out.println(resultt);
   
    }
    
}
