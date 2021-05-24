package my_arraylist;

import java.util.Scanner;

public class TestMyArrayList {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MyArrayList<Integer> integerMyArrayList = new MyArrayList<Integer>(1);
        integerMyArrayList.add(1);
        integerMyArrayList.add(2);
        integerMyArrayList.add(3);
        integerMyArrayList.add(4, 1);
        System.out.println("Trước khi xóa các phần tử integerMyArrayList bằng phương thức clear()");
        for (int i = 0; i < integerMyArrayList.size(); ++i) {
            System.out.print(integerMyArrayList.get(i) + ", ");
        }
        System.out.println();
        integerMyArrayList.clear();
        System.out.println("Sau khi xóa: ");
        for (int i = 0; i < integerMyArrayList.size(); ++i) {
            System.out.print(integerMyArrayList.get(i) + ", ");
        }

        Student studentOfPhysicClass = new Student();
        System.out.println("---------------Physic class-------------");
        System.out.print("Enter name: ");
        studentOfPhysicClass.setName(input.nextLine());
        System.out.print("Ma ID? ");
        studentOfPhysicClass.setId(input.nextInt());

        Student studentOfMathClass = new Student(102200345,"Lê Hoàng Long");
        Student studentOfChemistryClass = new Student(102200456, "Phạm Văn Quốc Hiếu");
        Student studentOfEnglishClass = new Student(102200389, "Nguyễn Trường Duy");
        Student studentOfBiologyClass = new Student(102200369, "Lý Văn Tánh");

        MyArrayList<Student> studentList = new MyArrayList<Student>();
        studentList.add(studentOfPhysicClass);
        studentList.add(studentOfMathClass);
        studentList.add(studentOfChemistryClass);
        studentList.add(studentOfEnglishClass, 2);
        studentList.add(studentOfBiologyClass);

        for (int i = 0; i < studentList.size(); ++i) {
            Student student = (Student) studentList.elements[i];
            System.out.print(student.getId() + ", " + student.getName());
            System.out.println();
        }

        System.out.print("Số lượng phần tử có trong danh sách là: " + studentList.size());
        System.out.println();
        System.out.println("Element tại index 2 có tên là: " + studentList.get(2).getName());
        System.out.println("Phần tử studentOfChemistryClass có chỉ số index = "
                + studentList.indexOf(studentOfChemistryClass));
        System.out.println("studentOfBiologyClass có trong MyArrayList không? "
                + studentList.contains(studentOfBiologyClass));

        System.out.println("studentMyArrayList clone từ studentList");
        MyArrayList<Student> studentMyArrayList = studentList.clone();
        for (int i = 0; i < studentMyArrayList.size(); ++i) {
            Student student = (Student) studentMyArrayList.elements[i];
            System.out.print(student.getId() + ", " + student.getName());
            System.out.println();
        }
        System.out.println("Gọi phương thức remove():");
        Student removeStudent = studentList.remove(2);
        System.out.println(removeStudent.getName());
    }
}
