package IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestIntermediateOperations {
    public static void main(String[] args) {
        //1> create a list with element inside it
        List<Integer> numbers = List.of(10,9,8,7,6,5,4,3,2,1);

        //2> different methods() of the Intermediate operations
          //2.1> sorted() --orders the elements of a stream
        //based on their natural order or a provided
        //comparator.


        //CREATE STREAM()
        List<Integer> sortedNumbers=  numbers.stream()
                .sorted() //sort the numbers
                .collect(Collectors.toList());//collect the sortednumbers into the list from stream
        System.out.println(numbers);
        System.out.println(sortedNumbers);

        //2.2> distinct()--filters out duplicate elements,
        //ensuring that every element in the resulting
        //stream is unique.
        List<String> fruits = List.of("Apples","Apples","Bananas","Lemon");

        //create streams

        List<String> distinctFruits =  fruits.stream()
                .distinct()
                .collect(Collectors.toList()); //collect the distinctfruit in the list
        System.out.println(fruits);
        System.out.println(distinctFruits);

        //2.3> map()----map() applies a function to each element of a
        //stream, transforming them into a new stream
        //of results based on the function logic.

        ////convert one stream into a new stream of results.
        //number of elements remain same.

        ////1> create a list with string elements to it
        List<String> words = Arrays.asList("me","you","i");
           //2>create stream
       List<String>upperCaseWords =   words.stream()
                .map(String::toUpperCase)
           .collect(Collectors.toList());//collect uppercasewords in the list
        System.out.println(words);
        System.out.println(upperCaseWords);






    }
}
