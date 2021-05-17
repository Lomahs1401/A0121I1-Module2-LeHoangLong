package vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Nhap vào giá trị a:");
        a = scanner.nextInt();
        System.out.println("Nhập vào giá trị b:");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a==0 || b==0){
            System.out.println("Không có UCLN.");
        }
        while (a!=b){
            if (a>b){
                a = a-b;
            }
            else {
                b = b-a;
            }
        }
        System.out.println("Uoc chung lon nhat la :" + a);

    }
}
