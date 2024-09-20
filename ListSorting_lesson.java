import java.util.*;

public class ListSorting_lesson {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("volvo");
        cars.add("Huyndai");
        cars.add("Kia");
        cars.add("Mercedes");

        Collections.sort(cars);

        for(String i : cars){
            System.out.println(i);
        }

        Collections.sort(cars, Collections.reverseOrder());
        System.out.println(cars);
    }
}
