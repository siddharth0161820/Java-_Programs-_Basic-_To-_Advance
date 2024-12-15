//. Create a Map where the keys are country names (as String)
//and the values are their capitals (also String). Populate the
//map with at least five countries and their capitals. Write a
//program that prompts the user to enter a country name
//and then displays the corresponding capital, if it exists in
//the map.

package Challenge98;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryMap {
    public static void main(String[] args) {
        //to check time(in milisecond) taken to run the complete program
        // till it gives o/p is
        long  startTime = System.currentTimeMillis();

        //1>Create/declare Map
        Map<String,String> countryMap = new HashMap<>();

        //2>Methods to put values into the map
        countryMap.put("BHARAT", "DELHI");
        countryMap.put("NEPAL", "KATHMANDU");
        countryMap.put("USA", "WASHINGTON, D.C.");
        countryMap.put("UK", "LONDON");
        countryMap.put("RUSSIA", "MOSCOW");

        //3>CREATE USER INPUT
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the country name: ");
        String country = input.next();

        //use if-else comndtion to check country exists int he map r not
        if(countryMap.containsKey(country)){
            System.out.printf("Capital of %s is %s.",country,countryMap.get(country));

        }else{
            System.out.println("Sorry not able to recognize the capital...");

        }
        long endTime = System.currentTimeMillis();
        System.out.printf("\nTotal time taken to run the code :%d ",(endTime-startTime));
    }
}
