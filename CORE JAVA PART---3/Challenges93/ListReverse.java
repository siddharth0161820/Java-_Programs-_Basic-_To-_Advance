//Create a program that reverses the elements of a List and prints
//the reversed list.

package Challenges93;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListReverse {
    public static void main(String[] args) {
        //2. creating/declaring a list;;
        List<Integer>myList = Arrays.asList(1,2,3,4,5,6,7,22);
        System.out.println(myList);
        reverse(myList);
        System.out.println(myList);


    }

    //1.2>CREATE A SWAPPING METHOD()
    public static void swap( List<Integer> myList, int x, int y){ //(list name with indexes)
        int swap = myList.get(x);//create int as swap and save x value to it with method get
        myList.set(x, myList.get(y));//x position pe y ki value rakho
        myList.set(y, swap);


    }
    //1>Method()/function name reverse();;
    public static void reverse(List<Integer>myList){
      //  Collections.reverse(myList);
        //////reverse of list manually via swapping method///
        for (int i = 0; i < myList.size()/2; i++) { //mylist.size k half tk hi swapping kro for reverse
        ListReverse.swap(myList, i, myList.size()-1-i);


        }

    }

}
