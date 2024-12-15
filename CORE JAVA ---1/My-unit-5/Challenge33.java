import java.util.Scanner;  ///9:50--time

public class Challenge33 {
    public static void main(String[] args) {
        //WAP TO FIND THE GREATEST COMMON DIVISOR (GCD) OF TWO INTEGERS
        Scanner input=new Scanner(System.in);
        System.out.println("GREATEST COMMON DIVISOR OF TWO NUMBERS");
        System.out.println("PLEASE ENTER THE  FIRST NUMBERS");
        int myFirstNum=input.nextInt();
        System.out.println("PLEASE ENTER THE SECOND NUMBERS");
        int mySecondNum=input.nextInt();
        int gcd=gcd(myFirstNum,mySecondNum);
        System.out.println("THE GREATEST COMMON DIVISOR IS: "+gcd);
        

      
        
    }
    //creating function/methods
    public static int gcd(int num1,int num2){
        int gcd=1;
        int i=2;
        int least=least(num1, num2);
        while(i<=least){
            i++;
            if(num1%i==0 && num2%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
    //creating one more funvtion(function under function)
    ///will give smallest number if given two numbers
    public static int least(int num1,int num2){

        if(num1<num2){
            return num1;
        }
        else{
            return num2;
        }

    }
    
    }
    

