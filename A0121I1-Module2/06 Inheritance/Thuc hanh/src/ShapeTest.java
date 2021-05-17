import java.util.Scanner;

public class ShapeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Shape shape1 = new Shape();
        System.out.println("Nhap color: ");
        shape1.setColor(input.nextLine());
        System.out.println("Co to mau ko?");
        shape1.setFilled(input.nextBoolean());
        System.out.println("Goi phuong thuc toString shape1: ");
        System.out.println(shape1.toString());

        Shape shape2 = new Shape("blue", false);
        System.out.println("Goi phuong thuc toString shape2: ");
        System.out.println(shape2);
    }
}