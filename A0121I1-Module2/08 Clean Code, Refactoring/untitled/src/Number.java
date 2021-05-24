import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[3];
        try {
            for (int i = 0; i < arr.length; ++i) {
                System.out.printf("Nhap phan tu arr[%d] = ", i);
                arr[i] = input.nextInt();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finish 1");
        }

        try {
            for (int i = 0; i < arr.length; ++i) {
                System.out.println(arr[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finish 2");
        }
    }
}
