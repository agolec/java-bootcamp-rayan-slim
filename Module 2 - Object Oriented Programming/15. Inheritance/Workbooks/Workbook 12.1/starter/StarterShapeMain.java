import shape.StarterShapeCylinder;
import shape.StarterShapeSphere;

public class StarterShapeMain {

    public static void main(String[] args) {
        
        StarterShapeCylinder starterShapeCylinder = new StarterShapeCylinder(1,2);
        starterShapeCylinder.setHeight(2.0);
        starterShapeCylinder.setRadius(1.0);
        
        StarterShapeSphere starterShapeSphere = new StarterShapeSphere();
        starterShapeSphere.setRadius(1.0);

        System.out.println("Sphere - radius: " + starterShapeSphere.getRadius());
        System.out.println("Cylinder - radius: " + starterShapeCylinder.getRadius() + " height " + starterShapeCylinder.getHeight());

    }

  

}
  