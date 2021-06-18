package validate_account;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static final String REGEX_ACCOUNT = "^[\\w]{6,}$";

    public AccountExample() {
    }

    public boolean validate(String account) {
        Pattern pattern = Pattern.compile(REGEX_ACCOUNT);
        Matcher matcher = pattern.matcher(account);
        return matcher.matches();
    }
}
