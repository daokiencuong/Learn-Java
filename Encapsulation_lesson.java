public class Encapsulation_lesson {
    private String name; //Can't accessed by other class

    //getName() method help get the private attribute
    public String getName(){
        return name;
    }

    ////setName() method help set the value of the private attribute
    public void setName(String newName) {
        this.name = newName;
    }
    public static void main(String[] args) {
        
    }
}
