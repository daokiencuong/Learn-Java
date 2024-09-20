import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList_lesson {
    public static void main(String[] args) {
        //You can use other data type by change the value in <> when declare a object
        //Elements in an ArrayList are actually objects
        //ArrayList<Integer> list = new ArrayList<Integer>();

        ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
        //Add a element in last position in string
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add(0,"Mazda");

        Collections.sort(cars);  // Sort cars

        System.out.println(cars);
        //Get a element from string
        String carName = cars.get(2);
        System.out.println(carName);
        //Set a element from string by index
        cars.set(3,"Huyndai");
        System.out.println(cars);
        //Remove a element from string by index
        cars.remove(0);
        System.out.println(cars);
        //Remove all element 
        cars.clear();
        System.out.println(cars);
        //Get string size
        int arraySize = cars.size();
        System.out.println(arraySize);
    }
}
