//Given an array of integers, create a stream, use the distinct
//operation to remove duplicates, and collect the result into
//a new list.

package Challenge113;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestingDistinct {
    public static void main(String[] args) {

        //1> create a list of elements store to it.
        List<Integer> numbers = Arrays.asList(1,2,2,2,3,3,4,5,6,7,8
                ,9,9,9,9,9,0,0,0,0,11,11,11,12,12,12,12);

        //2> create a stream
        List<Integer> distinctNumbers= numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(numbers);
        System.out.println(distinctNumbers);




    }
}
