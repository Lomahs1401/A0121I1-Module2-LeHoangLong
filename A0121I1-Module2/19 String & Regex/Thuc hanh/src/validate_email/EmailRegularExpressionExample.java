package validate_email;

public class EmailRegularExpressionExample {
    public static final String[] validEmail = new String[] {"a@gmail.com", "ab@yahoo.com", "lelongll32@gmail.com"};
    public static final String[] invalidEmail = new String[] {"@gmail.com", "ab@gmail.", "#@abc@gmail.com"};
    public static void main(String[] args) {
        EmailExample emailExample = new EmailExample();
        for (String email : validEmail) {
            boolean isValid = emailExample.isValid(email);
            System.out.println("Email " + email + " is valid: " + isValid);
        }
        for (String email : invalidEmail) {
            boolean isValid = emailExample.isValid(email);
            System.out.println("Email " + email + " is valid: " + isValid);
        }
    }
}
