import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void inputArray(int[] a, Scanner input) {
        System.out.println("Nhap cac phan tu vao mang: ");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("arr[%d]: ", i);
            a[i] = input.nextInt();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số luong  phần tử mảng :");
        int n=scanner.nextInt();
        int[] arr1 = new int[n];
        inputArray(arr1,scanner);
        System.out.println("Nhập phần tử cần thê");

    }
}
