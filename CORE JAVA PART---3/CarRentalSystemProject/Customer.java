package CarRentalSystemProject;

public class Customer {
    //1>Defining/declaring instance variable/attributes
    private String customerId;
    private  String customerName;

    //2>defining/declaring the constructor


    public Customer(String customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }

    //3> defining/declaring the getter() method

    public String getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }


}
