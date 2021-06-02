package trien_khai_queue;

public class Queue<E> {
    Node<E> rear;
    Node<E> front;

    public Queue() {
        this.rear = null;
        this.front = null;
    }

    public void enQueue(E element) {
        Node<E> currentNode = new Node<>(element);
        if (front == null) {
            front = currentNode;
        } else {
            rear.next = currentNode;
        }
        //đưa con trỏ rear về currentNode vừa được khởi tạo
        rear = currentNode;
        //sau khi con trỏ rear trỏ đến node này, ta liên kết con trỏ front và rear với nhau
        //gán địa chỉ con trỏ rear cho node front
        rear.next = front;
    }

    public E deQueue() {
        Node<E> currentNode = front;
        //kiểm tra hàng đợi queue có trống hay không
        if (front == null) {
            System.out.println("Queue is empty");
            //nếu trống, trả về null
            return null;
        } else {
            //Kiểm tra hai con trỏ front và rear có cùng trỏ lên 1 node hay không
            if (front == rear) {
                front = null;
                rear = null;
                return currentNode.data;
            } else {
                //đưa con trỏ front về trước currentNode
                front = currentNode.next;
                //liên kết con trỏ front và con trỏ rear
                rear = front.next;
                //trả về currentNode
                return currentNode.data;
            }
        }
    }

    public void displayQueue(Queue<E> queue) {
        Node<E> currentNode = rear;
        while (currentNode != null) {
            if (currentNode.next == rear) {
                System.out.println(currentNode.data + " ");
                break;
            } else {
                System.out.println(currentNode.data + " ");
                currentNode = currentNode.next;
            }
        }
    }
}
