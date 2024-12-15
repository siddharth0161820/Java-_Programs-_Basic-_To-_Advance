package in.Siddharth.Challenge79;

class Employee {
    //1>Instance variable
    private String employeeName;
    private int employeeAge;
    private double employeeSalary;

    //4>package-private(default) method to displayEmployeeDetails.
    String displayEmployeeDetails(){
        return "EmployeeDetails:Name:"+employeeName
                                     +",Age:"+employeeAge
                                      +",Salary:"+employeeSalary;

    }

    //2>defining constructor for the  class

 Employee(String employeeName, int employeeAge, double employeeSalary) {
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeeSalary = employeeSalary;
    }

    //3> generate getter and setter for all 3 attributes

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
}


