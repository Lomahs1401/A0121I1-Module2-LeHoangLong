public class Box<T> {
    private T t;
    public void add(T t) {
        this.t = t;
    }
    public T get() {
        return t;
    }
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<Integer>();
        Box<String> strBox = new Box<String>();
        intBox.add(new Integer(10));
        strBox.add(new String("Hello World"));
        System.out.println("Integer Value: " + intBox.get());
        System.out.println("String Value: " + strBox.get());
    }
}
