public class TestPriority {
    public static void main(String[] args) {
        PriorityQueueHeap<Integer> queue = new PriorityQueueHeap<Integer>();
        queue.enqueue(10, 1);
        queue.enqueue(5, 4);
        queue.enqueue(15, 10);
        queue.enqueue(8, 2);
        queue.enqueue(12, 3);
        queue.enqueue(4, 7);

        System.out.println("Front: " + queue.front());  
        System.out.println("Back: " + queue.back());    
        System.out.println("Elemento elimininado: " + queue.dequeue());

    }
}
