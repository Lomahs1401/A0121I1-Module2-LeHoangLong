package demo_queue;

public class MyLinkedListQueue {
    //Con trỏ front luôn trỏ đến Node cuối của queue
    private Node front;
    //Con trỏ back luôn trỏ đến Node đầu tiên của queue
    private Node back;

    /**
     * constructor
     */
    public MyLinkedListQueue() {
        //khởi tạo con trỏ front = null
        this.front = null;
        //khởi tạo con trỏ back = null
        this.back = null;
    }

    //thêm phần tử vào danh sách queue
    public void enqueue(int key) {
        //Khởi tạo Node mới và gán địa chỉ của Node mới vào biến currentNode
        Node currentNode = new Node(key);
        //Nếu khởi tạo Node đầu tiên, tức trong queue chưa có Node nào
        if (this.back == null) {
            //Cho 2 con trỏ front và back đều trỏ đến Node đầu tiên là currentNode
            this.front = this.back = currentNode;
            return;
        }
        /*
        Sau khi khởi tạo, ta gán địa chỉ của con trỏ back hiện tại vào Node vừa khởi tạo
        tức Node vừa được khởi tạo sẽ liên kết với Node mà con trỏ back đang trỏ tới
        */
        this.back.next = currentNode;
        /*
        Sau khi liên kết, lúc này con trỏ back vẫn chưa trỏ đến Node đầu tiên (currentNode) trong danh sách
        mà trỏ đến Node kế tiếp nó trong danh sách. Ta sẽ đưa con trỏ back về lại vị trí Node đầu tiên (currentNode)
        Gán địa chỉ của Node thứ hai mà con trỏ back đang trỏ tới (this.back.next) vào Node đầu tiên
         */
        this.back = this.back.next; //hoặc this.back = currentNode
    }

    //lấy Node khỏi danh sách queue và trả về Node đó
    public Node dequeue() {
        //nếu trong danh sách queue chưa có Node nào cả, tức con trỏ back và con trỏ front đều trỏ đến null
        //thì trả về giá trị null
        if (this.front == null) {
            return null;
        }
        //khởi tạo biến currentNode và gán vào con trỏ front đang trỏ đến Node cuối cùng trong danh sách queue
        Node currentNode = this.front;
        //đưa con trỏ front về trước currentNode
        this.front = this.front.next; //hoặc this.front = currentNode.next
        /*
        Nếu trong danh sách queue chỉ có 1 Node, khi đó ban đầu ta có hai con trỏ back và front đều
        cùng trỏ đến Node đó. Sau khi tạo biến currentNode và cùng trỏ đến Node duy nhất, ta đưa con trỏ front
        về phía trước. Dễ dàng thấy không có Node nào đứng trước currentNode cả, vậy con trỏ front trỏ đến null
         */

        if (this.front == null) {
            //Khi ta xóa phần tử Node duy nhất và trả về Node đó, lúc này trong danh sách queue không còn Node nào cả
            //Vậy ta sẽ cho con trỏ back và front đều trỏ đến null
            this.back = null;
        }

        //Nếu có nhiều Node thì ta chỉ việc trả về currentNode hiện tại
        return currentNode;
    }
}
