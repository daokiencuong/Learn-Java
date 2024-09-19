public class Inner_class_lesson {
    public static void main(String[] args) {
        OuterClass myObj = new OuterClass();
        OuterClass.InnerClass myObj1 = myObj.new InnerClass();
        System.out.println(myObj.x + " " + myObj1.y);
    }
}
class OuterClass {
    int x = 10;
  
    class InnerClass {
      int y = 5;
    }
    
    private class InnerClass1{
        int z = 20;
    }
  }
  

  