import java.util.Scanner;

public class Challenge20 {
    public static void main(String[] args) {
        //wap that categorize a person into different age groups ;;CHILD--BELOW 13;;TEEN--BELOW,20;;ADULT--BELOW 60;;;SENIOR---ABOVE 60

        //USER INPUT METHOD
        Scanner input= new Scanner(System.in);
        //READING USER INPUT
        System.out.println("CATEGORY OF A PERSON WITH DIFFERENT AGE");
        int age=input.nextInt();

        //using if-else()
        if(age>=65){
            System.out.println("YOU ARE A SENIOR");
        }
        else if(age>=20){
            System.out.println("YOU ARE AN ADULT");

        }
        else if(age>=13){
            System.out.println("YOU ARE A TEEN");

        }
        else{
            System.out.println("YOU ARE A CHILD");
        }
        System.out.println("THANK YOU");

    }
    
    
}
