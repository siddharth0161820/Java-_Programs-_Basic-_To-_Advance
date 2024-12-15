package CollectionFramework;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ArrayListTesting {
    public static void main(String[] args) {
        //1>Declaring List
      //  List strList = new ArrayList(); //THIS DECLARATION allows all type of datatype as
        //elements in the list so need to assign only 1 datatype
        //right way t declare ArrayList is..
        List<String> strList = new ArrayList<>(); //<>--diamond operator

        //2>Adding value to the ArrayList
        strList.add("Siddharth");  //1> add(E e): Appends the specified element
        strList.add("Kumar");


        //3> Now,iterate(find) elements from the Arraylist using index
        System.out.println(strList.get(0));
        System.out.println(strList.get(1)); //2> . get(int index): Returns
        // the element at the specified position.

        //4>Adding any element at any specified position
        strList.add(1," YASHWANT"); //add(int index, E element): Inserts at specified position

         //5> to remove any element from the ArrayList we dooooo-----
       //  strList.remove("Kumar");//remove(Object o): Removes the first
        // occurrence of the specified element

        strList.remove(2); // remove(int index): Removes the element
        // at the specified  position....

        //6>if we want to replace element at any specific position in the ArrayList
        strList.set(0,"Industrialist Father"); //set(int index, E element): Replaces
        // the element at the specified position..

    //7> check whether elements exists or not in the arraylists...
        //contains(Object o): Returns `true` if the list contains the
        //specified element.
       if(strList.contains(" YASHWANT")){
           System.out.println("YASHWANT EXISTS");
           System.out.println(strList.indexOf(" YASHWANT")); //9>

       }else{
           System.out.println("element out of the arraylists....");
       }

      // strList.clear(); //. 10> clear(): Removes all of the elements
        for (int i = 0; i < strList.size() ; i++) { //i =index position
            System.out.print(strList.get(i));
        }
        System.out.println();

        System.out.print(strList.size()); //8>size(): Returns the number of elements

        /////OR /// we can use for each loop////
        System.out.println();
        for(String str: strList){

            System.out.print(str);
        }
    }

}

////////////////NOTE///////////
//List<String> strList = new ArrayList<>(); //<>--diamond operator
    ///here,GENERIC<STRING>IS A COMPILE TIME  ,REMOVED WHEN TASK PERFORM FINALLY SO THAT
// WE DON'T PERFORM ANY MISTAKE AT THE COMPILE TIME........