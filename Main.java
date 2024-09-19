public class Main{
    // Every line of code that runs in Java must be inside a class
    int x = 10;
    public static void main() {
        System.out.println("Hello World");
    // println stands for print line
    // text in println() must be wrapped inside double quotations marks "" 
    // Can use print() instead of println(), but all text in all print() will print on the same line
    // should use println() to make all text easier to read

        System.out.println(3 + 4);

        Constructors_lesson myObj = new Constructors_lesson(0,"Hello");
        myObj.x = 10;
        System.out.println(myObj.x);

        Encapsulation_lesson myObj1 = new Encapsulation_lesson();
        myObj1.setName("Xin Chao");
        System.out.println(myObj1.getName());
    }

    public int myMethod(){
        return 2;
    }
}