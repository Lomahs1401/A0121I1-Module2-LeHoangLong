import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void inputArray(int[] a, Scanner input) {
        System.out.println("Nhap cac phan tu vao mang: ");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("arr[%d]: ", i);
            a[i] = input.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử mảng :");
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        inputArray(arr1,scanner);
        System.out.println("Nhập số cần xóa:");
        int n=scanner.nextInt();
        for (int i=0;i<arr1.length;i++){
            if (arr1[i]!=n){

            }
        }
    }

}
