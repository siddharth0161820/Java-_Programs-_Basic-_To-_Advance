import java.util.Scanner;

public class Challenge59 {
    public static void main(String[] args) {
        //Create a program using do-while to find password checker until a valid password is entered
        //2>User input
        Scanner input= new Scanner(System.in);
        //3>reading user input
        System.out.println("WELCOME TO THE PASSWORD CHECKER\n");
        //4>NOW PASSWORD TO BE GIVEN AND CHECKED USING DO-WHILE
        String password;//declaring password here to use it as global variable
        do{
            System.out.println("PLEASE, ENTER THE PASSWORD");
             password=input.next();//next() gives nextline
        }while(!isValidPassword(password));
       System.out.println("THANKS FOR ENTERING THE VALID PASSWORD: ");
    }
   

    //1>METHOD/FUNCTION
    public static boolean isValidPassword(String myPassword){

        return myPassword.length()>7;
        
    }
}