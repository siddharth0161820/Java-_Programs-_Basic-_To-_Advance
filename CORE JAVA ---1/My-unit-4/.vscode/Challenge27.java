import java.util.Scanner;

public class Challenge27 {
    public static void main(String[] args) {
        //wap to check if a given number is even or odd using bitwise operators
        //USER INPUT METHOD
        Scanner input =new Scanner(System.in);
        //READING USER INPUT
        System.out.println("GETTING EVEN OR ODD NUMBERS USING BITWISE OPERATORS:\n\n");
        System.out.println("ENTER THE  NUMBER:");
        int myNumber=input.nextInt();
        

        //use if else()
        if((myNumber&1)==0){
            System.out.println("The result will be even:");
        }
        // else{
        //     System.out.println("The result will be odd");
        // }

    }
    
}
