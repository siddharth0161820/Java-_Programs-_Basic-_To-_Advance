package Enums;

public class TestingEnums {
    public static void main(String[] args) {
              TrafficLight color = TrafficLight.RED;
              color = TrafficLight.YELLOW;

              Grade myGrade = Grade.valueOf("A");
           
              //wanna iterate at enums
        for (Grade value : Grade.values()) {
            System.out.println(value);
        }
        System.out.println("\n");


        TrafficLight myTrafficLight = TrafficLight.valueOf("RED");

        //wanna iterate at enum
        for (TrafficLight value : TrafficLight.values()) {
            System.out.println(value);
        }
    }

}
