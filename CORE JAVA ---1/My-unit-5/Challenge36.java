import java.util.Scanner;

public class Challenge36 {
    public static void main(String[] args) {
        //WAP TO SHOW FIBONACCI SERIES UPTO CERTAIN NUMBER
        //FIBONACCCI SERIES IS THE SUM OF PREVIOUS TWO NUMBERS EXCEPT THE FIRST ONE
        //0,1,1,2,3,5,8,13,21,32,....
        Scanner input=new Scanner(System.in);
        System.out.println("PROGRAM FOR FIBONACCI SERIES");
        System.out.println("PLEASE ENTER THE NUMBER UPTO WHICH SERIES IS TO BE PRINTED:");
        int number=input.nextInt();
        System.out.println("HERE THE FIBONACCI SERIES BE: ");
        printFibonacci(number);
        
    }

    //create a method/function
    public static void printFibonacci(int num){
        //special case for fibonacci series to show number is true or not
        if(num<0) return;
        System.out.print("0 ");
        if(num==0) return;
        System.out.print("1 ");
        
        
        int first =0, second=1;
        while(first+second<=num){
          int third = first+second;
          System.out.print(third + " ");
          first = second;
          second = third;
          
        }


    }

    
}
