import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Nhap color: ");
        rectangle1.setColor(input.nextLine());
        System.out.println("Chieu dai: ");
        rectangle1.setLength(input.nextDouble());
        System.out.println("Chieu rong: ");
        rectangle1.setWidth(input.nextDouble());
        System.out.println("Co to mau ko?");
        rectangle1.setFilled(input.nextBoolean());
        System.out.println("Goi phuong thuc toString: ");
        System.out.println(rectangle1.toString());

        Rectangle rectangle2 = new Rectangle(2.3, 5.8);
        System.out.println(rectangle2);

        Rectangle rectangle3 = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle3);
    }
}