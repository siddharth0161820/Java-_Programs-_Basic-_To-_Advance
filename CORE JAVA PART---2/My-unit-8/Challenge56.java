import java.util.Scanner;

public class Challenge56 {
    public static void main(String[] args) {
        //Create a program to Based on a student's score, categorize as 
// "High", "Moderate", or "Low" using the ternary operator (e.g., 
// High for scores > 80, Moderate for 50-80, Low for < 50).

//USING NESTED TERNARY OPERATOR---TERNARY OPERATYOR K ANDAR TERNARY OPERATOR
 //1> user input
        Scanner input=new Scanner(System.in);
        //2>READING USER INPUT
        System.out.println("WELCOME TO  STUDENT SCORE \n");
        System.out.println("Please enter your marks: ");
        int Marks=input.nextInt();
        String category=Marks>80? "High" : (Marks > 50 ? "Moderate" : " Low");//if-else if-else type

        System.out.println("YOUR CATEGORY IS " + category);

    }
    
}
