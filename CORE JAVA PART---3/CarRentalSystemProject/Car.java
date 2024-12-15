package CarRentalSystemProject;

public class Car {
    //1> defining/declaring the instance variable/attribute of class Car
    //making instance variable of the car private so that no ne outside the car class can access it
    private String carId;
    private String carBrand;
    private String carModel;
    private double carBasePricePerDay;
    private boolean carIsAvailable;

////////////////////////////////////////////////////////////////////////////////////////

    //2>Creating/defining the constructor
    //If we don't declare the constructor then JVM by-default
    // add constructor in every class..

    //Constructor purpose--- constructor initialize new objects and set
    // initial states for the objects attributes..


    public Car(String carId, String carBrand, String carModel,
               int carBasePricePerDay) {
        this.carId = carId;
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carBasePricePerDay = carBasePricePerDay;
        this.carIsAvailable = true; //we do it true bcz we know that a car is available for renting(1 car detail that we printed).
    }
    //////////////////////////////////////////////////////////////////////////////////


        //3>Now, to access the car attribute/variable we
        // need to make a method() of it as a public using getter method().

        //Getter and setter means make all the fields
        // of the particular things private  and if it needed to
        // be accessed then it should be done by creating a methods() for it


        public String getCarId() {
            return carId;
        }

        public String getCarBrand() {
            return carBrand;
        }

        public String getCarModel() {
            return carModel;
        }

        public double calculatePrice(int  rentalDays) {
            return carBasePricePerDay* rentalDays;
        }

        public boolean isCarAvailable() {
            return carIsAvailable;
        }
///////////////////////////////////////////////////////////////////////////////////////

    //4> create a method()/function for the car
    public void carRent(){
        carIsAvailable = false;
    }

    public void returnCar(){
        carIsAvailable = true;
    }

    }


///NOTE:Here we will not use setter() method bcz we dont need to
// set a value for any attributes of the class Car.
