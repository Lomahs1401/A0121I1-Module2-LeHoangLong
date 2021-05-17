import java.util.Scanner;

public class SquareTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Square square1 = new Square();
        System.out.println("Nhap color: ");
        square1.setColor(input.nextLine());
        System.out.println("Nhap canh: ");
        square1.setSide(input.nextDouble());
        System.out.println("Co to mau ko?");
        square1.setFilled(input.nextBoolean());
        System.out.println("Goi phuong thuc toString");
        System.out.println(square1.toString());

        Square square2 = new Square(2.3);
        System.out.println(square2.toString());

        Square square3 = new Square(5.8, "yellow", true);
        System.out.println(square3.toString());
    }
}