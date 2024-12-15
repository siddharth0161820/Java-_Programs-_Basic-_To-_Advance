//Write a function that accepts a string and returns an
//Optional<String>. If the string is empty or null, return an
//empty Optional, otherwise, return an Optional containing the
//uppercase version of the string.
package Challenge112;

import java.util.Optional;

public class OptionalString {
    public static void main(String[] args) {
        System.out.println(toOptional(null));
        System.out.println(toOptional(""));
        System.out.println(toOptional("qwpoorfkbmgk"));

    }
    //1> method defining argument as string str and return opional string
         ///or
    //a function that accepts a string and returns an Optional<String>

   public static Optional<String> toOptional(String str){
        //check argument passed str is empty or null
       //if(str == null || str.isEmpty()){
       if(str == null || str.equals(" ")){
           return Optional.empty();
       }
       return Optional.of(str.toUpperCase());
   }
}
