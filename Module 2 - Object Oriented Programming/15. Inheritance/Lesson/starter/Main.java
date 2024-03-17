import product.Pants;
import product.Product;
import product.Shirt;

public class Main {

    public static void main(String[] args) {
    Shirt shirt = new Shirt(20.00,"green", "fall creek", Shirt.Size.LARGE);
   shirt.fold();
   productStore(shirt);

   Pants pants = new Pants(30.00,"black","Lees" ,32, 30);
   pants.fold();
   productStore(pants);




    }
public static void productStore(Product product){
    System.out.println("Thank you for purchasing " + product.getBrand() + " " + product.getClass().getSimpleName() + " of price $" + product.getPrice() );
}
}
