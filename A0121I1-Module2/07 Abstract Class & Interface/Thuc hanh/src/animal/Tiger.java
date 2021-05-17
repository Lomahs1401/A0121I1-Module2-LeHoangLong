package animal;

/*Khai báo lớp con Tiger thừa kế lớp cha Animal
Vì Animal là abstract class và có 1 phương thức abstract
nên lớp con Tiger phải implement phương thức makeSound()
của lớp cha (Override method makeSound())
 */

public class Tiger extends Animal {
    @Override
    public String makeSound() {
        return "Tiger: ROARRRRR!";
    }
}
