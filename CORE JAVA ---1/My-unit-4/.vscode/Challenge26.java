import java.util.Scanner;

public class Challenge26 {
    public static void main(String[] args) {
        //WAP TO SHOW USE OF RIGHT SHIFT OPERATOR
         //USER INPUT METHOD
         Scanner input=new Scanner(System.in);
         //READING USER INPUT
         System.out.println("LETS SEE RIGHT SHIFT OPERATOR <<");
         System.out.print("LET THE  NUMBER BE:");
         int myFirstNumberr= input.nextInt();
        
 
        int resultt =myFirstNumberr >> 1;
        System.out.println(resultt);
    
    }
    
}
