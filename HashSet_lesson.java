import java.util.*;

public class HashSet_lesson {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");

        System.out.println(cars);
        // In the example above, even though BMW is added twice it only appears once in
        // the set because every item in a set has to be unique

        System.out.println(cars.size());

        System.out.println(cars.contains("Huyndai"));

        cars.remove("Volvo");

        cars.clear();
    }
}
