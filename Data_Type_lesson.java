public class Data_Type_lesson {
    public static void main(String[] args) {
        int myNum = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;    // Floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String

        //Number
        byte myNum0 = 100; //byte data type can store whole numbers from -128 to 127
        short myNum1 = 5000; //short data type can store whole number from -32768 to 32767
        int myNum2 = 10000;
        long myNum3 =   15000000000L; //use it when int is not large enough to store the value
        //Note that you should end the value with an "L"

        float myNum4 = 5.75f;
        double myNum5 = 6.433d;
        //Note that you should end the value with an "f" for floats and "d" for doubles

        //Scientific numbers
        float f1 = 35e3f;
        double d1 = 12E4d;
        //A floating point number can also be a scientific number with an "e" to indicate the power of 10
    }
}
