package challenge83;

public class Square extends Shape {

    //1>INSTANCE PROPERTIES/VARIABLES
    private  double sideInCms;


    //2> defining constructor for the class square

    public Square(int sideInCms) {
        this.sideInCms = sideInCms;
    }


    //3> to get its access create the getter setter


    public double getSideInCms() {
        return sideInCms;
    }

    public void setSideInCms(int sideInCms) {
        this.sideInCms = sideInCms;
    }

    //4>as we get thw property of the parent class so define its responsibility
    @Override
    public double calculateArea() {
        return Math.pow(sideInCms,2);
    }
}
