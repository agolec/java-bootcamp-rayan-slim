package model;

public class EnumsPt1Car {
    private String make;
    private String model;
    private BodyType bodyType;
    private int productionYear;
    private double price;
    public static final int MIN_YEAR = 1900;
    public static final int MIN_PRICE = 0;
    public static final double MAX_PRICE = 200_000;

    public enum BodyType {
        SEDAN, COUPE, HATCHBACK, SUV, TRUCK, VAN
    }

    public EnumsPt1Car(String make, String model, BodyType bodyType, int productionYear, double price) {
        setMake(make);
        setModel(model);
        setBodyType(bodyType);
        setProductionYear(productionYear);
        setPrice(price);
    }


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public double getPrice() {
        return price;
    }

    public void setMake(String make) {
        if (make == null || make.isBlank()) {
            throw new IllegalArgumentException("Make cannot be null or blank.");
        }
        this.make = make;
    }

    public void setModel(String model) {
        if (model == null || model.isBlank()) {
            throw new IllegalArgumentException("Model cannot be null or blank.");
        }
        this.model = model;
    }

    public void setBodyType(BodyType bodyType) {
        if (bodyType == null) {
            throw new IllegalArgumentException("BodyType cannot be null.");
        }
        this.bodyType = bodyType;
    }

    public void setProductionYear(int productionYear) {
        if (productionYear < MIN_YEAR) {
            throw new IllegalArgumentException("Production year must be greater than or equal to the minimum year (" + MIN_YEAR +").");
        }
        this.productionYear = productionYear;
    }

    public void setPrice(double price) {
        if (price < MIN_PRICE || price > MAX_PRICE) {
            throw new IllegalArgumentException("Price must be within a valid range.");
        }
        this.price = price;
    }
}
