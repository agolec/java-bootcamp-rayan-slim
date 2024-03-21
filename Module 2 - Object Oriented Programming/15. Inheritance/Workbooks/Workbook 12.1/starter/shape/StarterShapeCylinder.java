package shape;

public class StarterShapeCylinder extends StarterShapeShape{

    private double height;
    public StarterShapeCylinder(double radius, double height){
        super(radius);
        this.setHeight(height);
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


  
}
  