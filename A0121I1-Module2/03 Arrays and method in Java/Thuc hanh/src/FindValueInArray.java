import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] students ={"Christian", "Michael", "Camila", "Sienna",
                "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.print("Enter a name's student:");
        String input = scanner.nextLine();
        boolean isExist = false;
        for (int i=0; i < students.length; i++){
            if (students[i].equals(input)){
                System.out.printf("Position of the students in the list " + input + " is: " + (i+1));
                isExist = true;
                break;
            }
            if (!isExist){
                System.out.println("Not found " + input + " is in list.");
            }
        }
    }

}
