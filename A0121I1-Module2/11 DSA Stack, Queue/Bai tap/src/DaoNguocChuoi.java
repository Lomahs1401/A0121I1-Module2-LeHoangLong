import java.util.Scanner;
import java.util.Stack;

public class DaoNguocChuoi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap 1 chuoi: ");
        String string = input.nextLine();
        System.out.println("Chuoi ban vua nhap: " + string);
        Stack<Character> characterStack = new Stack<>();
        for (int i = 0; i < string.length(); ++i) {
            characterStack.push(string.charAt(i));
        }
        char[] characters = new char[string.length()];
        for (int i = 0; i < string.length(); ++i) {
            characters[i] = characterStack.pop();
        }
        System.out.print("Dao nguoc chuoi: ");
        for(Character value : characters) {
            System.out.print(value);
        }
    }
}
