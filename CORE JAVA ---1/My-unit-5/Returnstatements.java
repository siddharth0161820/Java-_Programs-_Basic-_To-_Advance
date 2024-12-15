import java.util.Scanner;

public class Returnstatements {
    public static void main(String[] args) {
        //user input to add two numbers
       
        greeting();
        int myFirstNumber=readNumber()+3;
        int mySecondNumber=readNumber()+5;
        
      
       

        int mySum= myFirstNumber+mySecondNumber;
        System.out.println("The Sum Of Two Numbers: "+mySum);

        

    }
    public static int readNumber(){
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter The  Number");
        int myFirstNumber=input.nextInt();
        return myFirstNumber;


    }
    public static void greeting(){
        System.out.println("WELCOME TO ADDITION OF TWO NUMBERS:");
    
        

    }
}

    

