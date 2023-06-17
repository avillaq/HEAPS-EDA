public class PriorityQueueHeap<T extends Comparable<T>>{
    private HeapMax<Node<T>> heapMax;

    public PriorityQueueHeap() {
        heapMax = new HeapMax<Node<T>>();
    }

    public void enqueue(T x, int p) {
        Node<T> elem = new Node<T>(x, p);
        heapMax.insert(elem);
    }

    public T dequeue() {
        heapMax.remove();
    }
    
}
