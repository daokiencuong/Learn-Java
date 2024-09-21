import java.util.regex.*;

public class RegEx_lesson {
    public static void main(String[] args) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);

        String email = "example@domain.com";

        if (pattern.matcher(email).matches()) {
            System.out.println("Email true");
        } else {
            System.out.println("Email false");
        }
    }
}
