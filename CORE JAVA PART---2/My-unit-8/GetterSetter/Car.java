package GetterSetter;

public class Car {
    private String carName; //need public access
    private String carModel; //need public access
    private double fuelLevel;
    private long costOfCar; //need default access

    /////DEFINE CONSTRUCTOR

     //If we dont use public access modifier we wont be able to access its class
    // into another packages lets check in GetterTest class -constructor

     public Car(String carName, String carModel, double fuelLevel, long costOfCar) {
        this.carName = carName;
        this.carModel = carModel;
        this.fuelLevel = fuelLevel;
        this.costOfCar = costOfCar;
    }
///////////////////////////////////////////////


//    public void setFuelLevel(double fuelLevel) {
//        this.fuelLevel = fuelLevel;
//    }


    /////////////////////////////////




    ////1> Getter and setter means make all the fields
    // of the particular things private  and if it needed to be accessed then it should be done by creating a methods()
    //for it

    //2> SO NOW READY TO CREATE METHODS() FOR GETTER AND SETTER
    //2.1> Method for carname
       /////////ADVANTAGES///GETTER AND SETTER///
    //1>INDINVIDUAL ACCESS CAN BE DEFINED ACCORDINGLY WHAT TO BE SET AND WHAT TO BE GET
    public String getCarName(){
        return carName;
    }

    //CREATING SETTER as can be set by only its claases but by other classes
    //have right to change the access modifer in the setter
     public   void setCarName(){
         //2> ADV GETTER AND SETTER
         //UNDER SETTER WE CAN DO ANY VALIDATION LIKE CONDITIONS AS PER YOUR CHOICE
         if(carName.equals("huri bawa")){
             System.out.println("bewakoof insaan!");
         }else{
             this.carName=carName;
         }

       }



    //2.2> Method for carmodel

    public String getCarModel(){

        return carModel;
    }


    //2.3> Method for fuellevel

    public double getFuelLevel(){
        return fuelLevel;
    }

    //2.4> Method for CostOfCar

    public long getCostOfCar(){
        return costOfCar;
    }
}
