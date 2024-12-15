import java.util.Scanner;

public class Challenge18 {
    public static void main(String[] args) {
        
        //WAP TO DETERMINE IF A GIVEN YEAR IS A LEAP YEAR(CONSIDERING  CONDITIONS LIKE DIVISIBLE BY 4 BUT  NOT 100,UNLESS ALSO DIVISIBLE BY 400  )

        //using user input
        Scanner input=new Scanner(System.in);
        //Reading user input
        System.out.println("WELCOME TO LEAP YEAR CALCULATOR");
        System.out.print("Please enter the year to check leap year:");
        int year =input.nextInt();

        //if -else condition
        if(year%400==0||(year%4==0 && year!=100)){
            System.out.println("This is a leap year");
        }
        else {
            System.out.println("This is not a leap year");

        }

        
    }
    
}
