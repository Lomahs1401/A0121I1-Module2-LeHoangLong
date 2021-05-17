package point2DAnd3D;

import java.util.Arrays;
import java.util.Scanner;

public class Point3DTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Point3D point3D_1 = new Point3D();
        System.out.println("Nhap x:");
        point3D_1.setX(input.nextFloat());
        System.out.println("Nhap y: ");
        point3D_1.setY(input.nextFloat());
        System.out.println("Nhap z: ");
        point3D_1.setZ(input.nextFloat());
        System.out.println(Arrays.toString(point3D_1.getXYZ()));
        System.out.println("Goi phuong thuc toString: ");
        System.out.println(point3D_1.toString());

        Point3D point3D_2 = new Point3D();
        System.out.println("Nhap x, y, z: ");
        point3D_2.setXYZ(input.nextFloat(), input.nextFloat(), input.nextFloat());
        System.out.println(Arrays.toString(point3D_2.getXYZ()));;
        System.out.println("Goi phuong thuc toString: ");
        System.out.println(point3D_2.toString());

        Point3D point3D_3 = new Point3D(4.7f ,5.6f ,9.3f);
        System.out.println(Arrays.toString(point3D_3.getXYZ()));
        System.out.println("Goi phuong thuc toString: ");
        System.out.println(point3D_3.toString());

        System.out.println("--------------------------------------");

        System.out.println(point3D_1);
        System.out.println(point3D_2);
        System.out.println(point3D_3);
    }
}
