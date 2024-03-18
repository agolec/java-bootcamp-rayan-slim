import model.InheritanceEPpt1LabEquipment;

public class Microscope extends InheritanceEPpt1LabEquipment {

    private int magnification;
    private static final int MINIMUM_MAGNIFICATION = 1;
    public Microscope(String manufacturer, String model, int year,int magnification) {
        super(manufacturer, model, year);
        setMagnification(magnification);
    }
    public void setMagnification(int magnification){
        if(magnification < MINIMUM_MAGNIFICATION){
            throw new IllegalArgumentException("Magnification must be greater than or equal to " + MINIMUM_MAGNIFICATION);
        }
        this.magnification = magnification;
    }
    public int getMagnification(){
        return this.magnification;
    }

    @Override
    public String performMaintenance() {
        return "Microscope maintenance: Clean the lenses and check the light source.";
    }
}
