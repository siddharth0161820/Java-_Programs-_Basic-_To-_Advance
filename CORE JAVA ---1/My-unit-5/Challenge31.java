import java.util.Scanner;

public class Challenge31 {
    public static void main(String[] args) {
        //WAP THAT COMPUTES THE SUM OF THE DIGITS OF AN INTEGER
        Scanner input=new Scanner(System.in);
        System.out.println("SUM OF DIGITS OF AN INTEGER");
        System.out.println("PLEASE ENTER THE NUMBERS");
        int num=input.nextInt();
        int sum=sumOfDigits(num);
        System.out.println("THE SUM OF DIGITS: "+sum);
        
    }
    //creating function/methods
    public static int sumOfDigits(int num){
        int sum =0;
        while(num>0){//324==num
           // sum+=num% 10;
           sum=sum+(num% 10);
            num=num/10;
          //  num/=10;

        }
        return sum ;

    }
}