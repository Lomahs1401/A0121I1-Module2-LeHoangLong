package exception;

public class DividedByZeroException extends Exception {
    float x;
    float y;

    public DividedByZeroException(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String getMessage() {
        return "Exception / zero (" + x + "/" + y + ")";
    }
}
