import java.util.LinkedList;
import java.util.PriorityQueue;

public class GenericQueue<E> {
    private LinkedList<E> elements;

    public GenericQueue(){
        elements = new LinkedList<>();
    }

    public void enqueue(E element) {
        elements.addLast(element);
    }

    public E dequeue() {
        return elements.removeFirst();
    }

    public int getSize() {
        return elements.size();
    }

    public boolean isEmpty() {
        return elements.size() == 0;
    }

    public static void main(String[] args) {
        GenericQueue<String> queue = new GenericQueue<>();
        queue.enqueue("America");
        queue.enqueue("Canada");
        queue.enqueue("France");
        queue.enqueue("Japan");
        queue.enqueue("Viet Nam");
        while (!queue.isEmpty()) {
            System.out.print(queue.dequeue() + ", ");
        }
        System.out.println("\nSize of queue is " + queue.getSize());
        System.out.println();
        PriorityQueue<Integer> myQueue = new PriorityQueue<>();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        myQueue.add(5);
        while (!myQueue.isEmpty()) {
            System.out.print(myQueue.remove() + ", ");
        }
    }
}
