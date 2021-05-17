package movablePoint;

import java.util.Arrays;
import java.util.Scanner;

public class PointTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Point point1 = new Point();
        System.out.println("Nhap x: ");
        point1.setX(input.nextFloat());
        System.out.println("Nhap y: ");
        point1.setY(input.nextFloat());
        System.out.println(Arrays.toString(point1.getXY()));
        System.out.println("Goi phuong thuc toString: ");
        System.out.println(point1.toString());

        Point point2 = new Point();
        System.out.println("Nhap x, y: ");
        point2.setXY(input.nextFloat(), input.nextFloat());
        System.out.println(Arrays.toString(point2.getXY()));
        System.out.println("Goi phuong thuc toString: ");
        System.out.println(point2.toString());

        Point point3 = new Point(5.6f, 7.8f);
        System.out.println(Arrays.toString(point3.getXY()));
        System.out.println("Goi phuong toString: ");
        System.out.println(point3.toString());

        System.out.println("---------------------------------------");

        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point3);
    }
}
