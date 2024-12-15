package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestingCollections {
    public static void main(String[] args) {

        //1>Declaring/creating lists
        List<Integer> myNumList = new ArrayList<>();
        //2>methods of arraylist
        myNumList.add(2);
        myNumList.add(22);
        myNumList.add(32);
        myNumList.add(77);
        myNumList.add(-90);
        Utility.print(myNumList);
        Collections.sort(myNumList); // Offers methods like sort to sort lists in collections
        Utility.print(myNumList);
        Collections.reverse(myNumList);// Allows reversing the order of elements in a list with reverse
        Utility.print(myNumList);
        Collections.shuffle(myNumList); // Can shuffle the elements of a list
        // randomly using shuffle
        Utility.print(myNumList);

        //3>WANTS TO MAKE NUMList that is unmodifiable(list that cant be changed..).
        //creating unmodifiable list
        List<Integer>unmodifiableList = Collections.unmodifiableList(myNumList);
        System.out.println("Unmodifiable lists: " +unmodifiableList);
       //  unmodifiableList.add(22);

        List<Integer>singleton = Collections.singletonList(22222);
        System.out.println("Singletonlists: " +singleton);


    }
}
