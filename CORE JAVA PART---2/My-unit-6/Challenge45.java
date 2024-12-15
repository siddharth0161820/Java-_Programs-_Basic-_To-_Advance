public class Challenge45 {
    public static void main(String[] args) {
        System.out.println("WELCOME TO ARRAY REVERSING");
        //WAP TO REVERSE AN ARRAY
        //getting number from the array
        int[] myNum= Arrayutility.inputArray();
        //invoking/calling the emthod/function
        reverse(myNum);
        System.out.println("YOUR REVERSED ARRAY IS:");
       //displaying array method/function in Arrayutility.java
       Arrayutility.displayArray(myNum);



    }
    //CREATING A METHOD/FUNCTION 
    public static void reverse(int[] arr){ //using void as output bcz we just need to reverse element in an array without getting any int as ouytput
     //reversing an array
     //using loop
     int i=0; //i=index
     while (i<arr.length/2) {
        //SWAP ALGORITHM
        int swap=arr[i];
        arr[i]=arr[(arr.length-1)-i];
        arr[(arr.length-1)-i]=swap;
        i++;

        
     }
       
    }

    
}
