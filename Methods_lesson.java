public class Methods_lesson {

    //Methods like function in other programming language
    static void myMethod(){
        System.out.println("This is my method");
    }

    static boolean checkAge(int age){
        if(age <= 18){
            return true;
        }else{
            return false;
        }
    }

    //With method overloading, multiple methods can have the same name with different parameters:
    static int plusMethod(int x, int y) {
        return x + y;
    }
      
      static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        myMethod();
        System.out.println(checkAge(20));
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
}
