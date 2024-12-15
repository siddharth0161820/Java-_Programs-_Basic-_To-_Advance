//WAP TO SHOW DISCOUNT ON TICKET IF AGE <5 ---75 % ;; IF FEMALE DISCOUNT--50% ;;MALE && age>60----discount 25%

import java.util.Scanner;
public class Logicaloperators {
    public static void main(String[] args) {
        // logical operators using if-else()
        //using user input method
        Scanner input=new Scanner(System.in);
        //READING USER INPUT
        System.out.println("WELCOME TO LOGICAL OPERATORS:");
        System.out.println("WELCOME TO TICKET DISCOUNT DISCOUNT CALCULATOR:");
        System.out.println("PLEASE,ENTR YOUR AGE:");
        int age =input.nextInt();
        System.out.print("Are you a female? (true/false)");
        boolean isFemale=input.nextBoolean();


        //apply if-else()
        if(age<5){
            System.out.println("Is eligible for 75% ticket discount");
        }
        else if(isFemale){
            System.out.println("Is eligible for 50% ticket discount");
        }else if(age>60 && !isFemale){
            System.out.println("Is  eligible for 25% discount on the ticket:");
        }
        else{
            System.out.println("Not eligible for any discount:");
        }
    }
    
}
