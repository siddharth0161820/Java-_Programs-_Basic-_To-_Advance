//Write a program that takes a string and returns the number of
//unique characters using a Set...
package Challenges95;

import javax.xml.stream.events.Characters;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacters {
    public static void main(String[] args) {
        //1>declaring/creating characters
        Set<Character> unique = new HashSet<>();
        //2>TAKING STRING FROM THE USER
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your string: ");
        String myString = input.next();
        for (char myChar : myString.toCharArray()) {
            unique.add(myChar);
        }
        System.out.printf("Your string has %s unique characters ",unique.size());
    }
}
