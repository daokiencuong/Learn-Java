public class Constructors_lesson {
    int x;
    String var;
    
    public Constructors_lesson(int y) {
        x = 5;
        var = String.valueOf(y);
    }

    public Constructors_lesson(int y, String z) {
        x = 5;
        var = z + y;
    }

    public static void main(String[] args) {
        Constructors_lesson myObj = new Constructors_lesson(10, "this is");
        System.out.println(myObj.x + " " + myObj.var);
    }
}
