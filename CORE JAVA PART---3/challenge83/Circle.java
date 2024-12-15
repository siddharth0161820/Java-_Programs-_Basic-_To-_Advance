package challenge83;

public class Circle extends  Shape {
    //1>instance variable/properties
    private double radiusInCms;

    //2>create constructor for the circle

    public Circle(double radiusInCms) {
        this.radiusInCms = radiusInCms;
    }

    //3> to accesss it we neeed to have getteer setter

    public double getRadiusInCms() {
        return radiusInCms;
    }

    public void setRadiusInCms(double radiusInCms) {
        this.radiusInCms = radiusInCms;
    }
///4>taking responsibility of the parent class shape
    @Override
    public double calculateArea() {
        return Math.PI*Math.pow(radiusInCms,2);
    }
}
