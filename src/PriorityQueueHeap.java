public class PriorityQueueHeap<T extends Comparable<T>>{
    private HeapMax<Node<T>> Heap;

    public PriorityQueueHeap() {
        Heap = new HeapMax<Node<T>>();
    }

    public void enqueue(T x, int p) {
        Node<T> elem = new Node<T>(x, p);
        Heap.insert(elem);
    }
    
}
