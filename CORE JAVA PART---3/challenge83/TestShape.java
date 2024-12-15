package challenge83;

public class TestShape {
    public static void main(String[] args) {
      //1> create object for the classes
        //object for the Shape
       // Shape myShape = new Shape(); // not possible as class is abstract

        //object for the circle
        Circle myCircle = new Circle(2.5);

        //object for the Square
        Square mySquare = new Square(5);
        System.out.printf("Area of Circle is %.2f\n ",myCircle.calculateArea());
        System.out.printf("Area of Square is %.2f \n",mySquare.calculateArea());


    }
}
