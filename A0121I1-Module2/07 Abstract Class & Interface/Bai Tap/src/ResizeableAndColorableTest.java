import resizeable.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ResizeableAndColorableTest extends Shape {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Circle> circleArrayList = new ArrayList<>();
        circleArrayList.add(new Circle());
        circleArrayList.add(new Circle(4));
        circleArrayList.add(new Circle(6, "Blue", true));

        Circle circle1 = circleArrayList.get(0);
        Circle circle2 = circleArrayList.get(1);
        Circle circle3 = circleArrayList.get(2);

        System.out.println("Nhap cac gia tri cho doi tuong circle1: ");
        System.out.print("Nhap mau sac: ");
        circle1.setColor(input.nextLine());
        System.out.print("Nhap ban kinh: ");
        circle1.setRadius(input.nextDouble());
        System.out.print("Co to mau ko? ");
        circle1.setFilled(input.nextBoolean());

        System.out.println("------------------------------------------------------------------");

        System.out.println("Truoc khi tang: ");
        System.out.printf("Chu vi circle1 = %.2f, Dien tich circle1 = %.2f",
                circle1.getPerimeter(), circle1.getArea());
        System.out.printf("\nChu vi circle2 = %.2f, Dien tich circle2 = %.2f",
                circle2.getPerimeter(), circle2.getArea());
        System.out.printf("\nChu vi circle3 = %.2f, Dien tich circle3 = %.2f",
                circle3.getPerimeter(), circle3.getArea());

        System.out.println("\n------------------------------------------------------------------");
        System.out.print("circle1 tang % kich thuoc? ");
        double percentCircle1 = input.nextDouble();
        System.out.print("circle2 tang % kich thuoc? ");
        double percentCircle2 = input.nextDouble();
        System.out.print("circle3 tang % kich thuoc? ");
        double percentCircle3 = input.nextDouble();
        System.out.println("------------------------------------------------------------------");

        System.out.println("Sau khi tang: ");

        circle1.resize(percentCircle1);
        circle2.resize(percentCircle2);
        circle3.resize(percentCircle3);

        System.out.printf("Chu vi circle1 = %.2f, Dien tich circle1 = %.2f",
                circle1.getPerimeter(), circle1.getArea());
        System.out.printf("\nChu vi circle2 = %.2f, Dien tich circle2 = %.2f",
                circle2.getPerimeter(), circle2.getArea());
        System.out.printf("\nChu vi circle3 = %.2f, Dien tich circle3 = %.2f",
                circle3.getPerimeter(), circle3.getArea());

        System.out.println("\n------------------------------------------------------------------");

        ArrayList<Rectangle> rectangleArrayList = new ArrayList<>();
        rectangleArrayList.add(new Rectangle());
        rectangleArrayList.add(new Rectangle(2, 4));
        rectangleArrayList.add(new Rectangle(4, 6, "Black", true));

        Rectangle rectangle1 = rectangleArrayList.get(0);
        Rectangle rectangle2 = rectangleArrayList.get(1);
        Rectangle rectangle3 = rectangleArrayList.get(2);

        System.out.println("Nhap cac gia tri cho doi tuong rectangle1: ");
        System.out.print("Nhap chieu rong: ");
        rectangle1.setWidth(input.nextDouble());
        System.out.print("Nhap chieu dai: ");
        rectangle1.setLength(input.nextDouble());
        System.out.print("Co to mau ko? ");
        rectangle1.setFilled(input.nextBoolean());

        System.out.println("------------------------------------------------------------------");

        System.out.println("Truoc khi tang: ");
        System.out.printf("Chu vi rectangle1 = %.2f, Dien tich rectangle1 = %.2f",
                rectangle1.getPerimeter(), rectangle1.getArea());
        System.out.printf("\nChu vi rectangle2 = %.2f, Dien tich rectangle2 = %.2f",
                rectangle2.getPerimeter(), rectangle2.getArea());
        System.out.printf("\nChu vi rectangle3 = %.2f, Dien tich rectangle3 = %.2f",
                rectangle3.getPerimeter(), rectangle3.getArea());

        System.out.println("\n------------------------------------------------------------------");
        System.out.print("rectangle1 tang % kich thuoc? ");
        double percentRectangle1 = input.nextDouble();
        System.out.print("rectangle2 tang % kich thuoc? ");
        double percentRectangle2 = input.nextDouble();
        System.out.print("rectangle3 tang % kich thuoc? ");
        double percentRectangle3 = input.nextDouble();
        System.out.println("------------------------------------------------------------------");

        System.out.println("Sau khi tang: ");

        rectangle1.resize(percentRectangle1);
        rectangle2.resize(percentRectangle2);
        rectangle3.resize(percentRectangle3);

        System.out.printf("Chu vi rectangle1 = %.2f, Dien tich rectangle1 = %.2f",
                rectangle1.getPerimeter(), rectangle1.getArea());
        System.out.printf("\nChu vi rectangle2 = %.2f, Dien tich rectangle2 = %.2f",
                rectangle2.getPerimeter(), rectangle2.getArea());
        System.out.printf("\nChu vi rectangle3 = %.2f, Dien tich rectangle3 = %.2f",
                rectangle3.getPerimeter(), rectangle3.getArea());

        System.out.println("\n------------------------------------------------------------------");

        ArrayList<Square> squareArrayList = new ArrayList<>();
        squareArrayList.add(new Square());
        squareArrayList.add(new Square(4));
        squareArrayList.add(new Square(10, "Pink", false));

        Square square1 = squareArrayList.get(0);
        Square square2 = squareArrayList.get(1);
        Square square3 = squareArrayList.get(2);

        System.out.println("Nhap cac gia tri cho doi tuong square1: ");
        System.out.print("Nhap canh: ");
        square1.setSide(input.nextDouble());
        System.out.print("To mau? ");
        square1.setFilled(input.nextBoolean());
        System.out.print("Doi tuong square2 co to mau? ");
        square2.setFilled(input.nextBoolean());

        System.out.println("------------------------------------------------------------------");

        System.out.println("Truoc khi tang: ");
        System.out.printf("Chu vi square1 = %.2f, Dien tich square1 = %.2f",
                square1.getPerimeter(), square1.getArea());
        System.out.printf("\nChu vi square2 = %.2f, Dien tich square2 = %.2f",
                square2.getPerimeter(), square2.getArea());
        System.out.printf("\nChu vi square3 = %.2f, Dien tich square3 = %.2f",
                square3.getPerimeter(), square3.getArea());

        System.out.println("\n------------------------------------------------------------------");
        System.out.println("square1 tang % kich thuoc? ");
        double percentSquare1 = input.nextDouble();
        System.out.println("square2 tang % kich thuoc? ");
        double percentSquare2 = input.nextDouble();
        System.out.println("square3 tang % kich thuoc? ");
        double percentSquare3 = input.nextDouble();
        System.out.println("------------------------------------------------------------------");

        System.out.println("Sau khi tang: ");

        square1.resize(percentSquare1);
        square2.resize(percentSquare2);
        square3.resize(percentSquare3);

        System.out.printf("Chu vi square1 = %.2f, Dien tich square1 = %.2f",
                square1.getPerimeter(), square1.getArea());
        System.out.printf("\nChu vi square2 = %.2f, Dien tich square2 = %.2f",
                square2.getPerimeter(), square2.getArea());
        System.out.printf("\nChu vi square3 = %.2f, Dien tich square3 = %.2f",
                square3.getPerimeter(), square3.getArea());

        System.out.println("\n------------------------------------------------------------------");

        for (Square square : squareArrayList) {
            if (square.isFilled()) {
                System.out.println(square.howToColor());
            }
        }
    }
}
