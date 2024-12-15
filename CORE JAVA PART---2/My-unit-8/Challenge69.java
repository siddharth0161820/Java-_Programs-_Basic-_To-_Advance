import java.util.Scanner;
public class Challenge69{
    public static void main(String[] args) {
        
        //Create a program using recursion to check if a string is a palindrome using recursion.
        // Palindrome number in java: A palindrome number is a number that is same after reverse.
        //  For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers.
        //  It can also be a string like LOL, MADAM etc.
        
////NOTE: ITS IMPORTANT TO CREATE FUNCTUONS/METHODS IN THE RECURSION

        //1> USER INPUT
        Scanner input=new Scanner(System.in);
        //2>READING USER INPUT
        System.out.println("WELCOME TO THE PALINDROME CHECKER\n:");
        System.out.print("PLEASE,ENTER THE STRINGS TO BE CHECKED:");
        String myStr= input.next();

        //4>CALLING/INVOKING THE FUNCTION USING TERNARY OPERATOR
        System.out.println("YOUR STRING IS " + 
                            ((isPalindrome(myStr)  ? "Palindrome"
                                                   : "Not Palindrome")));

    }
    //3>METHOD/FUNCTION
    public static boolean isPalindrome(String ourStr){

        //5> base case is:
        if(ourStr.length()<=1){
            return true;
        }
        int lastpos=ourStr.length()-1;
        if(ourStr.charAt(0)!=ourStr.charAt(lastpos)){
            return false; //here if first character and last character not equal then its not palindrome
            //now,create substring to check character at 2nd position and lastpos-1
        }

        //6> create sub string
        String subStr=ourStr.substring(1,lastpos); //lastpos indrx  is not inclusive means last index will be skipped 
        return isPalindrome(subStr);
    }


}