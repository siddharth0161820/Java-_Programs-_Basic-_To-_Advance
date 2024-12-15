package PassBy;

public class TestPassByReference {
    //4>
    public static void main(String[] args) {
        //5>create object for point
        Point first = new Point(3,4);
        System.out.println("First: " + first);
        move(first); //point going to move method()
        System.out.println("First: " + first);
    }


    //6>create method()
    public static void move(Point p){
        p.X++;
        p.Y++;
        System.out.println(p);

    }
    //1>create inner class as Point
    public static class Point{
        //2> instance variable for class point
        int X;
        int Y;

        //3>constructor for point class

        public Point(int x, int y) {
           this.X = x;
            this.Y = y;
        }

        //7> define two string
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Point{");
            sb.append("X=").append(X);
            sb.append(", Y=").append(Y);
            sb.append('}');
            return sb.toString();
        }
    }
}
