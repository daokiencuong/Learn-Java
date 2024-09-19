public class String_lesson {
    public static void main(){
        String greeting = "Hello";

        //String length
        //Can use length() method to get the string length
        System.out.println("The length of the string is: " + greeting.length());

        // More string method, for example toUpperCase() and toLowerCase()
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting.toLowerCase());

        //Finding a character in a String
        //The indexOf() method returns the indexof the first occurrence of a specified text in a string (including whitespace)
        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf(" locate")); // Outputs 7

        System.out.println(greeting.indexOf("e"));

        //Concatenation
        //The + operator can be used between strings to combine them
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);
        //You can also use the concat() method to concatenate two strings
        System.out.println(firstName.concat(lastName));
    }
}
