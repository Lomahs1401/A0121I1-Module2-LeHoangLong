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

        public void printInfoStudent() {
            System.out.println("Name: " + getName());
            System.out.println("ID: " + getId());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student studentOfBachKhoa = new Student();
        System.out.print("Enter name: ");
        studentOfBachKhoa.setName(input.nextLine());
        System.out.print("ID? ");
        studentOfBachKhoa.setId(input.nextInt());
        Student studentOfSuPham = new Student(320014520, "Phạm Văn Quốc Hiếu");
        Student studentOfKinhTe = new Student(102256240, "Nguyễn Thị Thu Huyền");
        Student studentOfDuyTan = new Student(1593524052, "Ngô Văn Toàn");

        MyLinkedList<Student> studentMyLinkedList= new MyLinkedList<Student>();
        studentMyLinkedList.addFirst(studentOfBachKhoa);
        studentMyLinkedList.addFirst(studentOfSuPham);
        studentMyLinkedList.addLast(studentOfKinhTe);
        System.out.println("-------------------------------------------------------------" +
                "------------------------------------------");
        System.out.println("Trước khi add: ");
        System.out.print("studentMyLinkedList: ");
        for (int i = 0; i < studentMyLinkedList.size(); ++i) {
            Student student = studentMyLinkedList.get(i);
            System.out.print((student.getName()) + ", ");
        }
        System.out.println("\n-------------------------------------------------------------" +
                "------------------------------------------");
        System.out.println("Sau khi add: ");
        System.out.print("studentMyLinkedList: ");
        studentMyLinkedList.add(1,studentOfDuyTan);

        for (int i = 0; i < studentMyLinkedList.size(); i++) {
            Student student = studentMyLinkedList.get(i);
            System.out.print((student.getName()) + ", ");
        }

        System.out.println("\nprintInfoStudent của studentMyLinkedList: ");
        for (int i = 0; i < studentMyLinkedList.size(); ++i) {
            Student student = studentMyLinkedList.get(i);
            student.printInfoStudent();
        }

        System.out.println("-------------------------------------------------------------" +
                "------------------------------------------");
        System.out.println("fisrtCloneLinkedList là lớp Mylinkedlist sao chép từ studentMyLinkedList" +
                " bằng phương thức clone():");
        MyLinkedList<Student> firstCloneLinkedList = studentMyLinkedList.clone();
        System.out.print("firstCloneLinkedList: ");
        for (int i = 0; i < firstCloneLinkedList.size(); ++i) {
            Student student = firstCloneLinkedList.get(i);
            System.out.print((student.getName()) + ", ");
        }
        System.out.println("\n-------------------------------------------------------------" +
                "------------------------------------------");
        System.out.println("Gọi phương thức remove(): ");
        System.out.println("Remove index 2 của studentMyLinkedList");
        Student firstRemoveStudent = studentMyLinkedList.remove(2);
        System.out.print("studentMyLinkedList: ");
        for (int i = 0; i < studentMyLinkedList.size(); ++i) {
            Student student = studentMyLinkedList.get(i);
            System.out.print((student.getName()) + ", ");
        }
        System.out.println("\n-------------------------------------------------------------" +
                "------------------------------------------");
        System.out.println("Phần tử được remove: " + firstRemoveStudent.getName());
        System.out.println("-------------------------------------------------------------" +
                "------------------------------------------");
        System.out.println("printInfoStudent của studentMyLinkedList: ");
        for (int i = 0; i < studentMyLinkedList.size(); ++i) {
            Student student = studentMyLinkedList.get(i);
            student.printInfoStudent();
        }
        System.out.println("-------------------------------------------------------------" +
                "------------------------------------------");

        System.out.println("Remove studentOfKinhTe của studentMyLinkedList: ");
        studentMyLinkedList.remove(studentOfKinhTe);
        System.out.println("Sau khi remove:");
        System.out.print("studentMyLinkedList:  ");

        for (int i = 0; i < studentMyLinkedList.size(); ++i) {
            Student student = studentMyLinkedList.get(i);
            System.out.print((student.getName()) + ", ");
        }

        System.out.println("\nprintInfoStudent của studentMyLinkedList: ");
        for (int i = 0; i < studentMyLinkedList.size(); ++i) {
            Student student = studentMyLinkedList.get(i);
            student.printInfoStudent();
        }
        System.out.println("--------------------------------------------------------------" +
                "------------------------------------------");
        System.out.print("studentMyLinkedList: ");
        for (int i = 0; i < studentMyLinkedList.size(); ++i) {
            Student student = studentMyLinkedList.get(i);
            System.out.print((student.getName()) + ", ");
        }
        System.out.println("\nstudentOfBachKhoa có trong studentMyLinkedList ko? "
                + studentMyLinkedList.contains(studentOfBachKhoa));
        System.out.println("studentOfDuyTan có trong studentMyLinkedList ko? "
                + studentMyLinkedList.contains(studentOfDuyTan));
        System.out.println("studentOfSuPham có trong studentMyLinkedList ko? "
                + studentMyLinkedList.contains(studentOfSuPham));
        System.out.println("studentOfKinhTe có trong studentMyLinkedList ko? "
                + studentMyLinkedList.contains(studentOfKinhTe));
        System.out.println("-------------------------------------------------------------" +
                "------------------------------------------");
        System.out.print("firstCloneLinkedList: ");
        for (int i = 0; i < firstCloneLinkedList.size(); ++i) {
            Student student = firstCloneLinkedList.get(i);
            System.out.print((student.getName()) + ", ");
        }
        System.out.println("\nstudentOfBachKhoa có trong firstCloneLinkedList ko? "
                + firstCloneLinkedList.contains(studentOfBachKhoa));
        System.out.println("studentOfDuyTan có trong firstCloneLinkedList ko? "
                + firstCloneLinkedList.contains(studentOfDuyTan));
        System.out.println("studentOfSuPham có trong firstCloneLinkedList ko? "
                + firstCloneLinkedList.contains(studentOfSuPham));
        System.out.println("studentOfKinhTe có trong firstCloneLinkedList ko? "
                + firstCloneLinkedList.contains(studentOfKinhTe));
        System.out.println("-------------------------------------------------------------" +
                "-------------------------------------------");
        System.out.print("studentMyLinkedList: ");
        for (int i = 0; i < studentMyLinkedList.size(); ++i) {
            Student student = studentMyLinkedList.get(i);
            System.out.print((student.getName()) + ", ");
        }
        System.out.println("\nstudentOfBachKhoa trong studentMyLinkedList ở index? "
                + studentMyLinkedList.indexOf(studentOfBachKhoa));
        System.out.println("studentOfKinhTe trong studentMyLinkedList ở index? "
                + studentMyLinkedList.indexOf(studentOfKinhTe));
        System.out.println("studentOfDuyTan trong studentMyLinkedList ở index? "
                + studentMyLinkedList.indexOf(studentOfDuyTan));
        System.out.println("studentOfSuPham trong studentMyLinkedList ở index? "
                + studentMyLinkedList.indexOf(studentOfSuPham));
        System.out.println("------------------------------------------------------------" +
                "-----------------------------------------");
        System.out.print("firstCloneLinkedList: ");
        for (int i = 0; i < firstCloneLinkedList.size(); ++i) {
            Student student = firstCloneLinkedList.get(i);
            System.out.print((student.getName()) + ", ");
        }
        System.out.println("\nstudentOfBachKhoa trong firstCloneLinkedList ở index? "
                + firstCloneLinkedList.indexOf(studentOfBachKhoa));
        System.out.println("studentOfKinhTe trong firstCloneLinkedList ở index? "
                + firstCloneLinkedList.indexOf(studentOfKinhTe));
        System.out.println("studentOfDuyTan trong firstCloneLinkedList ở index? "
                + firstCloneLinkedList.indexOf(studentOfDuyTan));
        System.out.println("studentOfSuPham trong firstCloneLinkedList ở index? "
                + firstCloneLinkedList.indexOf(studentOfSuPham));
        System.out.println("-------------------------------------------------------------" +
                "-----------------------------------------");
        System.out.print("firstCloneLinkedList: ");
        for (int i = 0; i < firstCloneLinkedList.size(); ++i) {
            Student student = firstCloneLinkedList.get(i);
            System.out.print((student.getName()) + ", ");
        }
        System.out.println("\nSử dụng phương thức get()");
        System.out.println("Lấy phần tử tại vị trí index 2 của firstCloneLinkedList" +
                " => firstCloneLinkedList.get(2)");
        Student getIndexStudent = firstCloneLinkedList.get(2);
        System.out.println("Phần tử tại vị trí index2 có tên: " + getIndexStudent.getName());
        System.out.println("Lấy phần tử đầu tiên của danh sách liên kết" +
                " => firstCloneLinkedList.getFirst()");
        Student getFirstStudent = firstCloneLinkedList.getFirst();
        System.out.println("Phần tử đầu tiên có tên: " + getFirstStudent.getName());
        System.out.println("Lấy phần tử cuối cùng của danh sách liên kết" +
                " => firstCloneLinkedList.getLast()");
        Student getLastStudent = firstCloneLinkedList.getLast();
        System.out.println("Phần tử cuối cùng có tên: " + getLastStudent.getName());
    }
}
