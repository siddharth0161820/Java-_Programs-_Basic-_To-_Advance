//This class stores the combination of Customer class and Car class
//which customer will take which car

package CarRentalSystemProject;

public class Rental {
    //we know that class is also a datatype but not primitive

    //1> instance variable/attributes
    private Car car;
    public Customer customer;
    private int rentalDays;

    //2> Constructor


    public Rental(Car car, Customer customer, int carRentalDays) {
        this.car = car;
        this.customer = customer;
        this.rentalDays = rentalDays;
    }

    //3> Getter method()

    public Car getCar() {
        return car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getRentalDays() {
        return rentalDays;
    }
}
