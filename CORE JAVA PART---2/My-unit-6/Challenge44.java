import java.util.Scanner;

public class Challenge44{
    public static void main(String[] args) {
        //number to be input apart from array means new array
        Scanner input=new Scanner(System.in);
        //WAP TO RETURN A NEW ARRAY DELETING A SPECIFIC ELEMENT
        System.out.println("WELCOME TO ARRAY DELETION\n:");
        //ARRAY INPUT
        int[]numArr=Arrayutility.inputArray();
        //number to be deleted
        System.out.println("Now,Enter the number you want to delete:");
        int numToDelete=input.nextInt();
        //invoking/calling the method/function
        int[] newArr= deleteNumber(numArr, numToDelete);
        System.out.println("HERE IS YOUR NEW ARRAY\n");
        //displaying array method/function in Arrayutility.java
        Arrayutility.displayArray(newArr);

    }
    //CREATE A METHOD/FUNCTION WHICH GIVES NEW ARRAY AND DELETE OLD ARRAY
    //method taking array and deleting a number and returns new array
    public static int[] deleteNumber(int[]numArr,int numToDelete){
        //NOW GET OCCURRENCES AFTER DOING ALL WORK OF DISPLAY ARRAY METHOD/FUNCTION
        int occurrences=Challenge41.noOfOccurrences(numArr, numToDelete); //argumnet m no of occurrences k lye numarr mai numtodelete dalo
        //handling special case for all kind of troubles to get rid off
        if(occurrences==0){
            return numArr;
        }
        ///making newsize array
        int newsize=numArr.length-occurrences;
        //declaring new size new array
        int[]newArr=new int[newsize];
       //ARRAY TRAVERSING AND DELETING A SPECIFIC VALUE
       //FOR INITIAL ARRAY & new array together
       int i=0,j=0;//i =index of 1st array & j= index of 2nd array
       while(i<numArr.length){
        if(numArr[i]!=numToDelete){
            newArr[j]=numArr[i];
            j++;
        }
        i++;
       }



        return newArr;

    }


}