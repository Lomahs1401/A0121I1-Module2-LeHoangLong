package triangleAndShape;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Triangle triangle1 = new Triangle();
        System.out.println("Triangle1 co 3 canh gia tri mac dinh = 1.0");
        System.out.println("Nhap color: ");
        triangle1.setColor(input.nextLine());
        System.out.println("Co to mau ko?");
        triangle1.setFilled(input.nextBoolean());
        System.out.println("Goi phuong thuc toString: ");
        System.out.println("Triangle1 " + triangle1.toString());

        Triangle triangle2 = new Triangle();
        System.out.println("Nhap canh 1 triangle2: ");
        triangle2.setSide1(input.nextDouble());
        System.out.println("Nhap canh 2 triangle2: ");
        triangle2.setSide2(input.nextDouble());
        System.out.println("Nhap canh 3 triangle2: ");
        triangle2.setSide3(input.nextDouble());
        System.out.printf("Canh 1 triangle2 = %.2f", triangle2.getSide1());
        System.out.printf("\nCanh 2 triangle2 = %.2f", triangle2.getSide2());
        System.out.printf("\nCanh 3 triangle2 = %.2f", triangle2.getSide3());
        System.out.println("\nGoi phuong thuc toString: ");
        System.out.println("Triangle2 " + triangle2.toString());

        Triangle triangle3 = new Triangle(3, 4 ,5);
        System.out.println("Triangle3 co color mac dinh la green thua ke tu lop shape, fill = true");
        System.out.println("Goi phuong thuc toString: ");
        System.out.println("Triangle3 " + triangle3.toString());

        Triangle triangle4 = new Triangle("Blue", false, 6, 8, 10);
        System.out.println("Goi phuong thuc toString: ");
        System.out.println("Triangle4 " + triangle4.toString());

        System.out.println("------------------------------------------------------------------" +
                "-------------------------------------------------------------------------");
        System.out.println("Triangle1 " + triangle1);
        System.out.println("Triangle2 " + triangle2);
        System.out.println("Triangle3 " + triangle3);
        System.out.println("Triangle4 " + triangle4);
        System.out.println("------------------------------------------------------------------" +
                "-------------------------------------------------------------------------");

    }
}
