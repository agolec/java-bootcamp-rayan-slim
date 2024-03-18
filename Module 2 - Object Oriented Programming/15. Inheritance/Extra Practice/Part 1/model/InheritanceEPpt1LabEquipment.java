package model;
public abstract class InheritanceEPpt1LabEquipment {
    private String manufacturer;
    private String model;
    private int year;
    private static final int MINIMUM_YEAR = 1950;
    public InheritanceEPpt1LabEquipment(String manufacturer,String model, int year){
        setManufacturer(manufacturer);
        setModel(model);
        setYear(year);
    }
    public void setManufacturer(String manufacturer){
        if(manufacturer == null || manufacturer.isBlank()){
            throw new IllegalArgumentException("Manufacturer cannot be null or blank.");
        }
        this.manufacturer = manufacturer;
    }
    public void setModel(String model){
        if(manufacturer == null || manufacturer.isBlank()){
            throw new IllegalArgumentException("Model cannot be null or blank.");
        }
        this.model = model;
    }
    public void setYear(int year){
        if(year < MINIMUM_YEAR){
            throw new IllegalArgumentException("Year must be greater than or rqual to minimum year");
        }
        this.year = year;
    }
    public String getManufacturer(){
        return this.manufacturer;
    }
    public String getModel(){
        return this.model;
    }
    public int getYear(){
        return this.year;
    }
    public abstract String performMaintenance();
}