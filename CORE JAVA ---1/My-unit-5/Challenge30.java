import java.util.Scanner;

public class Challenge30 {
    public static void main(String[] args) {
        //WAP THAT CALCULATES THE FACTORIAL(!) OF A GIVEN NUMBER
        Scanner input=new Scanner(System.in);
        System.out.println("WELCOME TO GET FACTORIAL OF A NUMBER");
        System.out.print("PLEASE ENTER THE NUMBERS:");
        int num=input.nextInt(); ///number jo enter krege wo int hoga
        //defining datatype---calling/invoking
        long fact=myFactorial(num); //result jo hoga wo long m hoga bcz we r finding factorial
        System.out.println("Factorial is: "+fact);



        
    }
    //creating method/functions
    public static long myFactorial(int num) {
        if(num<2){
            return 1;//no need to add else because if condition will definitely work--------0! and 1!

        }
        long fact=1;
        int i=2;
        while(i<=num){
            fact*=i;
            i++;
        }

        return fact;


        
        
        
    }
   

    
}

