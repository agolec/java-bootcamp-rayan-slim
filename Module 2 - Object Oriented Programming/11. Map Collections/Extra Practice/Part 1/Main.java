public class Main {
    public static void main(String[] args) {
        City city1 = new City("New York", "USA", 8500000);
        System.out.println(city1.getName());


        // Uncomment the following line to test invalid input for setName method
        try {
            city1.setName("");
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        // Uncomment the following line to test invalid input for setCountry method
        try {
            city1.setCountry("");
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        // Uncomment the following line to test invalid input for setPopulation method
         try{
             city1.setPopulation(-1);
         } catch (IllegalArgumentException e){
             System.out.println(e.getMessage());
         }


        // Uncomment the following line to test invalid input for the constructor
        // City city2 = new City("", "USA", 8500000);

    }
}