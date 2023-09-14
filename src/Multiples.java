import java.util.ArrayList;
import java.util.List;

public class Multiples {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(1000);
        for (int i = 1; i < 1000; i++) {

            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (!divisibleBy3 && !divisibleBy5) {

            } else {git
                list.add(i);
            }
        }
        System.out.println(list.size());
    }
}
