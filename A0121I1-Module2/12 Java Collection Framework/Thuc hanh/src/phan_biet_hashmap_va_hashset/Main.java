package phan_biet_hashmap_va_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nam",20, "HN");
        Student student2 = new Student("Hung",21, "DN");
        Student student3 = new Student("Ha",22, "HCM");
        // ép kiểu ngầm định (Implicit cast)
        // KDLCha cha obj = new KDLCon();
        // các thuộc tính và phương thức thuộc lớp cha, nhưng phương thức nào được
        // override ở lớp con thì đối tượng cha obj sẽ có phương thức của lớp con
        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);
        studentMap.put(4, student1);
        // phương thức entrySet() trả về 1 bộ entry (gồm các danh sách <key, value>)
        // interface Entry có các phương thức getKey() lấy key, getValue() lấy value
        for(Entry<Integer, Student> entry : studentMap.entrySet()){
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println("----------------------------------------------");
        // Set không chứa các phần tử trùng lặp
        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        // phần tử student 1 trùng lặp
        students.add(student1);

        for(Student student : students){
            System.out.println(student.toString());
        }
    }
}