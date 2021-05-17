import java.util.Scanner;

public class GopMang {
    public static void inputArray(int[] a, Scanner input) {
        System.out.println("Nhap cac phan tu vao mang: ");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("arr[%d]: ", i);
            a[i] = input.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập số luongj  phần tử mảng 1:");
        int a=scanner.nextInt();
        int[] arr1 = new int[a];
        inputArray(arr1,scanner);
        System.out.println("Nhập số lượng phần tử mảng 2:");
        int b=scanner.nextInt();
        int[] arr2 = new int[b];
        inputArray(arr2,scanner);
        int length=arr1.length+arr2.length;
        int[] arr3 = new  int[length];
        int index2 =0;
        System.out.println("Mảng sau khi gộp là:");
        for (int i=0;i<length;i++){
            if (i<arr1.length){
                arr3[i]=arr1[i];
            }else {
                arr3[i]= arr2[index2];
                index2++;
            }

            System.out.printf("arr[%d] = %d\n", i, arr3[i]);
        }

    }
}
