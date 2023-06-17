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
        Node<T> aux = heapMax.getMax();
        heapMax.remove();
        return aux.getData();
    }
    public T front() {
        return heapMax.getMax().getData();
    }
    public T back() {
        return heapMax.getMax().getData();
    }
    
}
