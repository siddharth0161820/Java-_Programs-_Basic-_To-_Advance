//108.Given a list of strings, use stream operations to filter out
//strings that have length of 10 or more and then
//concatenate the remaining strings....

package Challenge108;

import java.util.List;

public class stringFilterAndConcatenate {
    public static void main(String[] args) {
        //1> declaring/creating the list with elements into it..
        List<String> strs = List.of("Hi","mei kon","mein Siddharth",
                "do mahine mein", "iss sehar se bahar rahuga",
                "nhi rahoge","promise");

        //2> filter out the element with legth more than 10
      String result =   strs.stream()
                .filter(str->str.length()>10) //operation to filter out
                       // strings that have length of 10 or more
                 .reduce("",(a,b)->a + " " + b); //concatenate the remaining strings
        System.out.println("Printing the concatenate the remaining strings");
        System.out.println(result);
    }
}
