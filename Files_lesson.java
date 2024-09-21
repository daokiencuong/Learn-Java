import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Files_lesson {
    public static void main(String[] args) {
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
              System.out.println("File created: " + myObj.getName());
            } else {
              System.out.println("File already exists.");
            }
            System.out.println("File path: " + myObj.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

class WriteToFile {
    public static void main(String[] args) {
      try {
        FileWriter myWriter = new FileWriter("filename.txt");
        myWriter.write("Files in Java might be tricky, but it is fun enough!");
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
    }
}

class ReadFile {
    public static void main(String[] args) {
      try {
        File myObj = new File("filename.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
          String data = myReader.nextLine();
          System.out.println(data);
        }
        myReader.close();
      } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
    }
}

class GetFileInfo { 
    public static void main(String[] args) {
      File myObj = new File("filename.txt");
      if (myObj.exists()) {
        System.out.println("File name: " + myObj.getName());
        System.out.println("Absolute path: " + myObj.getAbsolutePath());
        System.out.println("Writeable: " + myObj.canWrite());
        System.out.println("Readable " + myObj.canRead());
        System.out.println("File size in bytes " + myObj.length());
      } else {
        System.out.println("The file does not exist.");
      }
    }
  }

  class DeleteFile {
    public static void main(String[] args) { 
      File myObj = new File("filename.txt"); 
      if (myObj.delete()) { 
        System.out.println("Deleted the file: " + myObj.getName());
      } else {
        System.out.println("Failed to delete the file.");
      } 
    } 
  }
