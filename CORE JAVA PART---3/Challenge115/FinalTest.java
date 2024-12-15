//.Create a list of strings representing numbers ("1", "2", ...).
//Convert each string to an integer, then again calculating
//squares of each number using the map operation and sum
//up the resulting integers.

package Challenge115;

import java.util.Arrays;
import java.util.List;

public class FinalTest {
    public static void main(String[] args) {

        //1> create a list with an element to it
        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5");

        //Convert each string to an integer..
        //2> create a stream

         numbers.stream()
               // .map(str->Integer.parseInt(str))
                .map(Integer::parseInt) //via compiler editor
        //calculate squares of each numbers using map
                .map(num->Math.pow(num,2))
                 //sum  up the resulting integers
                 .reduce((a,b)->a+b)
                 .ifPresent(System.out::println);







    }
}
