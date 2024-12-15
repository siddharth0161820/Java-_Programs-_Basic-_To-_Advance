public class Challenge46 {
    public static void main(String[] args) {
        System.out.println("CHECKING WHETHER THE ARRAY IS PALINDROME OR NOT\n");
        //WAP TO CHECK THE ARRAY IS PALINDROME OR NOT
        //PALINDROME ======MOVING FROM LEFT TO RIGHT OR VICE-VERSA  NAME OR NUMBERS REMAINS SAME;
        //INPUT ARRAY 
        int[] myArr= Arrayutility.inputArray();
        //INVOKING/CALLING THE METHOD/FUNCTION
        boolean isPalin=isPalindrome(myArr);
        //conditions
        if(isPalin){
            System.out.println("THE GIVEN ARRAY IS PAINDROME");
        }
        else{
            System.out.println("THE GIVEN ARRAY IS NOT PALINDROME");

        }


    }
    //CREATING A METHOD/FUNCTION
    public static boolean isPalindrome(int[] myArr){
        int i=0;
        while(i<myArr.length/2){
           // if(myArr[i]!=myArr[myArr.length-1-i]){
                 if(myArr[i]!=myArr[(myArr.length-1)-i]){

                return false;

            }
            i++;

        }


        return true;

    }

    
}
