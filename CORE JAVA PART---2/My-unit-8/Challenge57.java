import java.util.Scanner;

public class Challenge57 {
    public static void main(String[] args) {
        //Create a program to print the month of the year based on a number (1-12) input by the user.
         //1> INPUT USER
        Scanner input=new Scanner(System.in);
        //2> reading user input
        System.out.println("WELCOME TO THE MONTH OF THE YEAR DETECTOR\n");
        System.out.println("ENTER YOUR MONTHS IN NUMBER: ");
        int monthNum=input.nextInt();
        //call/invoke method
        String monthName=getMonthName( monthNum);
        System.out.println("THE MONTH NAME IS: " + monthName);



    }
    ///method/function
public static String getMonthName(int monthNum){  ///add static to access static variables
    return switch(monthNum){
    case 1 -> "JANUARY";
    case 2 -> "FEBRUARY";  
    case 3 -> "MARCH"; 
    case 4 -> "APRIL"; 
    case 5,6 -> "SUMMER VACATION"; 
    case 7 -> " ";
    case 8 -> "AUGUST";
    case 9 -> "SEPTEMBER";
    case 10 -> "OCTOBER";
    case 11-> "NOVEMBER";
    case 12 -> "DECEMBER";
    default -> "INVALID";
};

}
}
