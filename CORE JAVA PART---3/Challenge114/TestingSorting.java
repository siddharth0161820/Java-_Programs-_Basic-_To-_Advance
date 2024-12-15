package Challenge114;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestingSorting {
    public static void main(String[] args) {
        //1>create list with an element to it for the employee class
        List<Employee> employee = Arrays.asList(
         //now create object for the employee
        new Employee("Siddharth",300000),
        new Employee("Kumar",200000),
        new Employee("Singh",100000)
        );

        //2>create stream
        employee.stream()
                .sorted((emp1,emp2)-> emp1.getEmployeeSalary()- emp2.getEmployeeSalary()) //use lambda
                .forEach(System.out::println);
    }
}
