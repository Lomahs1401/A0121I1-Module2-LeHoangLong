import java.util.Map;
import java.util.TreeMap;

public class DemSoLanXuatHienBangMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        String[] strings = {"Canada", "America", "VietNam", "Canada", "America", "China", "Japan", "Canada"};
        for (int i = 0; i < 8; ++i) {
            if (treeMap.containsKey(strings[i])) {
                treeMap.put(strings[i], treeMap.get(strings[i]) +1);
            } else {
                treeMap.put(strings[i], 1);
            }
        }
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
