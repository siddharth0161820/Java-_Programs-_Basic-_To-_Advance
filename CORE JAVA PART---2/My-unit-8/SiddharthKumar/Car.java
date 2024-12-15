package SiddharthKumar;

public class Car {

    //1> INSTANCE VARIABLE
    public String carName;
    public String carModel;
    private double fuelLevel; // private ownership means full authority given within the class
    // no outsider can access to it or read it or modify it

    private long coastOfPurchase;
    long CoastOfPurchase; //default ownership assigned here, no accesss modifier assigned here
     //can be accessed witin the packages itself not outside the packages
    //for this design DefaultTEST class under Sidd packages


     //1>CREATING THE TOString()

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("carName='").append(carName).append('\'');
        sb.append(", carModel='").append(carModel).append('\'');
        sb.append(", fuelLevel=").append(fuelLevel);
        sb.append(", coastOfPurchase=").append(coastOfPurchase);
        sb.append('}');
        return sb.toString();
    }

    //2> deining default constructor
    Car(){ //defining a default constructor so that we can define other constructor
          //in other constructor we see access to private fields possible within same classs
        //trouble while accessing outside the class

    }
    //3>DESIGNING THE CONSTRUCTOR

    public Car(String carName, String carModel, double fuelLevel, long coastOfPurchase ) {
        this.carName = carName;
        this.carModel = carModel;
        this.fuelLevel = fuelLevel;
        this.coastOfPurchase = coastOfPurchase;

        //4> now to access the details of the class car we need to design new obj of the class in asccess test

    }


}


