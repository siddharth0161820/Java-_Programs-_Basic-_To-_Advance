import java.util.Scanner;

public class Compoundinterest {
    public static void main(String[] args) {
        //WAP TO CALCULATE COMPOUND INTEREST =P(1+R/100)T
        //USER INPUT METHOD
        Scanner input=new Scanner(System.in);
        //READING USER INPUT
        System.out.println("LETS SOLVE THE COMPOUND INTEREST");
        System.out.println("Please enter the principle amount: ");
        double principle = input.nextDouble();

        System.out.println("Please enter the Rate of Interest per annum: ");
        double Rate = input.nextDouble();

        System.out.println("Please enter the Time per annum: ");
        double Time = input.nextDouble();

        double Compndintrst = principle*Math.pow((1+Rate/100),Time);
        System.out.println("The Compound Interest will be:"  + Compndintrst);

    }
    
}
