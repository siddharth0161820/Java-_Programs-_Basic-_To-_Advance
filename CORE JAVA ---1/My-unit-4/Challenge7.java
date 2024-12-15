import java.util.Scanner; // this scanner class is used to get user input & found in java.util package


public  class Challenge7 {
    public static void main(String[] args) {
        
        //create a program to swap two numbers.
       //using user input method
       Scanner input = new Scanner(System.in);
       System.out.println("Welcome to Swapping Station\n\n");
       
       //Reading User input
       
       System.out.print("Enter the value of A: ");
       int a = input.nextInt();

     
      System.out.print("Enter the value of B: ");
      int b = input.nextInt();
      
      //create new variable 
      int c =a;
      a=b;
      b=c;

      System.out.println("Swapping is done");
      System.out.println("The value of A: " +a);
      System.out.println("The value of B: " +b);
      System.out.println("THANKS!");




    }
    
}
