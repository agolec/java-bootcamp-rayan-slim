package shape;

public abstract class ShapeWB12_3 {
    
    private double radius;

    public ShapeWB12_3(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public abstract double getArea();
    public abstract double getVolume();


}