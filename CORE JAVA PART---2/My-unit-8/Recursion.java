import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        //1>TAKING USER INPUT
        Scanner input=new Scanner(System.in);
        //2> READING USER INPUT
        System.out.println("WELCOME TO THE RECURSION PROBLEM \n");
        System.out.println("PLEASE,ENTER THE NUMBER ");
        int number=input.nextInt();
        //4> CALLING/INVOKING THE FACTORIAL METHOD
        long fact=myFactorial(number);
        System.out.println("THE FACTORIAL OF THE NUMBER IS " + fact);



    }
    //3.1> USING RECURSION
    public static long  myFactorial(int myNum){
        System.out.println("FUNCTION CALLED FOR THE NUMBER IS " + myNum);
        if(myNum==1){
            return 1;
        }else{
            return myNum * myFactorial(myNum-1);
        }
       
    }

    //3>METHOD/FUNCTION FOR FACTORIAL
    // public static long  myFactorial(int myNum){
    //     long result=1;
    //     for(int i=1;i<=myNum;i++){
    //          result=result*i;
    //        //  result *=i;

    //     }

    //     return result;

    // }
    
}
