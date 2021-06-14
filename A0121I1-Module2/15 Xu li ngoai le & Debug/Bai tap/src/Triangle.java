import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean check;
        do {
            check = true;
            try {
                System.out.print("Canh 1: ");
                double side1 = input.nextDouble();
                System.out.print("Canh 2: ");
                double side2 = input.nextDouble();
                System.out.print("Canh 3: ");
                double side3 = input.nextDouble();
                triangle(side1, side2, side3);
                System.out.println("Tam giác hợp lệ");
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMsg());
                check = false;
                System.out.println("Mời nhập lại: ");
            }
        } while (!check);
    }

    public static void triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 < 0 || side2 < 0 || side3 < 0) {
            throw new IllegalTriangleException("Cạnh không thể là một số âm!");
        } else if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalTriangleException("Lỗi tổng hai cạnh nhỏ hơn cạnh còn lại!");
        }
    }
}
