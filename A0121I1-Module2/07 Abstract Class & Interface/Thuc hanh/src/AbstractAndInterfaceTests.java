import animal.Animal;
import animal.Chicken;
import animal.Tiger;
import fruit.Apple;
import fruit.Fruit;
import fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        //Khai báo và khoi tao mang animals có KDL
        // của các phần tử là kiểu đối tượng và kích thước là 2 phần tử
        Animal[] animals = new Animal[2];
        //Khởi tạo phần tử 0 của mảng là đối tượng Tiger
        animals[0] = new Tiger();
        //Khởi tạo phần tử 1 của mảng là đối tượng Chicken
        animals[1] = new Chicken();
        //Mỗi đối tượng đều có phương thức makeSound() => gọi phương thức đó
        //Sử dụng vòng lặp for each
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
        }
        System.out.println("-----------------------------");
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits){
            System.out.println(fruit.howToEat());
        }
    }
}
