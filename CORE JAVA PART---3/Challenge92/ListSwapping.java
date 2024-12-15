//Write a method that swaps two elements in an ArrayList, given
//their indices.
package Challenge92;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSwapping {
    public static void main(String[] args) {
        ///1> CREATE LIST
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(list);
        swap(list,2,3,4);
        System.out.println(list);


    }
    //2>CREATE A SWAPPING METHOD()
    public static void swap( List<Integer> list, int x, int y, int z){ //(list name with indexes)
    int swap = list.get(x);//create int as swap and save x value to it with method get
         list.set(x, list.get(y));//x position pe y ki value rakho
        list.set(y, list.get(z));//y position pe z ki value rakho
        list.set(z, swap);


    }
}