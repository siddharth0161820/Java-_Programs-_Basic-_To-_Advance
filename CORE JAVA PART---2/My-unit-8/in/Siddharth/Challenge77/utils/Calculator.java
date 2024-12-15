package in.Siddharth.Challenge77.utils;

import in.Siddharth.Challenge77.geometry.Circle;
import in.Siddharth.Challenge77.geometry.Rectangle;

//import in.Siddharth.Challenge77.geometry.*; //means geometry pacakge k andar jo hai sbko utha lao but not recommended


public class Calculator {
    public static void main(String[] args) {
        //1> defining methods to calculate the areas of rectangle and circle

        //2>create objects for circle
        Circle myCircle = new Circle(4.5);

        //3>create objects for rectangle
        Rectangle myRectangle = new Rectangle(4,5);

        //4>Now calculating areas for the both
        double circleArea = Math.PI*Math.pow(myCircle.radius,2);
        double rectangleArea = myRectangle.length * myRectangle.breadth ;
        System.out.printf("Area of the circle is : %f,Area of the rectangle is: %f"
                , circleArea,rectangleArea);
    }
}
