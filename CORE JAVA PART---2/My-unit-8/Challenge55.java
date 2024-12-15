import java.util.Scanner;
public class Challenge55 {
    public static void main(String[] args) {
        //Create a program to calculate the absolute value of a given integer
        //ABSOLUTE VALUE MEANS I22I ==22
        //1> user input
        Scanner input=new Scanner(System.in);
        //2>READING USER INPUT
        System.out.println("WELCOME TO  THE ABSOLUTE VALUE CHECKER \n");
        System.out.println("Please enter the  number: ");
        int Number=input.nextInt();
        int result=Number>=0? Number:-Number;//number:true else return -number(false)
        System.out.println("THE ABSOLUTE VALUE OF A NUMBER IS: " + result);


    }
    
}
