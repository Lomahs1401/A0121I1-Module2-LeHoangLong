import java.util.regex.Pattern;

public class ClassRegularExpressionExample {
    private static final String REGEX_CLASS = "^[ACP][\\d]{4}[G-IK-M]$";
    private static final String[] validClassID = new String[] {"A1234G", "C3012G", "P9874M"};
    private static final String[] invalidClassID = new String[] {"M0318G", "P0323A", "B345C"};

    public static void main(String[] args) {
        for (String classID : validClassID) {
            System.out.println("Class " + classID + " is valid: " + checkIDClass(classID));
        }
        for (String classID : invalidClassID) {
            System.out.println("Class " + classID + " is valid: " + checkIDClass(classID));
        }
    }

    public static boolean checkIDClass(String classID) {
        return Pattern.matches(REGEX_CLASS, classID);
    }
}
