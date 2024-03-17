package product;

public class Product {
    private double price;
    private String color;
    private String brand;
    Product(double price, String color, String brand){
        setPrice(price);
        setColor(color);
        setBrand(brand);
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public double getPrice() {
        return this.price;
    }
    public String getColor() {
        return this.color;
    }
    public String getBrand() {
        return this.brand;
    }

    public void fold(){
        System.out.println("\nNow folding my " + this.getBrand() + " " + this.getClass().getSimpleName());
    }
}
