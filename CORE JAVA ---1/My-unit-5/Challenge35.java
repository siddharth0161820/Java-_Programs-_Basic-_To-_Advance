import java.util.Scanner;

public class Challenge35 {
    public static void main(String[] args) {
        //WAP TO REVERSE THE DIGIT OF A NUMBER
        Scanner input=new Scanner(System.in);
        System.out.println("REVERSE OF  NUMBERS:");
        System.out.println("Please enter the number");
        int num=input.nextInt();
        int reverse=reverse(num);
         System.out.println("REVERSE OF NUMBER IS: "+reverse);

        
    }
    //creating a method/function
    public static int reverse(int num){
        int newNum=0;
        while(num>0){
            int digit=num% 10;
            newNum = newNum*10+digit;
            num /=10; 
        }
        return newNum;

    }


   
   
}



