import java.util.Scanner;

public class Challenge38 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("PALLINDROME  OF  NUMBERS:");
        System.out.println("Please enter the number");
        int num=input.nextInt();
        boolean isPalindrome=isPalindrome(num);
        if(isPalindrome){
                  System.out.println("THE NUMBER IS PALINDROME:");
        }
        else{
            System.out.println("THE NUMBER IS NOT PALINDROME:");
        }
         
    }
    //2>CREATE A METHOD/FUNCTION
    public static boolean isPalindrome(int num){
       // int reverse=reverse(num);
       // return num==reverse;//return an expression that will be evaluated in boolean
        return num==reverse(num);//method ko aap call/invoke krte h wo khud m expression ho jata hai
        

        

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



