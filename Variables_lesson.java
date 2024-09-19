public class Variables_lesson {
    public static void main(String[] args) {
        String text = "Hello World";
        System.out.println(text);

        /*Like the "const" in Javascript you can add "final" keyword 
        before datatype to create a variable unchangeable and read-only */

        final int myNum = 15;
        //myNum = 2; // error
        System.out.println(myNum);

        //A demonstration of how to declare variables of other types:
        int myNumb = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        //Print variables
        //Can use + to combine both text and a variable
        System.out.println("This number is: " + myFloatNum);

        // The general rules for naming variables are:

        // Names can contain letters, digits, underscores, and dollar signs
        // Names must begin with a letter
        // Names should start with a lowercase letter, and cannot contain whitespace
        // Names can also begin with $ and _
        // Names are case-sensitive ("myVar" and "myvar" are different variables)
        // Reserved words (like Java keywords, such as int or boolean) cannot be used as names
    }
}
