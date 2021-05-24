import java.util.ArrayList;

public class TestArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        //them chuoi hello vao mang
        list.add("hello");
        list.add("1");
        String s = list.get(0);
        System.out.println(s);
    }
}
