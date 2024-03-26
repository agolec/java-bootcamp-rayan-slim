import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class HOF132StarterMain {
    public static void main(String[] args) {

        List<Double> prices = Arrays.asList(55.99, 33.99, 88.99, 11.49, 55.99, 111.99, 77.99);

        // Task 1: use sort to arrange the prices in descending order.
        prices.sort((leftNumber,rightNumber) -> rightNumber.compareTo(leftNumber));

        System.out.println("\nPrices\n------");

        // Task 2: Use forEach to print each price in the sorted list 'prices'.
        prices.forEach((price) -> System.out.println(price));

        List<String> books = Arrays.asList(
            "To Kill a Mockingbird",
            "The Great Gatsby",
            "Pride and Prejudice",
            "The Catcher in the Rye",
            "The Alchemist",
            "One Hundred Years of Solitude",
            "Moby-Dick",
            "The Brothers Karamazov",
            "The Lord of the Rings",
            "The Picture of Dorian Gray"
        );

        // Task 3: Sort the books List in ascending (alphabetical) order.
        books.sort((leftBook,rightBook) -> leftBook.compareTo(rightBook));

        System.out.println("\nLibrary\n--------");

        // Task 4. use forEach to print each book in the sorted List
        books.forEach((book) -> System.out.println(book));

    }
}