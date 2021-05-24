package demo_my_linkedlist;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList linkedList = new MyLinkedList(10);
        linkedList.addFirst(11);
        linkedList.addFirst(12);
        linkedList.addFirst(13);

        linkedList.add(4, 9);
        linkedList.add(4, 8);
        linkedList.printList();
    }
}
