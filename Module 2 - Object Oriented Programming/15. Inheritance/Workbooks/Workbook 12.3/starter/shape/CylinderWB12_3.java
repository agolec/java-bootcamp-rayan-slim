package shape;

import static java.lang.Math.PI;

public class CylinderWB12_3 extends ShapeWB12_3 {

    private double height;

    public CylinderWB12_3(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    @Override
    public double getArea() {
        final int AREA_CONSTANT = 2;
        final int POWER_CONSTANT = 2;
        return AREA_CONSTANT * PI * Math.pow(this.getRadius(),POWER_CONSTANT) + AREA_CONSTANT * PI * this.getRadius() * this.getHeight();
    }

    @Override
    public double getVolume() {
        final int SQUARED = 2;
        return PI * Math.pow(this.getRadius(),SQUARED) * this.getHeight() ;
    }
}
  