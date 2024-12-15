import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        //WAP TO CONVERT CELCIUS =(FARENHEIT-32)*5/9
        //USING USER INPUT METHOD
        Scanner input = new Scanner(System.in);
        //Reading the user input
        System.out.println("lets convert  fahrenheit to celcius");
        System.out.println("The temperature in Fahrenheit is: "); 
        double Fahrenheit = input.nextDouble();

        double CELCIUS = (Fahrenheit-32)*5/9;
        System.out.println("THE TEMPERATURE IN CELCIUS IS: " +CELCIUS+" C");
        System.out.println("THANK YOU FOR SOLVING THIS PROGRAM");

        
    }
    
}
