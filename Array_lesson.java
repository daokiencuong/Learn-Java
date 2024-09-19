public class Array_lesson {
    public static void main(String[] args) {
        //Declare an Array
        String[] cars = {"Huyndai", "Toyota", "Mercedes", "Porsche", "Roll Royce", "Bentley", "BMW"};
        int[] myNum = {18, 24, 28, 29, 30, 31, 32, 33, 34};

        //Access the elements of an Array
        System.out.println(cars[6]);
        System.out.println(myNum[0]);

        //Change an Array elements
        cars[6] = "Ranger Rover";
        System.out.println(cars[6]);

        //Array length
        System.out.println(cars.length);

        //Loop throught an Array
        for(String i : cars){
            System.out.println(i);
        }

        //Multidimensional Arrays (Mảng hai chiều)
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int[] row : myNumbers) {
            for (int i : row) {
              System.out.println(i);
            }
        }
    }
}
