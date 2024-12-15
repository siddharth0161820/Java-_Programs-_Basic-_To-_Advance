import java.util.Scanner;

public class Challenge16 {
    public static void main(String[] args) {
        //WAP THAT DETERMINES IF A NUMBER IS ODD/EVEN
        

        //USE INPUT METHOD
        Scanner input = new Scanner(System.in);
        //Reading user input method
        System.out.println("Please enter the number");
        int n = input.nextInt();
        
        // Apping if-else()
        if(n%2==0 ){
            System.out.println("The number is even number:");

        }
        else{
            System.out.println("The number is odd number");
        }
    }
    
}
