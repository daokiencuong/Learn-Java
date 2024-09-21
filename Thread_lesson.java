public class Thread_lesson extends Thread {
        public static void main(String[] args) {
            Thread_lesson thread = new Thread_lesson();
            thread.start();
            System.out.println("This code is outside of the thread");
          }
          public void run() {
            System.out.println("This code is running in a thread");
    }
}
