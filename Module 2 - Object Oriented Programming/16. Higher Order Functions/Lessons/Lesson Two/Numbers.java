import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Numbers {
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(25, 19, 23, 45, 38, 23, 59, 12);
        integers.sort((right,left) -> right.compareTo(left));
        System.out.println(integers);


    }

}


/**************IMPERATIVE APPROACH**************
 * 
        for (int i = 0; i < integers.size(); i++) {
            for (int j = i + 1; j < integers.size(); j++) {
                if (integers.get(i).compareTo(integers.get(j)) > 0) {
                    int temp = integers.get(i);
                    integers.set(i, integers.get(j));
                    integers.set(j, temp);
                }
            }
        }
 */