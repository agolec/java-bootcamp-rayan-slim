import model.EnumsPt1Car;

public class Pt1Main {
    public static void main(String[] args) {
        //EnumsPt1Car car1 = new EnumsPt1Car("Toyota", "Camry", EnumsPt1Car.BodyType.SEDAN, 2020, 30000);
        EnumsPt1Car car1 = new EnumsPt1Car("Toyota","Camry", EnumsPt1Car.BodyType.SEDAN, 2020, 30000);
        System.out.println(car1.getMake());


        // Uncomment the following line to test invalid input for setMake method
//         car1.setMake("");


        // Uncomment the following line to test invalid input for setModel method
//         car1.setModel("");


        // Uncomment the following line to test invalid input for setBodyType method
//         car1.setBodyType(null);


        // Uncomment the following line to test invalid input for setProductionYear method
//         car1.setProductionYear(1899);


        // Uncomment the following line to test invalid input for setPrice method
//         car1.setPrice(-1);


        // Uncomment the following line to test invalid input for setPrice method
//         car1.setPrice(200001);


        // Uncomment the following line to test invalid input for the constructor
        EnumsPt1Car.BodyType lmao = EnumsPt1Car.BodyType.HATCHBACK;
         EnumsPt1Car car2 = new EnumsPt1Car("Toyota", "Camry", lmao, 1900, 300000);


    }
}