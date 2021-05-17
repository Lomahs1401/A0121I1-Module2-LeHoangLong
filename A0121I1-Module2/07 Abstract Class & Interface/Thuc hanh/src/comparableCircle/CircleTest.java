package comparableCircle;

import java.util.Scanner;

public class CircleTest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Circle circle1 = new Circle();
        System.out.println("Nhap cac gia tri cho doi tuong circle1");
        System.out.println("Nhap color: ");
        circle1.setColor(input.nextLine());
        System.out.println("Nhap ban kinh r: ");
        circle1.setRadius(input.nextDouble());
        System.out.println("Co to mau ko? ");
        circle1.setFilled(input.nextBoolean());
        System.out.printf("Cac gia tri cua doi tuong circle1: " + "Color: %s, Ban kinh r: %.2f, "
                + (circle1.isFilled() ? "filled" : "not filled"), circle1.getColor(), circle1.getRadius());
        System.out.printf("\nCircle1 co chu vi: %.2f, dien tich: %.2f", circle1.getPerimeter(), circle1.getArea());
        Circle circle2 = new Circle(5);
        System.out.println("\n--------------------------------------------------");
        System.out.println("Doi tuong circle2 co ban kinh mac dinh r = 5.0");
        System.out.println("Nhap cac gia tri cho doi tuong circle2");
        System.out.println("circle2.setColor(\"Green\");");
        circle2.setColor("Green");
        System.out.println("Co to mau ko?");
        circle2.setFilled(input.nextBoolean());
        System.out.printf("Cac gia tri cua doi tuong circle2: " + "Color: %s, Ban kinh r: %.2f "
                + (circle2.isFilled() ? "filled" : "not filled"), circle2.getColor(), circle2.getRadius());
        System.out.printf("\nCircle2 co chu vi: %.2f, dien tich: %.2f", circle2.getPerimeter(), circle2.getArea());
        System.out.println("\n---------------------------------------------------");
        Circle circle3 = new Circle(10, "red", true);
        System.out.println("Circle3 duoc khoi tao bang ham constructor co 3 tham so dau vao.");
        System.out.println("10.0, red, true");
        System.out.printf("Cac gia tri cua doi tuong circle3: " + "Color: %s, Ban kinh r: %.2f "
                + (circle3.isFilled() ? "filled" : "not filled"), circle3.getColor(), circle3.getRadius());
        System.out.printf("\nCircle3 co chu vi: %.2f, dien tich: %.2f", circle3.getPerimeter(), circle3.getArea());
    }
}
