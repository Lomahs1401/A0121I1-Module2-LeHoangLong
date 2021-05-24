package demo_my_linkedlist;

//Lớp MyLinkedList chứa lớp Node
public class MyLinkedList {
    /* khai báo biến head có KDL Node nằm trong vùng nhớ Stack
    biến head có 2 trường dữ liệu, 2 phương thức:
        trường next: lưu địa chỉ của node tiếp theo => head.next
        trường data: lưu dữ liệu phần tử của node => head.data
        hàm khởi tạo Node(Object data): khởi tạo đối tượng => head.Node(Object data)
        phương thức getData(): lấy về dữ liệu của node => head.getData();
    */
    private Node head;
    //numNodes xác định số phần tử có trong danh sách
    private int numNodes;

    //Ham khoi tao co tham so
    public MyLinkedList(Object data) {
        // khởi tạo đối tượng Node trong vùng nhớ Heap = keyword new
        // và gán địa chỉ của vùng nhớ cho biến head
        head = new Node(data);
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index-1 && temp.next != null; ++i) {
            temp = temp.next;
        }

        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; ++i) {
            temp = temp.next;
        }
        return temp;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    private class Node {
        //biến next KDL node, lưu địa chỉ đến Node tiếp theo
        private Node next;
        //biến data kiểu Object, giúp lưu trữ dữ liệu của node
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
}
