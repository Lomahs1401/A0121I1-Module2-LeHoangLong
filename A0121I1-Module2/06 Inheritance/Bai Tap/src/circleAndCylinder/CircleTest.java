package circleAndCylinder;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Circle circle1 = new Circle();
        System.out.println("Nhap color circle1: ");
        circle1.setColor(input.nextLine());
        System.out.println("Nhap ban kinh circle1: ");
        circle1.setRadius(input.nextDouble());
        System.out.println("Co to mau ko?");
        circle1.setFilled(input.nextBoolean());
        System.out.println(circle1.toString());

        Circle circle2 = new Circle(3.5);
        System.out.println("Circle2 co to mau ko?");
        circle2.setFilled(input.nextBoolean());
        System.out.println(circle2.toString());

        Circle circle3 = new Circle(6, "indigo", false);
        System.out.println(circle3.toString());
    }
}
