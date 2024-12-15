package TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestTerminalOperations {
    public static void main(String[] args) {
        //1>create a list with an integer element to it
        List<Integer> numbers  = Arrays.asList(1,2,3,4,5,6,7,8,9,0);

        //implementing different methods of Terminal Operations
        //1> max()
//        finds the largest element in the stream according to a given
//        comparator or natural ordering.
        Optional<Integer>maxNumbers = numbers.stream()
                .max(Integer::compareTo);

        maxNumbers.ifPresent(System.out::println);

        //2>min()
//        identifies the smallest element in the stream based on a provided
//        comparator or natural ordering.
        Optional<Integer>minNumbers = numbers.stream()
                .min(Integer::compareTo);

        minNumbers.ifPresent(System.out::println);


        //3>  collect(Collectors.toList())
       // gathers all the elements of the stream into a new List.
        //using this operation we can change list to stream and again stream to list
        List<String> words = Arrays.asList("Siddharth","regret","return back as much u can");

        //create stream
        List<String> collectWords = words.stream()
                .collect(Collectors.toList()); //collect the final stream data  in the list

        System.out.println(collectWords);


    }
}
