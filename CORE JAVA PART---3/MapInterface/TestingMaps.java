package MapInterface;

import java.util.HashMap;
import java.util.Map;

public class TestingMaps {
    public static void main(String[] args) {
        //1>Creating /declaring Map Interface
        Map<String,Integer> myMap = new HashMap<>();
                //reference always of interface = its implementation

        //2>Methods()/functions of Map Interface....
        //2.1> put(K key, v value)--we can put any keys any values in the map
        myMap.put("Siddharth",7);
        myMap.put("Kumar",17);
        myMap.put("Sid",74);
        myMap.put("Sidheart",743);
        myMap.put("Sidkmr",907);
        System.out.println(myMap.size()); //get the size of the map
        System.out.println(myMap);
        System.out.println(myMap.get("Siddharth")); //we can get the
        // value by giving the respective key of the value....
        System.out.println(myMap.containsKey("Sidd"));//check and say whether any key is there is map or not
        System.out.println(myMap.containsKey("Sid"));
        System.out.println(myMap.containsValue(743));//check and say whether any values is there is map or not
        System.out.println(myMap.containsValue(43543));
        ////remove(object key)--if want to remove any values from the map can be done from the key
        System.out.println(myMap.remove("Sidheart"));//gives it key as the o/p
        System.out.println(myMap.size()); //get the size of the map
        System.out.println(myMap.remove("Sidkmr"));
        System.out.println(myMap.size());



        ////Now if we want to iterate or print each and every value of the map then ////
        for (String key : myMap.keySet()) {
            System.out.printf("%s:%s\n",key,myMap.get(key));
            
        }
        System.out.println(myMap.size());
        System.out.println(myMap.values());
    }
}
