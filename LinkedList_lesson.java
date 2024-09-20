import java.util.LinkedList;

public class LinkedList_lesson {
   public static void main(String[] args) {

    //Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.
    LinkedList<Integer> numbers = new LinkedList<Integer>();
    numbers.add(3);
    numbers.add(4);
    numbers.add(2);
    numbers.add(0);

    System.out.println(numbers);

    numbers.removeLast();
    System.out.println(numbers);


   } 
}
