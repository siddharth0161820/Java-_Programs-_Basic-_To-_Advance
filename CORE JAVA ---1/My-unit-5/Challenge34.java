import java.util.Scanner;

public class Challenge34 {
    public static void main(String[] args) {
        //WAP TO CHECK WHETHER A GIVEN NUMBER IS PRIME OR NOT
        Scanner input=new Scanner(System.in);
        System.out.println("check the number is prime or not");
        System.out.println("Please,Enter the number:");

        int num =input.nextInt();
        boolean isPrime=isPrime(num);
        if(isPrime){
            System.out.println("YOUR NUMBER IS PRIME");
           
        }else{
            System.out.println("your number is not prime");
        }
        
       
        

       

    }
    //create a method/function
    public static boolean isPrime(int num){
        int i=2;
        while(i<num){
            if(num%i==0){
                return false;
            }
            i++;
        }
        return true;

    }

}

