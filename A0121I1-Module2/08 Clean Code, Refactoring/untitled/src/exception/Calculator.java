package exception;

public class Calculator {
    public static float divide(float x, float y) throws DividedByZeroException {
        if (y == 0) {
            throw new DividedByZeroException(x, y);
        }
        System.out.println("ABCDE");
        return x/y;
    }

    public static float plus(float x, float y) {
        return x + y;
    }
}
