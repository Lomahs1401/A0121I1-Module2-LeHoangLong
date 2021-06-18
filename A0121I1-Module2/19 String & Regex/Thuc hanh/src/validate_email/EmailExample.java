package validate_email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static Pattern pattern;

    private static final String REGEX_EMAIL = "^[\\w]+[\\w]*@[\\w]+(\\.[\\w]{2,}$)";

    public EmailExample() {
        pattern = Pattern.compile(REGEX_EMAIL);
    }

    public boolean isValid(String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
