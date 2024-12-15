package CollectionFramework;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args) {

        //1>Declaring set
        Set<String> names = new HashSet<>();

        //2>Different methods() of the Set Interface
             //2.1> add()---> adds the specified elements to the set.
        System.out.println(names.add("MAHAKAL"));
        System.out.println(names.add("MAA PARVATI"));
        System.out.println(names.add("LORD GANESHAY "));
        System.out.println(names.add("LORD KARTIKEY"));
        System.out.println(names.add("NANDI MAHARAJ"));
        System.out.println(names.add("ME US WE"));
 Utility.print(names);

        System.out.println(names.add("ME US WE")); //does not allow duplicate elements..
        System.out.println(names.size());

        System.out.println(names.isEmpty());
        System.out.println(names.contains("ME US WE"));
        System.out.println(names.remove("ME US WE"));

        System.out.println(names.contains("ME US WE"));
        Utility.print(names);
        System.out.println(names.size());

        System.out.println(names.add("MEIAURMEREMAHADEV"));
        System.out.println(names.size());
        Utility.print(names);

    }
}
