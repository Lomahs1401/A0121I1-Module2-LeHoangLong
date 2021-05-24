package exception;

public class Test {
    public static void main(String[] args) throws DividedByZeroException {
        float result;
        try {
            result = Calculator.divide(5, 0);
            System.out.println("result = " + result);
        } catch (DividedByZeroException error) {
            System.out.println(error.getMessage());
        }
    }
}
