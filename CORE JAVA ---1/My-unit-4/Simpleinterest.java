import java.util.Scanner;

public class Simpleinterest {
    public static void main(String[] args) {
        //WAP TO CALCULATE SIMPLE INTEREST SI=(P*R*T)/100 
        //USING USER INPUR METHOD
        Scanner input=new Scanner(System.in);
        //READING USER INPUT
        System.out.println("LETS SOLVE SIMPLE INTEREST");
        System.out.println("Principle Amount is Rs: ");
        double Principle = input.nextDouble();


        System.out.println("Rate Of Interest per Annum is: ");
        double Rate = input.nextDouble();
        
        System.out.println("Time: ");
        double Time = input.nextDouble();

        double Simpleinterest=  (Principle*Rate*Time)/100;
        System.out.println("\n\nSimpleinterest detail: " +Simpleinterest );


        

    }
    
}
