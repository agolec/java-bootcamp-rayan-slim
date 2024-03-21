package shape;
public class SphereWB12_3 extends ShapeWB12_3 {

    public SphereWB12_3(double radius) {
        super(radius);
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(super.getRadius(),2);
    }

    @Override
    public double getVolume() {
        return (4/3) * Math.PI * Math.pow(super.getRadius(),3);
    }

}