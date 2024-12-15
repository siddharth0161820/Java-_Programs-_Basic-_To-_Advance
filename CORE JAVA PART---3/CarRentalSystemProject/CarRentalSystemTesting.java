package CarRentalSystemProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CarRentalSystemTesting {

    //1>To store the data/details we will use arrayList because
    // it change its size automatically as per the requirement but Arrays size is fixed ..

    private List<Car> cars =  new ArrayList<>(); //TO STORE CAR WE MADE/declare AN ARRAYLIST
    private List<Customer> customers = new ArrayList<>();
    private List<Rental> rentals = new ArrayList<>(); //data of which car is rented by which customer.

    //2>//create a method and making an empty arraylist in the memory to i/p data
    //public  CarRentalSystemTesting() {
    // cars = new ArrayList<>();
    //  customers = new ArrayList<>();
    //  rentals = new ArrayList<>();
    // }

    //3>create the method()
    //3.1> method--1
    public void addCar(Car car) { //car is also an object of car itself
        // just like cars polymorphism(downcasting ) used heree....
        cars.add(car); //add() is the method of List interface where we
        // can add/append elements into the arraylist
    }

    //3.2> method---2
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    //3.3> method---3 for renting car
    public void rentCar(Car car, Customer customer, int carRentalDays) {
        //apply if-else method
        if (car.isCarAvailable()) {
            car.carRent();
            rentals.add(new Rental(car, customer, carRentalDays));

        } else {
            System.out.println("Hey,car not available sorry for your inconvenient...");
            System.out.println("Have a great time,Thank You");
        }

    }

    //3.4> method --4 for returning car
    public void returnCar(Car car) {
        car.returnCar();
        Rental rentalToRemove = null;
        for (Rental rental : rentals) { //for-each loop rentals.for+enter
            if (rental.getCar() == car) {
                rentalToRemove = rental;
                break;
            }
        }
        if (rentalToRemove != null) {
            rentals.remove(rentalToRemove); //remove() to remove element from the list
            System.out.println("Car returned successfully.");

        } else {
            System.out.println("car not rented.");
        }
    }

    //3.5> method--5
    public void menu() {
        //Taking input from the user
        Scanner input = new Scanner(System.in);
        while (true) { //applying while loop and it will repeat the loop unless u dont exit or comes true
            System.out.println("=======CAR RENTAL SYSTEM======");
            System.out.println("1> Rent a car");
            System.out.println("2> Return a car");
            System.out.println("3> Exit");
            System.out.print("Please,enter your choice: ");
            int choice = input.nextInt();
            input.nextLine(); //consume newLine


            if (choice == 1) {
                System.out.println("\n== Rent a car==\n");
                System.out.print("Please,Enter The Customer Name: ");
                String customerName = input.nextLine();

                //Now show the available cars
                System.out.println("\nAvailable cars details: ");
                for (Car car : cars) { //for-each loop cars in arraylist
                    if (car.isCarAvailable()) {
                        System.out.println(car.getCarId() + "_" + car.getCarBrand() + " " + car.getCarModel());
                    }
                }
                System.out.print("\nPlease,enter the carId you want to hire: ");
                String carId = input.nextLine();


                System.out.print("Please,enter the number of days for rental: ");
                int rentalDays = input.nextInt();
                input.nextLine();

                ///Now create object for the customer class
                Customer myCustomer = new Customer("CUS" + (customers.size() - 1), customerName);
                addCustomer(myCustomer);

                Car selectedCar = null;
                //apply for-each loop to check whether car selected by cust there or nt
                for (Car car : cars) {
                    if (car.getCarId().equals(carId) && car.isCarAvailable()) {
                        selectedCar = car;
                        break;
                    }
                }
                if (selectedCar != null) {
                  double totalPrice = selectedCar.calculatePrice(rentalDays);
                    System.out.println("\n==Rental Information ==\n");
                    System.out.println("Customer Id: " + myCustomer.getCustomerId());
                    System.out.println("Customer Name : " + myCustomer.getCustomerName());
                    System.out.println("Car: " + selectedCar.getCarBrand() + " " + selectedCar.getCarModel());
                    System.out.println("Rental Days: " + rentalDays);
                    System.out.printf("Total Price: $%.2f%n", totalPrice);
                    System.out.print("\nConfirm Rental (Y/N): ");
                    String confirm = input.nextLine();


                    if (confirm.equalsIgnoreCase("Y")) {//equalsignorecase() of string to accept
                        // uppercase or lowercase
                        rentCar(selectedCar, myCustomer, rentalDays);
                        System.out.println("\n car hired successfully");
                    } else {
                        System.out.println("\n Hiring denied ");
                    }
                } else {
                    System.out.println("Invalid selection or car not validate for rent.");
                }
            } else if (choice == 2) {
                System.out.println("\n==Return a car==\n");
                System.out.print("Enter the car ID yo want to return: ");
                String carId = input.nextLine();
                //CHECK THE RESEPCTIVE CAR WENT FOR HIRING BEFOREHAND OR NOT
                Car carToReturn = null;
                for (Car car : cars) {
                    if (car.getCarId().equals(carId) && !car.isCarAvailable()) {
                        carToReturn = car;
                        break;
                    }
                }
                if (carToReturn != null) { //car found which went for rent
                    Customer customer = null;
                    for (Rental rental : rentals) {
                        if (rental.getCar() == carToReturn) {
                            customer = rental.getCustomer();
                            break;

                        }

                    }
                    if (customer != null) {
                        returnCar(carToReturn);
                        System.out.println("Car returned successfully by: " + customer.getCustomerName());
                    } else {
                        System.out.println("Invalid carId or car is not hired..");
                    }
                } else if (choice == 3) {
                    break;
                } else {
                    System.out.println("Invalid choice.Please enter the valid options");
                }
            }
            System.out.println("\nThank You for using Car Rental system!");
            System.out.println("\nHave a safe and healthy journey");
        }
    }


    ///////////////////////////////////////////////
    //Implmentation part
    public static void main(String[] args) {
        //declare/define object for the class
        CarRentalSystemTesting myCarRentalSystemTesting = new CarRentalSystemTesting();

        //enter the detail of all cars
        Car car1 = new Car("A0016", "Rolls-Royce",
                "Ghost", 3434);//Different base price
        // per day for each car

        Car car2 = new Car("B0018", "Mercedes-Benz",
                "S-Class", 2424);

        Car car3 = new Car("C020", "Toyata",
                "Land Cruiser 300", 1434);

        Car car4 = new Car("D023", "Range Rover",
                "Land Rover Range Rover 3.0 I LWB Autobiography", 0434);

        Car car5 = new Car("E024", "Jaguar",
                "I-Pace", 1);


        //Now add the details to an empty arrayList
        myCarRentalSystemTesting.addCar(car1);
        myCarRentalSystemTesting.addCar(car3);
        myCarRentalSystemTesting.addCar(car4);
        myCarRentalSystemTesting.addCar(car5);

        myCarRentalSystemTesting.menu();
    }
}







