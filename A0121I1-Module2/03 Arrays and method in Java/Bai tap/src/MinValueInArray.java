import java.util.Scanner;

public class MinValueInArray {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử trong mảng");
        int n = scanner.nextInt();
        int[] arr= new int[n];
        System.out.println("Nhập các phần tử vào mảng:");
        for (int i=0;i<arr.length;i++){
            System.out.printf("arr[%d]:",i);
            arr[i]=scanner.nextInt();
        }
        int min =arr[0];
        for (int i=0;i<arr.length;i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Số nhỏ nhất là:"+min);
    }
}
