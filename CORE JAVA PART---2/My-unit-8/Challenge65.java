import java.util.Scanner;

public class Challenge65{
    public static void main(String[] args) {
        ///-----. Create a program using break to read inputs from the user in a loop and break 
              //the loop if a specific keyword (like "exit") is entered.

              //1>USER INPUT
               //1> user input
        Scanner input=new Scanner(System.in);
        
        //2>READING USER INPUT
        System.out.println("WELCOME TO THE BREAK STAMENT CHECKER\n");
       
        //3> USING WHILE LOOP for getting break
        while(true){ //no condition just true  means while will keep working 
            System.out.print("PLEASE ENTER YOUR COMMAND:");
            String command=input.nextLine();
            //4> NOW,WILL COMPARE TWO STRINGS TO CHECK WHETHER IT IS EXIT OR NOT
          //  if(command.equals("exit")){ // we cannot compare two objects with == i.e.command=="exit"
            if(command.equalsIgnoreCase("exit")) {
            //1> use .equals() to check the objects 
            //2>equalsIgnoreCase() method se aap usercase ya lowercase kisi m bhi likh skte jus check krega values

                break; //you get out of the loop 
            }
        }
        System.out.println("BREAK STAMENT APPLIED AS exit ,YOU ARE OUT OF THE LOOP,THANK YOU");
         

    }
  
    }
