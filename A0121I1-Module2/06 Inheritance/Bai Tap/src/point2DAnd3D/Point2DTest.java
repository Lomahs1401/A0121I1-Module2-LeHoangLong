package point2DAnd3D;

import java.util.Arrays;
import java.util.Scanner;

public class Point2DTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Point2D point2D_1 = new Point2D();
        System.out.println("Nhap x: ");
        point2D_1.setX(input.nextFloat());
        System.out.println("Nhap y: ");
        point2D_1.setY(input.nextFloat());
        System.out.println(Arrays.toString(point2D_1.getXY()));
        System.out.println("Goi phuong thuc toString: ");
        System.out.println(point2D_1.toString());
        Point2D point2D_2 = new Point2D(4.6f,7.8f );
        System.out.println(Arrays.toString(point2D_2.getXY()));
        System.out.println("Goi phuong thuc toString: ");
        System.out.println(point2D_2.toString());
    }
}
