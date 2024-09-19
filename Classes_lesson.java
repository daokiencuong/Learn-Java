//Everything in Java is associated with classes and objects, along with its attributes and methods.

//To create a class, use the keyword class 
/*Remember a class should always start with an uppercase first letter, 
and that the name of the java file should match the class name. */
public class Classes_lesson {
    int x = 5;

    public static void main(String[] args) {
        //Create an object
        /*In Java, an object is created from a class. We have already created the class named Classes_lesson,
        so now we can use this to create objects.
        To create an object of Classes_lesson, specify the class name, followed by the object name,
        and use the keyword new: */
        Classes_lesson myObj = new Classes_lesson();
        System.out.println(myObj.x);

        //Multiple objects
        Classes_lesson myObj2 = new Classes_lesson();
        Classes_lesson myObj3 = new Classes_lesson();
        System.out.println(myObj2.x);
        System.out.println(myObj3.x);

        //Using Multiple Classes
        Main myObj4 = new Main();
        System.out.println(myObj4.x);
        Main.main();
        System.out.println(myObj4.myMethod());
    }
}

class for_example {
    //Class attributes
    //Another term for class attributes is fields.
    final int x = 5; // Add final before the var, this var can't override 
    int y = 10;

    public static void main(String[] args) {
        for_example myObj = new for_example();
        //Accessing attributes
        System.out.println(myObj.y);

        //Modify attributes
        myObj.y = 20;
        System.out.println(myObj.y);

        //myObj.x = 30; //Error

        myMethod();
    }
    //static method can be accessed without creating an object of class, unlike public
    static void myMethod(){
        System.out.println("Hello World");
    }

    static void myMethod1(){
        System.out.println("Hello World");
    }
}
