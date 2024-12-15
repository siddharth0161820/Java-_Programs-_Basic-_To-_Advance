package Challenges85;

public class Calculator {
    //1> Add methods()
    public int add(int first , int second){
        return first+second;
    }
    //2> ADD three integeres
    public int add(int first, int second, int third){
        return first+second+third;

    }

    //3> ADD TWO DOUBLES
    public double add(double first, double second){
        return first+second;
    }

    public static void main(String[] args) {
        //trying to test here itself
        //4> create object for the calculator
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2,34));
        System.out.println(calculator.add(2,4,4));
        System.out.println(calculator.add(2.03,4.54));



    }

}
