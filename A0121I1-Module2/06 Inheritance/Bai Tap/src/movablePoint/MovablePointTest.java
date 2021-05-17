package movablePoint;

import java.util.Arrays;
import java.util.Scanner;

public class MovablePointTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MovablePoint movablePoint1 = new MovablePoint();
        System.out.println("Nhap XSpeed: ");
        movablePoint1.setXSpeed(input.nextFloat());
        System.out.println("Nhap YSpeed: ");
        movablePoint1.setYSpeed(input.nextFloat());
        System.out.println(Arrays.toString(movablePoint1.getXYSpeed()));
        System.out.println(Arrays.toString(movablePoint1.getSpeed()));
        System.out.println("Goi phuong thuc toString:");
        System.out.println(movablePoint1.toString());

        MovablePoint movablePoint2 = new MovablePoint();
        System.out.println("Nhap x: ");
        movablePoint2.setX(input.nextFloat());
        System.out.println("Nhap y: ");
        movablePoint2.setY(input.nextFloat());
        System.out.println("Nhap XSpeed, YSpeed: ");
        movablePoint2.setSpeed(input.nextFloat(), input.nextFloat());
        System.out.println(Arrays.toString(movablePoint2.getXYSpeed()));
        System.out.println(Arrays.toString(movablePoint2.getSpeed()));
        System.out.println("Goi phuong thuc toString: ");
        System.out.println(movablePoint2.toString());

        MovablePoint movablePoint3 = new MovablePoint(5.6f,2.4f);
        System.out.println("Nhap x, y: ");
        movablePoint3.setXY(input.nextFloat(), input.nextFloat());
        System.out.println(Arrays.toString(movablePoint3.getXYSpeed()));
        System.out.println(Arrays.toString(movablePoint3.getSpeed()));
        System.out.println("Goi phuong thuc toString: ");
        System.out.println(movablePoint3.toString());

        MovablePoint movablePoint4 = new MovablePoint(1f, 2f, 10f, 20f);
        System.out.println(Arrays.toString(movablePoint4.getXYSpeed()));
        System.out.println(Arrays.toString(movablePoint4.getSpeed()));
        System.out.println("Goi phuong thuc toString: ");
        System.out.println(movablePoint4.toString());

        System.out.println("------------------------------------------------------------");
        System.out.println(movablePoint1);
        System.out.println(movablePoint2);
        System.out.println(movablePoint3);
        System.out.println(movablePoint4);
        System.out.println("------------------------------------------------------------");
    }
}
