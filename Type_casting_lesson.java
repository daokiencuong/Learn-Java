public class Type_casting_lesson {
    public static void main(String[] args) {
        // Widening Casting (automatically) - converting a smaller type to a larger type size
        // byte -> short -> char -> int -> long -> float -> double

        // Narrowing Casting (manually) - converting a larger type to a smaller size type
        // double -> float -> long -> int -> char -> short -> byte
        // should use (data type) before the variable's name
        double myDouble = 9.78d;
        int myInt = (int) myDouble;
    }
}
