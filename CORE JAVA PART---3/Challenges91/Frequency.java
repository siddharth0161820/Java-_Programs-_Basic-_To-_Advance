package Challenges91;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Frequency {
    public static void main(String[] args) {
        //1> creating a list
        List<Integer>myList = Arrays.asList(21,21,3,4,5,6,7,8,9,10,10,9,1,4);
        System.out.println(Collections.frequency(myList,1)); //frequency means ek paticular number
        //ek list m kitni baar available hein..
        System.out.println(Collections.frequency(myList,10));
        System.out.println(Collections.frequency(myList,4));
        System.out.println(Collections.frequency(myList,21));

    }
}
