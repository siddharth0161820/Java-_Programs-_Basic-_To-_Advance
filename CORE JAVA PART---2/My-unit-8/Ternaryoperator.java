import java.util.Scanner;

public class Ternaryoperator{
    public static void main(String[] args) {
        /////////UNDERSTANDING TERNARYOPERATOR/////////////////////
        //WAP TO TAKE NUMBER FROM USER AND CHECKTHE GRETEST NUMBER BETWEEN TWO

        //1>USER INPUT METHOD
        Scanner input=new Scanner(System.in);
        //2>READING USER INPUT
        System.out.println("WELCOME TO NUMBER CHECKER\n");
        System.out.println("PLEASE ENTER YOUT FIRST NUMBER");
        int num1 =input.nextInt();
        System.out.println("PLEASE ENTER YOUR SECOND  NUMBER");
        int num2= input.nextInt();
        //3>CONDITIONS 
        //IF-ELSE CONDITION
//  if(num1>num2){
//     System.out.println("THE GREATEST NUMBER IS " + num1);

//    }else{
//     System.out.println("THE GREATEST NUMBER IS " + num2);
//    }
  

        ///////4> USING TERNARY OPERATOR
        // int greatestNumber;
        // if(num1>num2){
        //        greatestNumber=num1;
            
        //         }else{
        //             greatestNumber=num2;
        //         }
        //         System.out.println("THE GREATEST NUMBER IS " + greatestNumber);
        //     }

        //METHOD--2 FIND THE GREATEST NUMBER USING ternary operator==ALTERNATIVE OF IF-ELSE CONDITION
        //POINT 1> Syntax:----> variable= condition ? expression1 : expression2
                ///condition variable type  should be same as expression1:expression2
                //condition? ===should be boolean type   num1>num2?
        int greatestNumber=num1>num2?num1:num2;
        System.out.println("THE GREATEST NUMBER IS " + greatestNumber);


              



        
    }
   
}
    
    
