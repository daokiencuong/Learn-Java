enum level{
    LOW,
    MEDIUM,
    HIGH
}

public class Enums_lesson {
    enum part{
        INTRO,
        MAIN,
        CONCLUSION
    }
    public static void main(String[] args) {
        level myObj = level.LOW;
        System.out.println(myObj);

        part myObj1 = part.INTRO;
        System.out.println(myObj1);

        switch (myObj1) {
            case INTRO:
                System.out.println("This is INTRO");
                break;
            case MAIN:
                System.out.println("This is MAIN");
                break;
            case CONCLUSION:
                System.out.println("This is CONCLUSION");
                break;
        }

        for(level myVar : level.values()){
            System.out.println(myVar);
        }
    }
}
