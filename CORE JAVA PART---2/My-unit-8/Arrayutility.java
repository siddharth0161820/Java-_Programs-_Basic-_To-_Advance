import java.util.Scanner;

public class Arrayutility {
    //creating a methods jo user se array input krega

    public static int[] inputArray() {
        //paste all the codes of getting user input to the arrays so that it can be used for further arrays program as its common for all
       //ARRAY INPUT
       Scanner input=new Scanner(System.in);
       System.out.print("PLEASE ENTER THE NUMBER OF ARRAY:");
      
       int size =input.nextInt();
       //ARRAY DECLARATION
       int[] myNums=new int[size];
       //input every number one by one so use loop
       int i=0; //i=index
       while(i<size){
           System.out.print("PLEASE ENTER ELEMENT NUMBER "+(i+1)+ " : "); //i+1 bcz index is 0 then position will be i+1 wkt, (index+1=position)
          //number input under the array
          myNums[i]=input.nextInt();
           myNums[i]=input.nextInt();
           i++;

       }
       return myNums;

    }

    /////creating 2nd inptarray for display elemnet in 2-d array
    public static int[][] input2DArray() {
        //paste all the codes of getting user input to the arrays so that it can be used for further arrays program as its common for all
       //ARRAY INPUT
       Scanner input=new Scanner(System.in);
       //FOR ROWS
       System.out.print("PLEASE ENTER THE NUMBER OF ROWS:");      
       int rows =input.nextInt();
       //FOR COLUMNS
       System.out.print("PLEASE ENTER THE NUMBER OF COLUMNS:");      
       int columns =input.nextInt();
       //ARRAY DECLARATION
       int[][] myNums=new int[rows][columns];
       //APPLY TWO LOOPS FOR ROWS & FOR COLUMNS
       //ROWS
       int i=0; //i=index
       while(i<rows){
        //loops fpr columns
        int j=0;
        while(j<columns){
            System.out.print("PLEASE ENTER ELEMENT row: "+(i+1)
                   + ", column: "+(j+1)+ " :"); 
            //number input under the array
            myNums[i][j]=input.nextInt();

            j++;

        }
          
           i++;
       }
       return myNums;

    }




    //METHOD/FUNCTION TO DISPLAY ARRAY
    public static void displayArray(int[] numArray){
        int i=0; //i =index
        while (i<numArray.length){
            System.out.print(numArray[i] + " ");
            i++;

        }
        System.out.println();


    }
    
}
