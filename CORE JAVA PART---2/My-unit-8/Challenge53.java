import java.util.Scanner;

public class Challenge53 {
    public static void main(String[] args) {
        //Create a program to find the minimum of two numbers using ternary operator
      //1>USER INPUT
      Scanner input=new Scanner(System.in);
      //2>READING USER INPUT

      System.out.println("WELCOME TO MINIMUM OF TWO NUMBERS CHECKER\n");
      System.out.print("Please enter the first number: ");
      int Number1=input.nextInt();
      System.out.print("Please enter the second number: ");
      int Number2=input.nextInt();
      //4>calling method
     // int min=min(Number1,Number2);//cannot directly call method as from static context to non-static context
     //first,create an object of this class Challenge54
     Challenge53 myChallenge53=new Challenge53();
     //5>callig method over object
     int Challenge53=myChallenge53.min(Number1,Number2);
     System.out.println("THE MINIMUM NUMBER IS " + Challenge53);

      
        


    }
    //3>method/fnctiom
    public int min(int Number1,int Number2){
        //TERNARY OPERATOR
        return Number1<Number2?Number1:Number2;
       
    }
    
}
