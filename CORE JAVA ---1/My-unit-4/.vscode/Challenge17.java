import java.util.Scanner;

public class Challenge17 {
    public static void main(String[] args) {
        //WAP to determine the greatest amongst three

        //USING USER INPUT
        Scanner input= new Scanner(System.in);
        //READING USER INPUT
        System.out.println("FINDING THE GREATEST AMONGST THREE INTEGERS:");
        System.out.println("PLEASE ENTER THE FIRST NUMBERS:");
        int FIRST =input.nextInt();
        System.out.println("PLEASE ENTER THE SECOND NUMBERS:");
        int SECOND =input.nextInt();
        System.out.println("PLEASE ENTER THE THIRD NUMBERS:");
        int THIRD =input.nextInt();

        //USING IF-ELSE()
        if(FIRST>=SECOND && FIRST>=THIRD){
            System.out.println("THE GREATEST NUMBER IS: "+FIRST);

        }
        else if(SECOND>=THIRD && SECOND>=THIRD){
            System.out.println("THE GREATEST NUMBER IS: "+SECOND);


        }
        else{
            System.out.println("THE GREATEST NUMBER IS: "+THIRD);
       
        }

    }
    
}
