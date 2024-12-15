import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        //LEARNING SWITCH
        //1> INPUT USER
        Scanner input=new Scanner(System.in);
        //2> reading user input
        System.out.println("WELCOME TO THE DAYS OF THE WEEK DETECTOR\n");
        System.out.println("ENTER YOUR DAY IN NUMBER: ");
        int days=input.nextInt();
       // System.out.println("ENTER YOUR NUMBERS: ");
       // int numbers= input.nextInt();
        //CALLING/INVOKING THE METHODS/FUNCTIONS
       // oldSwitch(days);
        newSwitch(days);


        //3>USING SWITCH TO PRINT THE DAYS
    //     switch(days){
    //         case 1 :
    //         System.out.println("Monday");
    //         break;
    //         case 2:
    //         System.out.println("TUESDAY");
    //         break;
    //         case 3:
    //         System.out.println("WEDNESDAY");
    //         break;
    //         case 4:
    //         System.out.println("THURSDAY");
    //         break;
    //         case 5:
    //         System.out.println("FRIDAY");
    //         break;
    //         case 6: 
    //         System.out.println("SATYURDAY");
    //         break;
    //         case 7:
    //         System.out.println("SUNDAY");
    //         break;
    //         default: 
    //         System.out.println("INVALID DAYS");
    //         break;
        
    // }
    ///////////2> switch statement 2///////////////////
    //3>USING SWITCH TO PRINT THE DAYS
//     switch(numbers){
//         case 1 :
//         System.out.println(3);
//         break;
//         case 2:
//         System.out.println(16);
//         //break;
//         case 3:
//         System.out.println(18);
//         //break;
//         case 4:
//         System.out.println(20);
//         //break;
//         case 5:
//         //fall -through
        
//         case 6: 
//         System.out.println(1);
//         break;
//         case 7:
//         System.out.println(2);
//         break;
//         default: 
//         System.out.println("INVALID numbers");
//         break;
    
//  }
    
}
///method/function
public static void newSwitch(int days){  ///add static to access static variables
    String strDays=switch(days){
    case 1 -> "MONDAY";
    case 2 -> "TUESDAY";  
    case 3 -> "WEDNESDAY"; 
    case 4 -> "THURSDAY"; 
    case 5 -> "FRIDAY"; 
    case 6 ,7-> "HOLIDAY"; 
    
    default -> "INVALID";
};
System.out.println(strDays);
}
// public static void oldSwitch(int days){
//     switch(days){
//         case 1 :
//         System.out.println("Monday");
//         break;
//         case 2:
//         System.out.println("TUESDAY");
//         break;
//         case 3:
//         System.out.println("WEDNESDAY");
//         break;
//         case 4:
//         System.out.println("THURSDAY");
//         break;
//         case 5:
//         System.out.println("FRIDAY");
//         break;
//         case 6: 
//         System.out.println("SATYURDAY");
//         break;
//         case 7:
//         System.out.println("SUNDAY");
//         break;
//         default: 
//         System.out.println("INVALID DAYS");
//         break;
    
}



