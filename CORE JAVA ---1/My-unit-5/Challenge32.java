import java.util.Scanner;

public class Challenge32 {
    public static void main(String[] args) {
        //WAPP TO FIND LEAST COMMON  FACTOR(LCM) OF TWO NUMBERS
        Scanner input=new Scanner(System.in);
        System.out.println("LEAST COMMON FACTOR OF TWO NUMBERS");
        System.out.println("PLEASE ENTER THE  FIRST NUMBERS");
        int myFirstNum=input.nextInt();
        System.out.println("PLEASE ENTER THE SECOND NUMBERS");
        int mySecondNum=input.nextInt();
        int lcm=lcm(myFirstNum,mySecondNum);
        System.out.println("lcm of the two numbers: "+lcm);

      
        
    }
    //creating function/methods
    public static int lcm(int myFirstNum,int mySecondNum){
        int i=1;
        while(i<=mySecondNum){
            int factor=myFirstNum*i;
            if(factor%mySecondNum==0){
                System.out.println();
                return factor;
            }
            i++;
        }
        return 0; //unreacable
    }
   

    }
