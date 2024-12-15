import java.util.Scanner;

public class Perimeterrectangle {
    public static void main(String[] args) {
        //using user input method
        Scanner input=new Scanner(System.in);//read user input
        System.out.println("CHECKING THE PERIMETER OF THE RECTANGLE: ");
        System.out.println("ENTERING THE 4 SIDES OF THE RECTANGLE in cms:");
        int a= input.nextInt();
        int b= input.nextInt();
        int c= input.nextInt();
        int d= input.nextInt();

      int perimeter  = a+b+c+d;
      System.out.println("THE PERIMETER OF A RECTANGLE ABCD: "+perimeter+"cm");
      System.out.println("EVENTUALLY, WE SUCCEED IN GETTING THE PERIMETER OF THE RECTANGLE ABCD");



        
    }
    
}
