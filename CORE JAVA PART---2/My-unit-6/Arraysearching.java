import java.util.Scanner;

public class Arraysearching {
       public static void main(String[] args) {
        //USER INPUT METHOD
        Scanner input=new Scanner(System.in);
        //WAP TO SEARCH AN ARRAY OR ARAAY TRAVERSING
        ////ARRAY DECLARATION METHOD 2
        int[] arr={3,4,7,87,42,31,99,8,98,33};
     
        //READING USER INPUT
        System.out.println("WELCOME TO ARRAY SEARCHING\n");
        System.out.print("Please,Enter the number you want to search: ");
        int num=input.nextInt();
        boolean isFound=isFound(arr, num);
        if(isFound){
            System.out.println("Your number was found in an array");
        }else{
            System.out.println("Your number is not found in an  array:");
        }

        
        


    }
    //CREATE A METHOD/FUNCTION
    public static boolean isFound(int[] arr,int num){
        //loop
        int index=0;
        while(index<arr.length){
            if(arr[index]==num){
                return true;

            }
            index++;
        }
        return false;
    
   

}
}
