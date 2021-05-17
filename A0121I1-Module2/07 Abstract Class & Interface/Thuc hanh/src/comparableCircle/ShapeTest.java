package comparableCircle;

import java.util.Scanner;

class Shape {
    protected String color = "green";
    protected boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }
}

public class ShapeTest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Shape shape = new Shape();
        System.out.println("Goi phuong thuc toString cua doi tuong shape");
        System.out.println(shape.toString());
        System.out.println("Nhap color: ");
        shape.setColor(input.nextLine());
        System.out.println("Co to mau ko?");
        shape.setFilled(input.nextBoolean());
        System.out.println("Sau khi nhap, ta duoc shape co cac gia tri moi: ");
        System.out.println(shape.toString());
    }
}
