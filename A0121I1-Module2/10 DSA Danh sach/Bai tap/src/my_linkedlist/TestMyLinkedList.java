package my_linkedlist;

import java.util.Scanner;

public class TestMyLinkedList {

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
        Student studentOfBachKhoa = new Student();
        System.out.println("Enter name: ");
        studentOfBachKhoa.setName(input.nextLine());
        System.out.println("ID?");
        studentOfBachKhoa.setId(input.nextInt());
        Student studentOfSuPham = new Student(320014520, "Pham Van Quoc Hieu");
        Student studentOfKinhTe = new Student(102256240, "Nguyen Thi Thu Huyen");
        Student studentOfDuyTan = new Student(1593524052, "Ngo Van Toan");

        MyLinkedList<Student> studentMyLinkedList= new MyLinkedList<Student>();
        studentMyLinkedList.addFirst(studentOfBachKhoa);
        studentMyLinkedList.addFirst(studentOfSuPham);
        studentMyLinkedList.addLast(studentOfKinhTe);
        studentMyLinkedList.add(1,studentOfDuyTan);
        for (int i = 0; i < studentMyLinkedList.size(); ++i) {
            Student student = (Student) studentMyLinkedList.get(i);
            System.out.print((student.getName()) + ", ");
        }
        System.out.println("\nGọi phương thức remove(): ");
        System.out.println("Remove index 2");
        System.out.println("Remove studentOfKinhTe");
        studentMyLinkedList.remove(2);
        studentMyLinkedList.remove(studentOfKinhTe);
        for (int i = 0; i < studentMyLinkedList.size(); ++i) {
            Student student = (Student) studentMyLinkedList.get(i);
            System.out.print((student.getName()) + ", ");
        }
        System.out.println("\nSử dụng phương thức clone:");
        MyLinkedList<Student> cloneLinkedList = studentMyLinkedList.clone();
        for (int i = 0; i < cloneLinkedList.size(); ++i) {
            Student student = (Student) cloneLinkedList.get(i);
            System.out.print((student.getName()) + ", ");
        }
        System.out.println("\nstudentOfBachKhoa có trong studentMyLinkedList ko? "
                + studentMyLinkedList.contains(studentOfBachKhoa));
        System.out.println("studentOfDuyTan có trong studentMyLinkedList ko? "
                + studentMyLinkedList.contains(studentOfDuyTan));
        System.out.println("\nstudentOfSuPham có trong studentMyLinkedList ko? "
                + studentMyLinkedList.contains(studentOfSuPham));
        System.out.println("studentOfBachKhoa ở index? " + studentMyLinkedList.indexOf(studentOfBachKhoa));
        System.out.println("studentOfKinhTe ở index? " + studentMyLinkedList.indexOf(studentOfKinhTe));
        System.out.println("studentOfDuyTan ở index? " + studentMyLinkedList.indexOf(studentOfDuyTan));
        System.out.println("studentOfSuPham ở index? " + studentMyLinkedList.indexOf(studentOfSuPham));


    }
}
