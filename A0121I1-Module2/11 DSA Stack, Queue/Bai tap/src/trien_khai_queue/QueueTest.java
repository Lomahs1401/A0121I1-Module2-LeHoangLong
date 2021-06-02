package trien_khai_queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new Queue<>();
        integerQueue.enQueue(1);
        integerQueue.enQueue(2);
        integerQueue.enQueue(3);
        integerQueue.enQueue(4);
        integerQueue.enQueue(5);
        System.out.println("---------------------------------------------------");
        System.out.println(integerQueue.deQueue());
        System.out.println(integerQueue.deQueue());
        System.out.println(integerQueue.deQueue());
        System.out.println(integerQueue.deQueue());
        System.out.println(integerQueue.deQueue());
        System.out.println("---------------------------------------------------");
        Integer value1 = integerQueue.deQueue();
        System.out.println("Phần tử đầu tiên được thêm vào: " + value1);
        System.out.println("Lấy phần tử " + value1 + " ra khỏi queue");
        Integer value2 = integerQueue.deQueue();
        System.out.println("Phần tử tiếp theo: " + value2);
        System.out.println("Lấy phần tử " + value2 + " ra khỏi queue");
        Integer value3 = integerQueue.deQueue();
        System.out.println("Phần tử tiếp theo: " + value3);
        System.out.println("Lấy phần tử " + value3 + " ra khỏi queue");
        Integer value4 = integerQueue.deQueue();
        System.out.println("Phần tử tiếp theo: " + value4);
        System.out.println("Lấy phần tử " + value4 + " ra khỏi queue");
        Integer value5 = integerQueue.deQueue();
        System.out.println("Phần tử cuối cùng: " + value5);
        System.out.println("Lấy phần tử " + value5 + " ra khỏi queue");
        System.out.println("---------------------------------------------------");
        integerQueue.displayQueue(integerQueue);
    }
}