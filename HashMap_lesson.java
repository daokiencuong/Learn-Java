import java.util.HashMap;

public class HashMap_lesson {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("Viet Nam", "Ha Noi");
        capitalCities.put("England", "London");
        capitalCities.put("Norway", "Oslo");

        System.out.println(capitalCities);
        System.err.println(capitalCities.size());

        // Use the keySet() method if you only want the keys, and use the values()
        // method if you only want the values

        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }

        System.out.println(capitalCities.get("Viet Nam"));

        capitalCities.remove("England");
        System.out.println(capitalCities);

        capitalCities.clear();
        System.out.println(capitalCities);
    }
}
