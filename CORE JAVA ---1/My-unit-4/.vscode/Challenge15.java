import java.util.Scanner;

public class Challenge15 {

    public static void main(String[] args) {
        //WAP TO DETERMINES IF A NUMBER IS POSITIVE ,NEGATIVE OR ZERO
        //SING USER INPUT
        Scanner input=new Scanner(System.in);
        //reading user input
        System.out.println("lets solve this challenge:");
        System.out.println("Please inter a number :");
        int number = input.nextInt();


        if(number==0){
            System.out.println("The number is zero:");

        }else if(number>0){
            System.out.println("The number is a postive number:");


        }
        else {
            System.out.println("The number is a negative number:");
        }
       
        System.out.println("Thank You");
        
    }
}