import java.util.Scanner;

public class Challenge28 {
    public static void main(String[] args) {
        //WAP THAT PRINTS THE MULTIPLICATION TABLE FOR A GIVEN NUMBER
        //user input method
        Scanner input=new Scanner(System.in);
        System.out.println("WELCOME TO MULTIPLICATION WORLD\n");
        System.out.print("Please Enter The Number: ");
        int num=input.nextInt();
        //passing/invoking myMultiplicationTable()
        myMultiplicationTable(num);


    }
      ///1st> create a function/method
      public static void myMultiplicationTable(int num) {
        //applying loop
        int i=1; //initialization
        while(i<=10){//condition
            System.out.println(num +"*" + i + "="  + (num*i));
            i++;


        }
        
      }
}
    

