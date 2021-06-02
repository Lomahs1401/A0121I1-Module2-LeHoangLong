import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapExample8 {
    public static void main(String[] args) {
        // khoi tao map
        TreeMap<String, String> map = new TreeMap<>();
        // them cac phan tu vao map
        map.put("J", "Java");
        map.put("C", "C++");
        map.put("P", "PHP");
        map.put("Py", "Python");
        // show TreeMap
        for (String s : map.keySet()) {
            System.out.println(map.get(s));
        }
    }
}