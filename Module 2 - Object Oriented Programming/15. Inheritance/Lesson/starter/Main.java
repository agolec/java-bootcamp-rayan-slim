import product.Pants;
import product.Shirt;

public class Main {

    public static void main(String[] args) {
    Shirt shirt = new Shirt();
    shirt.setBrand("Nikes");
    shirt.setPrice(3.44);
    shirt.setSize(Shirt.Size.LARGE);
    shirt.setColor("Blue");
    shirt.fold();

    Pants pants = new Pants();
    pants.setBrand("Levi");
    pants.setColor("Green");
    pants.setLength(32);
    pants.setWaist(30);
    pants.setPrice(79.99);
    pants.fold();



    }

}
