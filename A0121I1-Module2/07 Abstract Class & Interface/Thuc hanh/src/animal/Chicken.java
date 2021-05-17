package animal;

/*Khai báo lớp con Chicken thừa kế lớp cha Animal
Vì Animal là abstract class và có 1 phương thức abstract
nên lớp con Chicken phải định nghĩa phần thân phương thức makeSound()
của lớp cha (Override method makeSound())
 */

import edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
