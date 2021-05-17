package circleAndCylinder;

import java.util.Scanner;

public class CylinderTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cylinder cylinder1 = new Cylinder();
        System.out.println("Nhap color cylinder1: ");
        cylinder1.setColor(input.nextLine());
        System.out.println("Nhap ban kinh day cylinder1: ");
        cylinder1.setRadius(input.nextDouble());
        System.out.println("Nhap chieu cao cylinder1: ");
        cylinder1.setHeight(input.nextDouble());
        System.out.println("Co to mau ko?");
        cylinder1.setFilled(input.nextBoolean());
        System.out.println("Goi phuong thuc toString: ");
        System.out.println(cylinder1.toString());

        Cylinder cylinder2 = new Cylinder(5);
        System.out.println(cylinder2.toString());

        Cylinder cylinder3 = new Cylinder(2,"Pink", true, 10);
        System.out.println(cylinder3.toString());
    }
}