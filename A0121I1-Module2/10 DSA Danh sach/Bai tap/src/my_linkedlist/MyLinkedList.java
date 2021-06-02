package my_linkedlist;

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
    private int numNodes;

    /**
     * Phần tử Node đầu tiên của danh sách liên kết
     */
    public Node head;

    /**
     * Constructor khởi tạo ko tham số, khởi tạo danh sách liên kết trống
     */
    public MyLinkedList() {
        this.numNodes = 0;
        //head = null -> biến head chưa trỏ đến Node nào cả
        this.head = null;
    }

    /**
     * Thêm 1 phần tử vào đầu danh sách liên kết MyLinkedList
     * @param element
     */
    public void addFirst(E element) {
        //Khai báo biến currentNode kiểu Node để tham chiếu đến giá trị của head (trỏ đến head)
        //Nếu danh sách liên kết trống, currentNode cũng = null vì head = null.
        Node currentNode = head;
        //Khởi tạo đối tượng Node trong vùng nhớ Heap và trả về giá trị là địa chỉ
        //của vùng nhớ cho biến head (tức head trong stack chứa tham chiếu đến đối tượng Node trong heap)
        head = new Node(element);
        //lúc này currentNode đang nhận tham chiếu đến head cũ. Ta liên kết head cũ (tức currentNode) đến head mới
        //trình tự danh sách liên kết lúc này: head -> currentNode (head mới -> head cũ)
        head.next = currentNode;
        numNodes++;
    }

    /**
     * Thêm 1 phần tử vào cuối danh sách liên kết MyLinkedList
     * @param element
     */
    public void addLast(E element) {
        //Khai báo biến currentNode trỏ đến head
        Node currentNode = head;
        /*Cho con trỏ chạy đến phần tử cuối cùng của danh sách liên kết
        Nếu để currentNode != null là sai vì:
        Con trỏ vẫn chạy đến phần tử cuối cùng 1 cách bình thường. Nhưng khi đến phần tử cuối cùng,
        phần tử đó (Node cuối) không trỏ đến phần tử (Node) nào cả. Nhưng vì currentNode != null
        (tức currentNode hiện tại) đang trỏ đến Node cuối (!= null) nên điều kiện vẫn đúng, và vòng lặp
        while thực hiện lệnh gán currentNode = currentNode.next. Lệnh gán này sẽ phát sinh lỗi
        java.lang.NullPointerException -> Chết chương trình
         */
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = new Node(element);
        numNodes++;
    }

    /**
     * Chèn 1 phần tử tại vị trí position bất kì
     * @param position
     * @param element
     */
    public void add(int position, E element) {
        if (position <= 0 || position > numNodes) {
            throw new IllegalArgumentException("Error position: " + position);
        }
        //Khai báo biến currentNode trỏ đến head
        Node currentNode = head;
        //Khai báo biến holder nhằm giữ lại Node tại vị trí position
        Node holder;

        //Cho con trỏ Node currentNode chạy đến vị trí position-1
        for (int i = 1; i < position-1 && currentNode.next != null; ++i) {
            currentNode = currentNode.next;
        }
        if (position == 1) {
            head = new Node(element);
            head.next = currentNode;
            numNodes++;
        } else {
            //cho holder tham chiếu đến vị trí position
            holder = currentNode.next;
            //Node tại vị trí position-1 sẽ trỏ tới Node mới
            currentNode.next = new Node(element);
            //Từ node tại vị trí position-1, node này sẽ liên kết với node mới, node mới sẽ liên kết đến node holder
            currentNode.next.next = holder;
            //tăng số lượng phần tử trong danh sách lên 1
            numNodes++;
        }
    }

    /**
     * trả về số phần tử của MyLinkedList
     * @return
     */
    public int size() {
        return this.numNodes;
    }

    /**
     * Phương thức remove() lấy 1 phần tử ra khỏi dann sách liên kết và trả về data đó
     * @param index
     * @return
     */
    public E remove(int index) {
        if (index < 0 || index > numNodes) {
            throw new IllegalArgumentException("Error index: " + index);
        }
        //Khai báo biến currentNode trỏ đến head
        Node currentNode = head;
        //Khai báo biến data kiểu Object
        Object data;
        //Nếu index = 0 thì trả về data hiện tại (Vì con trỏ head đang trỏ đến Node đầu tiên trong dslk)
        if (index == 0) {
            data = currentNode.data;
            head = head.next;
            numNodes--;
        } else {
            //Cho con trỏ chạy đến vị trí index-1
            for (int i = 0; i < index-1 && currentNode.next != null; ++i) {
                currentNode = currentNode.next;
            }
            //Sau khi đến vị trí index-1, lấy dữ liệu của Node tại vị trí index và gán vào biến data
            data = currentNode.next.data;
            //Sau khi gán, ta cho Node của index-1 liên kết với Node của index+1
            //currentNode.next nghĩa là đang trỏ đến 1 Node, và temp.next.next nghĩa là Node của index+1
            //tức Node temp tại index-1 sẽ trỏ đến Node tại index+1
            currentNode.next = currentNode.next.next;
            numNodes--;
        }
        return (E) data;
    }

    /**
     * Phương thức remove(): boolean chỉ thực hiện lấy 1 phần tử ra khỏi
     * danh sách liên kết và không trả về phần tử được lấy ra đó
     * @param element
     * @return
     */
    public boolean remove(E element) {
        //Remove đối tượng nếu element trùng với head.data
        if (head.data.equals(element)) {
            remove(0);
            return true;
        } else {
            //Khai báo 1 Node currentNode trỏ đến head
            Node currentNode = head;
            while (currentNode.next != null) {
                //Nếu như tồn tại 1 phần tử có data = element thì Node đó sẽ bị remove
                if (currentNode.next.data.equals(element)) {
                    currentNode.next = currentNode.next.next;
                    numNodes--;
                    return true;
                }
                currentNode = currentNode.next;
            }
        }
        return false;
    }

    /**
     * Sao chép một MyLinkedList
     * @return
     */
    public MyLinkedList<E> clone() {
        //Kiểm tra LinkedList có phần tử hay không
        if (numNodes == 0) {
            throw new NullPointerException("LinkedList null");
        }
        //Khai báo mảng LinkedList trả về là returnLinkedList
        MyLinkedList<E> returnLinkedList = new MyLinkedList<>();
        //Khai báo 1 currentNode trỏ đến head;
        Node currentNode = head;
        //add Node currentNode vào danh sách trả về để nó làm head
        returnLinkedList.addFirst((E) currentNode.data);
        currentNode = currentNode.next;
        while (currentNode != null) {
            returnLinkedList.addLast((E) currentNode.data);
            currentNode = currentNode.next;
        }
        return returnLinkedList;
    }

    /**
     * Kiểm tra 1 phần tử có chứa trong danh sách liên kết hay không
     * @param element
     * @return
     */
    public boolean contains(E element) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.getData().equals(element)) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    /**
     * Lấy 1 phần tử tại index truyền vào
     * @param index
     * @return
     */
    public E get(int index) {
        //Khai báo biến currentNode trỏ đến head
        Node currentNode = head;
        //Thông báo lỗi cho người dùng nếu tham số index < 0 hoặc index lớn hơn số phần tử của danh sách liên kết
        if (index < 0 || index > numNodes) {
            throw new IllegalArgumentException("Error index: " + index);
        }
        //Cho con trỏ Node currentNode chạy đến vị trí index, là vị trí cần lấy data
        for (int i = 0; i < index; ++i) {
            currentNode = currentNode.next;
        }
        //trả về dữ liệu của currentNode
        return (E) currentNode.data;
    }

    /**
     * Trả về phần tử đầu tiên trong danh sách liên kết
     * @return
     */
    public E getFirst() {
        //trả về dữ liệu của Node đầu tiên
        return (E) head.data;
    }

    /**
     * Trả về phần tử cuối cùng trong danh sách liên kết
     * @return
     */
    public E getLast() {
        //Khai báo biến currentNode trỏ đến head
        Node currentNode = head;
        //Cho con trỏ currentNode chạy đến phần tử cuối của danh sách liên kết
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        //trả về dữ liệu của Node cuối
        return (E) currentNode.data;
    }

    /**
     * Kiểm tra phần tử trong danh sách liên kết nằm ở vị trí index thứ mấy
     * @param element
     * @return
     */
    public int indexOf(E element) {
        Node currentNode = head;
        for (int i = 0; i < numNodes; ++i) {
            if (currentNode.getData().equals(element)) {
                return i;
            }
            currentNode = currentNode.next;
        }
        return -1;
    }

    /**
     * Xóa dữ liệu của tất cả các phần tử trong danh sách liên kết
     */
    public void clear() {
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode.data = null;
        }
        currentNode.data = null;
    }
}
