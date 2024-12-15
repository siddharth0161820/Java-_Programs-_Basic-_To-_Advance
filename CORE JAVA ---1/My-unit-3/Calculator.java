import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO OUR CALCULATOR");
        System.out.print("Enter the first Number: ");
        int firstNum =input.nextInt();

        System.out.print("Now,please enter the second number: ");
        int secondNum = input.nextInt();
        int sum = firstNum + secondNum;
        System.out.println("Sum of your numbers is: " + sum);
        System.out.println("Thank you");

    }
    
}
