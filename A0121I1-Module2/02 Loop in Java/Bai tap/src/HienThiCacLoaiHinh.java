import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean check;
        do {
            check = false;
            int choice, choose;
            System.out.println("---------------Menu----------------");
            System.out.println("1.In hình chữ nhật");
            System.out.println("2.In hình tam giác vuông");
            System.out.println("3.In hình tam giác vuông ngược");
            System.out.println("4.In hình tam giác cân");
            System.out.println("0.Exit");
            System.out.println("Enter your choice:");
            System.out.println("------------------------------------");
            choice = input.nextInt();
            switch (choice) {
                case 0: {
                    System.out.println("Ban co chac muon thoat?\n1.Co\n0.Khong");
                    choose = input.nextInt();
                    if (choose == 0) {
                        check = true;
                    }
                    break;
                }
                case 1: {
                    int width, length;
                    System.out.println("Nhập chiều dài:");
                    length = input.nextInt();
                    System.out.println("Nhâp chiều rộng:");
                    width = input.nextInt();
                    System.out.println("In hình chữ nhật");
                    for (int i = 0; i < width; ++i) {
                        for (int j = 0; j < length; ++j) {
                            System.out.print("* ");
                        }
                        System.out.println("\n");
                    }
                    check = true;
                    break;
                }
                case 2: {
                    int a;
                    System.out.println("Nhập độ dài cạnh góc vuông a");
                    a = input.nextInt();

                    System.out.println("In tam giác vuông");
                    for (int i = 1; i <= a; ++i) {
                        for (int j = 1; j <= i; ++j) {
                            System.out.print("* ");
                        }
                        System.out.println("\n");
                    }
                    check = true;
                    break;
                }
                case 3: {
                    int a;
                    System.out.println("Nhập độ dài cạnh góc vuông a");
                    a = input.nextInt();

                    System.out.println("In tam giác vuông");
                    for (int i = a; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("\n");
                    }
                    check = true;
                    break;
                }
                case 4: {
                    int a;
                    do {
                        System.out.println("Nhập độ dài cạnh tam giác cân a");
                        a = input.nextInt();
                    } while (a <= 0);
                    for (int i = 1; i <= a; ++i) {
                        for (int j = 1; j < 2 * a; ++j) {
                            if (Math.abs(a - j) <= (i - 1)) {
                                System.out.printf(" * ");
                            } else {
                                System.out.printf("   ");
                            }
                        }
                        System.out.printf("\n");
                    }
                    check = true;
                    break;
                }
                default: {
                    System.out.println("Moi nhap lai!");
                    check = true;
                }
            }
        } while (check);
    }
}
