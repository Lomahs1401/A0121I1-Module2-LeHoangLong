import java.util.Scanner;

public class MaxValueInTwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dong, cot;
        System.out.println("Nhập vào số dòng của mảng:");
        dong = scanner.nextInt();
        System.out.println("Nhập vào số cột của mảng:");
        cot = scanner.nextInt();
        int[][] a = new int[dong][cot];
        // nhập mảng
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.printf("Nhập phần tử thứ[" + i + "," + j + "]:");
                a[i][j] = scanner.nextInt();
            }
        }
        int max = a[0][0];
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                if (max < a[i][j]) {
                    max = a[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là: "+max);
        //xuất mảng
        // System.out.println("Mảng vừa nhập là:");
        //      for (int i=0;i<dong;i++){
        //           for (int j=0;j<cot;j++){
        //            System.out.print(a[i][j]+"\t");
        //      }
        //    System.out.println("\n");
        //}
    }

}
