package Challenge109;

import java.util.Arrays;
import java.util.List;

public class OddNumbers {
    public static void main(String[] args) {

        //1>Declaring/creating list of integers
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,25);

        //2>Filter Odd Numbers
             numbers.stream()
                     .filter(numbOdd->numbOdd%2==1) //operation to filter out
                      // odd numbers
                   .forEach(numOdd -> System.out.println(numOdd));

    }
}
