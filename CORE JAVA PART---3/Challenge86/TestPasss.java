package Challenge86;

public class TestPasss {
    public static void main(String[] args) {
        //1> create object for parent class i.e..Vehicle and child class  i.e...car
        Car car = new Car();
        Vehicle vehicle  = new Vehicle();

        //2> call/invoke the methods()/functions
        vehicle.Service();
        car.Service();

    }
}
