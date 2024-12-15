import java.util.Scanner;

public class Dowhileloop {
    public static void main(String[] args) {
        //DO - WHILE LOOP
        //INPUT AGE FROM USER (0-100)--REQUIREMENT
        //1> USER INPUT
        Scanner input=new Scanner(System.in);
       //DO-WHILE LOOP
       int age; //initialization
       do{
        System.out.println("please enter your age");
         age=input.nextInt();

       }while(age<0 || age>100);
        System.out.println("THE AGE OF THE USER IS: " + age);

       }

       }

        
        
    
    
    
