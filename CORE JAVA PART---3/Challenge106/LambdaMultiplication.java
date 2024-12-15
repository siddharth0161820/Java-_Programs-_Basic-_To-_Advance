//Write a lambda expression that takes two integers and
//returns their multiplication. Then, apply this lambda to a
//pair of numbers

package Challenge106;

import java.util.function.BinaryOperator;

public class LambdaMultiplication {
    public static void main(String[] args) {
        //1> Multiplication of two numbers in functional programming---lambda

           //Lambda expression that takes two integer and returns their multiplication
        BinaryOperator<Integer> multi = (a, b) -> a * b;

        //2> Apply the above lambda expression to a pair  of numbers
       int result=  multi.apply(4,5);
        System.out.printf("The result for multiplication using lambda expressions: %d",result);
    }

}