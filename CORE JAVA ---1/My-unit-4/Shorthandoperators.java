import java.util.Scanner; //This scanner class is used to get user input & found in java.util package

public class Shorthandoperators {
    public static void main(String[] args) {
        int x;
        x=100;
         //SHORTHAND OPERATOR
         //1> ADDITION ASSIGNMENT  //x+=4;-----> x=x+4;
         System.out.println(x+=4);
         System.out.println("The value of x: " +x);

         //2> SUBTRACTION ASSIGNMENT  //x-=4;-----> x=x-4;
         System.out.println(x-=4);
         System.out.println("The value of x: " +x);



         //1> MULTIPLICATION ASSIGNMENT  //x*=4;-----> x=x*4;
         System.out.println(x*=4);
         System.out.println("The value of x: " +x);



         //1> DIVISION ASSIGNMENT  //x/=4;-----> x=x/4;
         System.out.println(x/=4);
         System.out.println("The value of x: " +x);


         //1> REMAINDER ASSIGNMENT  //x%=4;-----> x=x%4;  %---MOD
         System.out.println(x%=4);
         System.out.println("Eventually,the value of x: " +x);


         ////USING SCANNER METHOD
         Scanner input= new Scanner(System.in); // using user input method
         //Reading user input
         System.out.println("Enter the value of Y: ");
         int y = input.nextInt();
         y+=3; //ADDITION ASSIGNMENT Y=Y+3;
         System.out.println(y);
         y-=3;  //SUBTRACTION ASSIGNMENT Y=Y-3;
         System.out.println(y);
         y*=3; //MULTIPLICATION ASSIGNMENT Y=Y*3;
         System.out.println(y);
         y/=3; //DIVISION ASSIGNMENT Y=Y/3;
         System.out.println(y);
         y%=3; //REMAINDER ASSIGNMENT Y=Y%3;
         System.out.println(y);
         System.out.println("THANKS FOR CODING SHORTHAND OPERATORS");




         
    }
    
}
