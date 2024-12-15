import java.util.Scanner;

public class Challenge62 {
    public static void main(String[] args) {
        //Create a program using for loop to display if a number is prime or not.
        Scanner input=new Scanner(System.in);
        System.out.println("WELCOME TO THE PRIME NUMBER CHECKER\n");
        System.out.print("Please,enter the number: ");
        int num=input.nextInt();
        //invoke/call method
       // boolean isPrime=isPrime(num);
        //applying ternary instead of if else
       // System.out.println("Your number is " + (isPrime? "prime" : "Not Prime"));
        System.out.println("Your number is " +(isPrime(num)? "Prime" : "Not Prime"));

    }
    //METHOD/FUNCTION
    public static boolean isPrime(int num){
        for(int i=2;i<num;i++){
            if(num % i==0){
                return false;
            }
        }
        return true;

    }
    
}
