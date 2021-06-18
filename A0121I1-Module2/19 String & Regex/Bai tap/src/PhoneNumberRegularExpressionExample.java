import java.util.regex.Pattern;

public class PhoneNumberRegularExpressionExample {
    private static final String REGEX_PHONE_NUMBER = "^\\([\\d]{2}\\)-\\(0[\\d]{9}\\)$";
    private static final String validPhoneNumber = "(84)-(0978489648)";
    private static final String invalidPhoneNumber = "(a8)-(22222222)";

    public static void main(String[] args) {
        System.out.println("Phone number " + validPhoneNumber + " is valid: " + checkPhoneNumber(validPhoneNumber));
        System.out.println("Phone number " + invalidPhoneNumber + " is valid: " + checkPhoneNumber(invalidPhoneNumber));
    }


    public static boolean checkPhoneNumber(String phoneNumber) {
        return Pattern.matches(REGEX_PHONE_NUMBER, phoneNumber);
    }
}
