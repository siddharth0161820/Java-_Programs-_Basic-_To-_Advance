package FilterandReduceOperation;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestingReduce {
    public static void main(String[] args) {
        //1>declaring/creating the arraylist with elements into it.
        List<Integer> myList = List.of(1,2,3,4,5);
        
        //2>get the sum of elements into the list normally
        int sum =0;
        //apply for-each loop
        for (Integer numbers : myList) {
            sum+=numbers;
        }
        System.out.println("Printing the sum of elements in the list normally");
        System.out.println(sum);


        //3> get sum of  elements using functional programming-stream
      int newSum =   myList.stream()
                .reduce(0, new BinaryOperator<Integer>() { //under reduce give new binaryoperator integer
                    @Override
                    public Integer apply(Integer integer, Integer integer2) {
                        return integer + integer2;
                    }
                });
        System.out.println("Printing the sum of elements in streams  using reduce");
        System.out.printf("sum using reduce is %d\n",newSum);

        //4>Printing the list of elements using lambda
        System.out.println("Printing the sum of elements in streams using lambda");
        int newSum2 = myList.stream()
                .reduce(0,(a,b) -> a+b);
        System.out.printf("sum using reduce is %d\n",newSum2);

        //5>finding the max  elements within the list
        System.out.println("Getting maximum element within the list");
        int max = myList.stream()
                .reduce(Integer.MIN_VALUE,(a,b) -> a>b ?a:b); //here we applied ternary operator
        System.out.printf("max using reduce is %d\n",max);


        //6>finding the min elements within the list
        System.out.println("Getting minimum element within the list");
        int min = myList.stream()
                .reduce(Integer.MAX_VALUE,(a,b) -> a<b ?a:b); //here we applied ternary operator
        System.out.printf("min using reduce is %d\n",min);
    }
}
