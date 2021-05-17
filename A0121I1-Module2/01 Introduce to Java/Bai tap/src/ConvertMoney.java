import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float vnd = 23000f;
        System.out.print("Enter USD: ");
        float usd = input.nextFloat();
        double result = usd*vnd;
        System.out.print("Giá trị VND: " + result + "VND");

    }
}
