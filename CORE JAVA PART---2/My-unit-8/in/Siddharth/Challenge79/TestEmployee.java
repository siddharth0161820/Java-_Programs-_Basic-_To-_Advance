package in.Siddharth.Challenge79;

public class TestEmployee {
    public static void main(String[] args) {
        //1>create object for the class i.e. Employee.java
        Employee myEmployee = new Employee("QWEF",23,23456);
        //2>ACCESS METHOODS USING OBJECTS

        System.out.println(  myEmployee.displayEmployeeDetails());//able to fetch employeedetails even it
        // is default bcz exist in same packages
        myEmployee.setEmployeeName("AADMI HU MEIN");
        System.out.println(myEmployee.displayEmployeeDetails());
        myEmployee.setEmployeeSalary(12);
        System.out.println(myEmployee.getEmployeeSalary());
    }
}
