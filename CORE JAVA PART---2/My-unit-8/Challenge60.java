import java.util.Scanner;

public class Challenge60 {
    public static void main(String[] args) {
        //Create a program using do-while to implement a number guessing game
        //1>user input
        Scanner input=new Scanner(System.in);
        //2>
        int num=5,guess;//will check this niumber is guessed right by use ror not
        //3>read input
        System.out.println("WELCOME TO THE GUESSING GAME: ");
        //3>APPLY DO WHILE LOOP 
        do{
            
        System.out.print("PLEASE,ENTER THE NUMBER BETWEEN 0 AND 10: ");
        guess =input.nextInt();


        }while(num !=guess);
        System.out.println("YOU HAVE SUCCESSFULLY GUESSED THE NUMBER");

    }
    
}
