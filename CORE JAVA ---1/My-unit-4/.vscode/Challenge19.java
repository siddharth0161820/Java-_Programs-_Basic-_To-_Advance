import java.util.Scanner;

public class Challenge19 {
    public static void main(String[] args) {
        //wap to calculate grades based on marks  A---ABOVE 90%;;B----ABOVE 75%;;C---ABOVE 60%;; D--ABOVE 30%;; F---BELOW 30%

        //USING USER INPUT
        Scanner input=new Scanner(System.in);
        //READING USER INPUT
        System.out.println("CALCULATING GRADES OF STUDENTS ON THE BASIS OF PERCENTAGE:");
        int percent =input.nextInt();
        
        //if-else()
        if(percent>90){
            System.out.println("CONGO,DEAR YOU SCORED GRADE A");
            
        }
        else if(percent>75){
            System.out.println("YOU SCORED GRADE B");

        }
        else if(percent>60){
            System.out.println("you scored grade c");

        }
        else if(percent>30){
            System.out.println("YOU SCORED GRADE D");

        }
        else{
            System.out.println("you scored grade F");
        }

        }


    }
    

