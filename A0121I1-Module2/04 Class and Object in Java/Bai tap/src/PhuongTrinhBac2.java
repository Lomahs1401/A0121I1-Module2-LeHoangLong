import java.util.Scanner;

public class PhuongTrinhBac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào hệ số a: ");
        float a = scanner.nextFloat();
        System.out.print("Nhập vào hệ số b: ");
        float b = scanner.nextFloat();
        System.out.print("Nhập vào hệ số c: ");
        float c = scanner.nextFloat();
        double d = -b / (2 * a);
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("Phương trình " + a + " x^2 + " + b + " x + " + c + " = 0" + "  vô nghiệm.");
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.print("Phương trình " + a + " x^2 + " + b + "x + " + c + " = 0" + "  có một nghiệm duy nhất là:" + d);
        } else if (quadraticEquation.getDiscriminant() > 0) {
            System.out.print("Phương trình " + a + " x^2 + " + b + "x + " + c + " = 0"
                    + " có hai nghiệm là : x1=" + quadraticEquation.getRoot1() + " ; x2=" + quadraticEquation.getRoot2());
        }
    }
}
