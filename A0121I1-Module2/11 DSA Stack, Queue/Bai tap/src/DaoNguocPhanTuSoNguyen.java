import java.util.Scanner;
import java.util.Stack;

public class DaoNguocPhanTuSoNguyen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Integer> integerStack = new Stack<>();
        System.out.print("Nhap n phan tu: ");
        int n = input.nextInt();
        for (int i = 0; i < n; ++i) {
            System.out.printf("Push a[%d] into Stack = ", i);
            integerStack.push(input.nextInt());
        }
        Integer[] reverseStack = new Integer[n];
        for (int i = 0; i < n; ++i) {
            reverseStack[i] = integerStack.pop();
        }
        for (Integer value : reverseStack) {
            System.out.print(value + " ");
        }
    }
}

