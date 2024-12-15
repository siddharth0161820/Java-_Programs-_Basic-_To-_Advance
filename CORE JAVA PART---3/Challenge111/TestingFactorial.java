//.Write two versions of a program that calculates the factorial
//of a number: one using structural (procedural) programming,
//and the other using functional programming.

package Challenge111;

import java.util.stream.IntStream;

public class TestingFactorial {
    public static void main(String[] args) {
        ////2> call/invoke the method/function
        System.out.println("Factorial using two ways: ");
        System.out.println(" 1> Factorial using structural programming ");
            //3> declare number globally
        int number =4;
        System.out.println(factrial(number));

        ///2nd ways to find factorial of a number using functional programming
        System.out.println(" 2> Printing the factorial of a number using functional programming");
        IntStream.rangeClosed(2, number)
             // .forEach(System.out::println); //methodreference --System.out::println to check the numbers to be printed is passing correctly
                .reduce((a,b)-> a*b)
                .ifPresent(System.out::println);

    }
    //1> Method ---1
    //Structural method to write factorial of a number

    public static long factrial(int num){
        if (num == 0 || num == 1) {
            return 1;
        }
        long fact =1;
        for (int i = 2; i <=num ; i++) {
            fact*=i;
        }
        return fact;
    }
}
