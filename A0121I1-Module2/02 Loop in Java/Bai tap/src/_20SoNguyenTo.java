import java.util.Scanner;

public class _20SoNguyenTo {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        boolean check;
        Scanner scanner = new Scanner(System.in);
        System.out.println("20 Số nguyên tố đầu tiên là:");
        while (count < 20) {
            check = true;
            for (int i = 2; i < num; ++i) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.printf(num + " ");
                count++;
            }
            num++;
        }
    }
}
