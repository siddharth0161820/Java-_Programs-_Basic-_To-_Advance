package CollectionFramework;

import java.util.Collection;

public class Utility {
    //1>create method
    public static <E> void print(Collection<E> collection) {
        System.out.print("Collection is: ");
        for (E coll : collection) { //for-each loop
            System.out.printf("%s" ,coll);
            
        }
        System.out.println();

    }

}
