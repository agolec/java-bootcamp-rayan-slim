import shape.CylinderWB12_3;
import shape.ShapeWB12_3;
import shape.SphereWB12_3;

public class MainWB12_3 {

    public static void main(String[] args) {
        CylinderWB12_3 cylinderWB123 = new CylinderWB12_3(1.0, 2.0);
        SphereWB12_3 sphereWB123 = new SphereWB12_3(1.0);

        printMeasures(cylinderWB123);
        printMeasures(sphereWB123);
    }
    
    public static void printMeasures(ShapeWB12_3 shapeWB123) {
        System.out.println("\n" + shapeWB123.getClass().getSimpleName());

        double area = shapeWB123.getArea();
        double volume = shapeWB123.getVolume();
        
        System.out.println("Area: " + area);
        System.out.println("Volume: " + volume);
    }


}
  