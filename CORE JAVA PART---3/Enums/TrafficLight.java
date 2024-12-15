package Enums;

public enum TrafficLight {
    RED("STOP"),GREEN("GO"),YELLOW("READY/CAUTION");



    //2> want to add message what to do with the above mentioned colors
    private final String action;

    //3> constructor
    TrafficLight(String action) {
        this.action = action;
    }

}
