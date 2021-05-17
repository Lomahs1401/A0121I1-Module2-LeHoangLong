import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1.Chuyển từ độ C qua F");
            System.out.println("2.Chuyển từ độ F sang C");
            System.out.println("0.Exit");
            System.out.println("Nhập lựa chọn:");
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Nhập vào độ C:");
                    celsius = input.nextDouble();
                    System.out.println("Độ C chuyển qua độ F là: " + celsiusToFahrenheit(celsius) + "F");
                    break;
                }
                case 2: {
                    System.out.println("Nhập vào độ F:");
                    fahrenheit = input.nextDouble();
                    System.out.println("Độ F chuyển qua độ C là: " + fahrenheitToCelsius(fahrenheit) + "C");
                    break;
                }
                case 0: {
                    System.exit(0);
                }
                default:
                    System.out.println("Nhap sai lua chon!");
            }
        } while(true);

    }
    public static double celsiusToFahrenheit(double celsius){
        return (9.0/5)*celsius+32;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        return (5.0/9)*(fahrenheit-32);
    }
}
