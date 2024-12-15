// Create a list of employees with name and salary fields.
//Write a comparator that sorts the employees by salary.
//Then, use this comparator to sort your list using the sort
//stream operation.
package Challenge114;

public class Employee {

    //1> instance variable
   private String employeeName;
  private   int employeeSalary;

    //2> constructor

    public Employee(String employeeName, int employeeSalary) {
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    //3> getter

    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    //4> create toString

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("employeeName='").append(employeeName).append('\'');
        sb.append(", employeeSalary=").append(employeeSalary);
        sb.append('}');
        return sb.toString();
    }
}
