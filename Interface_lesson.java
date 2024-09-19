/**
 * InnerInterface_lesson
 */
interface AnimalInterface {
  //When implement a class, must use all method in the interface
    public void animalSound(); // interface method (does not have a body)
    public void run(); // interface method (does not have a body)
}

/**
 * InnerInterface_lesson
 */
interface AnimalInterface1 {
    public void sound();
}

class Pigg implements AnimalInterface, AnimalInterface1 {
    public void animalSound() {
      // The body of animalSound() is provided here
      System.out.println("The pig says: wee wee");
    }
    public void run() {
      // The body of sleep() is provided here
      System.out.println("Zzz");
    }

    public void sound(){
      System.out.println("Meo meo");
    }
  }

public class Interface_lesson {
    public static void main(String[] args) {
        Pigg myPig = new Pigg();  // Create a Pig object
        myPig.animalSound();
        myPig.run();
        myPig.sound();
      }
}
