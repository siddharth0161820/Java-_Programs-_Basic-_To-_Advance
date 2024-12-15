import java.util.Scanner;

public class Challenge29 {
    public static void main(String[] args) {
       //WAP TO SUM ALL ODD NUMBER FROM 1 TO A SPECIFIED NUMBER n
       Scanner input=new Scanner(System.in);
       System.out.println("WELCOME TO THE SUM OF ODD NUMBERS UPTO N");
       System.out.print("PLEASE ENTER THE NUMBERS:");
       int num=input.nextInt();
       //calling /invoking
       int sum= oddSum(num);
       System.out.println("oddSum till " + num+ " is : "+sum);

        }
        //CREATE THE FUNCTIONS/METHODS
        public static int oddSum(int num){
            int sum=0;
            int i=1;
            while(i<=num){
                sum+=i;
                i+=2;
          
            }

            return sum;

        }



    }
    

