//Write a program that sorts a list of String objects in descending
//order using a custom Comparator.
package Challenges90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Comparator {
    public static void main(String[] args) {
        //METHOD --1 TO CREATE  LIST
        List<String> strList = new ArrayList<>(); //<>--diamond operator

        //2>Adding value to the ArrayList
        strList.add("Tiger");  //1> add(E e): Appends the specified element
        strList.add("Bear");
        strList.add("Lion");
        System.out.println(strList);
        sortInDescending(strList);
        System.out.println(strList);

        ////////////METHOD--2 TO CREATE LIST///
        List<String> list = Arrays.asList("ear","arm","waist");//TO CREATE STRINGS DIRECTLY FROM THE ELEMENTS
        System.out.println(list);
        sortInDescending(list);
        System.out.println(list);


    }
    //1>CREATE A METHOD()/FUNCTION()---implemetations done here
    public static void sortInDescending(List<String>strList){
        Collections.sort(strList);// Offers methods like sort to sort lists in collections

    }
    public static void sortInDescendingg(List<String>list){
        Collections.sort(list);// Offers methods like sort to sort lists in collections

    }

}

///////////this one is incomplete///////////////
