package Challenge86;

public class Car extends  Vehicle{
    @Override
    public void Service() {    ///override working here.............
        super.Service();
        System.out.println("car is getting servicedddddddd");
    }
}
