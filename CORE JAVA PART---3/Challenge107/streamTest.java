//.Convert an array of strings into a stream. Then, use the
//stream to print each string to the console.
//

package Challenge107;

import java.util.Arrays;
import java.util.List;

public class streamTest {
    public static void main(String[] args) {

        //1> create a list with element into it
        List<String> names = Arrays.asList("NameSearching","Diwit",
                "Himanshi(Mamu's Queen)","Tejas","Siddharth","Ritu",
                "Nitu","Bhawna","Priti","JIJA JI3","JIJA JI2","JIJA JI1",
                "MA","PAPA");
        //OR

//        List<String> names = List.of("NameSearching","Diwit",
//                "Himanshi(Mamu's Queen)","Tejas","Siddharth","Ritu",
//                "Nitu","Bhawna","Priti","JIJA JI3","JIJA JI2","JIJA JI1",
//                "MA","PAPA");




        //2> convert arrays of strings to stream
        System.out.println(" ");
        names.stream()
                //now ,print
                .forEach(namess-> System.out.println(namess));
    }
}
