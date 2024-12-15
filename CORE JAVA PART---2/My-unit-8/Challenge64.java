import java.util.Scanner;

public class Challenge64 {
    public static void main(String[] args) {
        //Create a program using for-each to the occurrences of a specific element in an array
        //1>creating  scanner claas for umber input that is to be searched
        

        //1> user input
        Scanner input=new Scanner(System.in);
        
        //2>READING USER INPUT

            System.out.println("WELCOME TO GET THE OCCURRENCES OF AN ELEMENT IN AN ARRAY \n");
            //3> DECLARING THE ARRAYS ELEMTNT FROM ARRAYUTILITY
            int[] myArr= Arrayutility.inputArray();
            System.out.print("Please,enter the number you want to search for: ");
            int element=input.nextInt();
            //callinf /invoking the function/method
           int occur=   countOccurrences(myArr,element);
           System.out.println("YOUR ELEMENT WAS FOUND: " + occur  + "  TIMES.");

    }
    //method/function
    public static int countOccurrences(int[] myArr, int element){
        int occur=0;
        for(int num:myArr){
            if(num==element){
                occur++;
            }
        }
        return occur;
    }

    
}
