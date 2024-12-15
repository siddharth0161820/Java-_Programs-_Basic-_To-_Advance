import java.util.Scanner;

public class Challenge58 {
    public static void main(String[] args) {
        //Create a program to create a simple calculator that uses a 
// switch statement to perform basic arithmetic operations 
// like addition, subtraction, multiplication, and division

//1> INPUT USER
        Scanner input=new Scanner(System.in);
        //2> reading user input
        System.out.println("WELCOME TO SIMPLE CALCULATOR\n");
        System.out.println("PLEASE,ENTER YOUR FIRST NUMBER :");
        int NUM1=input.nextInt();
        System.out.println("PLEASE,ENTER YOUR SECOND NUMBER :");
        int NUM2=input.nextInt();
        //INPUT PERATION BY CHARACTER
        System.out.println("NOW ENTER THE OPERATION: " );
        String operation=input.next();

        //apply switch
        int result=switch (operation){
            case "+" -> NUM1+NUM2;
            case "-" -> NUM1-NUM2;
            case "*" -> NUM1*NUM2;
            case "/" -> NUM1/NUM2;
            case "%" -> NUM1%NUM2;
            default ->  -1;
        };
        System.out.println("YOUR ANSWER IS " + result);

        }

        
     }
    

