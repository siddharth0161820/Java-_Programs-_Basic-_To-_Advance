package FilterandReduceOperation;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestingFilter {
    public static void main(String[] args) {

        //1>declaring/creating the list of fruits and into it
        List<String> fruits = Arrays.asList("Apple","Orange","Guava","PineApple","Mango","Banana");

        //2>performing the methods of the list
        System.out.println(fruits.size());
        System.out.println("Printing the fruit normally");

        //3>printing the list of the fruits
        for (String fruit : fruits) {
            System.out.println(fruit);

        }
        System.out.println("\n") ;

        //4>printing the list of the fruits using functional programming-streams
        System.out.println("Printing the fruit by streams");
        fruits.stream().forEach(new Consumer<String>() { //pass new consumer
            @Override
            public void accept(String fruit) {
                System.out.println(fruit);

            }
        });
        System.out.println("\n");

         //5>printing the list of the fruits using -Lambda

        System.out.println("Printing the list of fruits using lambda");
        fruits.stream().forEach(fruit-> System.out.println(fruit));

        //Now unerstanding the filter
        System.out.println("\n");
        System.out.println("Printing the list of fruits using filter");
        fruits.stream()
              //  .filter(fruit->fruit.endsWith("e")) //helps to do which fruits/elements to send first what to stops
                          //OR//

                .filter(fruit->{return fruit.endsWith("e");}) //helps to do which fruits/elements to send first what to stops

                .forEach(fruit-> System.out.println(fruit));
    }
}
