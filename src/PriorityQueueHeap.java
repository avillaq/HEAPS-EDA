public class PriorityQueueHeap<T extends Comparable<T>>{
    private HeapMax<T> max;

    public PriorityQueueHeap() {
        max = new HeapMax<T>();
    }
    
}
