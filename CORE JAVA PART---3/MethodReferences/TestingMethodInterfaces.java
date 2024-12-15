package MethodReferences;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestingMethodInterfaces {
    public static void main(String[] args) {
        //1>declaring/creating the arraylist with elements into it.
        List<Integer> myList = List.of(1,2,3,4,5,5,7,3,3,3);


        /////UNDERSTANDING HOW TO USE METHOD REFERENCES///////////////
        //2> PRINT NUMBERES USING FUNCIONAL PROGRAMMING
        myList.stream()
                .filter(numb->numb%2 ==1)
                .forEach(numb-> System.out.println(numb));

           ///IMPLEMENTING METHOD REFERENCES////
        System.out.println("\n");
        myList.stream()
                .filter(numb->numb%2 ==1)
                .forEach(System.out::println);


        //4>Printing the list of elements using lambda
          //try to make the below code into method reference
        System.out.println("Printing the sum of elements in streams using lambda");
        int newSum2 = myList.stream()
               // .reduce(0,(a,b) -> a+b);
                 .reduce(0, Integer::sum); //apply method references
        System.out.printf("sum using reduce is %d\n",newSum2);


    }
}
