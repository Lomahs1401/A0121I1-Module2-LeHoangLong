package my_linkedlist;

import java.awt.*;

public class MyLinkedList<E> {

    public class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }
        public Object getData() {
            return this.data;
        }
    }

    /**
     * Số lượng phần tử có trong danh sách liên kết
     */
    private int numNodes = 0;

    /**
     * Phần tử Node đầu tiên của danh sách liên kết
     */
    private Node head;

    public MyLinkedList() {
    }

    public void addFirst(E element) {
        //Khai báo biến temp để tham chiếu đến giá trị của head (trỏ đến head)
        //biến temp nằm trong vùng nhớ stack và chứa địa chỉ của head
        Node temp = head;
        //Khởi tạo đối tượng Node trong vùng nhớ Heap và trả về giá trị là địa chỉ
        //của vùng nhớ cho biến head (tức head trong stack chứa tham chiếu đến đối tượng Node trong heap)
        head = new Node(element);
        //lúc này temp đang nhận tham chiếu đến head cũ. Ta liên kết head cũ (tức temp) đến head mới
        //trình tự danh sách liên kết lúc này: head -> temp (head mới -> head cũ)
        head.next = temp;
        numNodes++;
    }

    public void addLast(E element) {
        //Khai báo biến temp trỏ đến head
        Node temp = head;
        //Cho con trỏ chạy đến phần tử cuối cùng của danh sách liên kết
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNodes++;
    }

    public void add(int index, E element) {
        //Khai báo biến temp trỏ đến head
        Node temp = head;
        //Khai báo Node holder
        Node holder;

        //Cho con trỏ chạy đến vị trí index-1
        for (int i = 1; i < index-1 && temp.next != null; ++i) {
            temp = temp.next;
        }

        //cho holder tham chiếu đến vị trí index
        holder = temp.next;
        //Node tại vị trí index-1 sẽ trỏ tới Node mới
        temp.next = new Node(element);
        //Node mới sẽ trỏ đến holder
        temp.next.next = holder;
        //tăng số lượng phần tử trong danh sách lên 1
        numNodes++;
    }

    public Object get(int index) {
        //Khai báo biến head trỏ đến head
        Node temp = head;
        for (int i = 0; i < index; ++i) {
            temp = temp.next;
        }
        return temp.data;
    }

    public int size() {
        return this.numNodes;
    }

    public E remove(int index) {
        if (index < 0 || index > numNodes) {
            throw new IllegalArgumentException("Error index: " + index);
        }
        //Khai báo biến temp trỏ đến head
        Node temp = head;
        Object data;
        //Nếu index = 0 thì trả về data hiện tại (Vì con trỏ head đang trỏ đến Node đầu tiên trong dslk)
        if (index == 0) {
            data = temp.data;
            head = head.next;
            numNodes--;
        } else {
            for (int i = 0; i < index-1 && temp.next != null; ++i) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
            numNodes--;
        }
        return (E) data;
    }

    public boolean remove(E element) {
        //Remove đối tượng nếu element head
        if (head.data.equals(element)) {
            remove(0);
            return true;
        } else {
            //Khai báo 1 Node temp trỏ đến head
            Node temp = head;
            while (temp.next != null) {
                //Nếu như tồn tại 1 phần tử có data = element thì Node đó sẽ bị remove
                if (temp.next.data.equals(element)) {
                    temp.next = temp.next.next;
                    numNodes--;
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }

    public MyLinkedList<E> clone() {
        //Kiểm tra LinkedList có phần tử hay không
        if (numNodes == 0) {
            throw new NullPointerException("LinkedList null");
        }
        //Khai báo linkedlist trả về
        MyLinkedList<E> returnLinkedList = new MyLinkedList<>();
        //Khai báo 1 temp trỏ đến head;
        Node temp = head;
        //add temp vào danh sách trả về để nó làm head
        returnLinkedList.addFirst((E) temp.data);
        while (temp != null) {
            returnLinkedList.addLast((E) temp.data);
            temp = temp.next;
        }
        return returnLinkedList;
    }

    public boolean contains(E element) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.data.equals(element)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E element) {
        Node temp = head;
        for (int i = 0; i < numNodes; ++i) {
            if (temp.getData().equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public void clear() {
        Node temp = head;
        while (temp.next != null) {
            temp.data = null;
        }
    }

}
