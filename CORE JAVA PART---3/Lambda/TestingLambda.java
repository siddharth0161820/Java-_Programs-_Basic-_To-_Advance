package Lambda;

import java.util.function.BinaryOperator;

public class TestingLambda {
    public static void main(String[] args) {
        //create object for lambda
        TestingLambda  test = new TestingLambda();
        //now , understand lambda syntax

          //1> No argument passed
        Runnable hello = () -> System.out.println("Hello");

        //2> One Argument passed
        //toPrint -> System.out.println(toPrint);

        //3> Two argument passsed
        //  (2,3) -> 2+3;
        BinaryOperator<Integer> multi = (a, b) -> a * b;

        int result = multi.apply(2,3);
        System.out.println(result);

        //4> with explicit argument types
        //(Integer 2, Integer 3) -> 2+3;

        //5>Multiple statements
//        (a,b)-> {
//            int Sum=a+b;
//            System.out.println(Sum);
//        }
    }



    //1>create the method()/function sum
    public int Sum(int a,int b){
        int Sum = a+b;
        return Sum;
    }

    //2> create 2nd method ()/function
    public void printString(String toPrint){
        System.out.println(toPrint);
    }
}
