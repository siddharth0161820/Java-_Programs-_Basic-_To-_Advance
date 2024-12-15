import java.util.Scanner;

public class Challenge41 {

    public static void main(String[] args) {
        //TO CHECK A NUMBER PRESENCE IN AN ARRAY FIRST TAKE A USER INPUT
        Scanner input=new Scanner(System.in);
        //WAP TO FIND NUMBER OF OCCURRENCES OF AN ELEMENT IN AN ARRAY
        System.out.println("WELCOME TO ARRAY OCCURRENCES\n");
        //ARRAY INPUT
        int[] myNums=Arrayutility.inputArray();
        System.out.println("NOW ENTER THE NUMBER YOU WANT TO FIND");
        int nums=input.nextInt();
        int occurrences=noOfOccurrences(myNums, nums);
        System.out.println("Your element was found "+ occurrences +" times in the array");
        
    }
    //ceate a method/functionm
    public static int noOfOccurrences(int[] myNums,int nums){
        //perform normal searching
        int occurrences=0;
        int i=0;//i=index
        while(i<myNums.length){ 
            if(myNums[i]==nums){
                occurrences++;
            }
            i++;

        }

        return occurrences;

    }
}
