public class Node<T extends Comparable<T>> implements Comparable<T> {
    private T data;
    private int priority;

    public Node(T data, int priority) {
        this.data = data;
        this.priority = priority;
    }

    @Override
    public int compareTo(T elem) {
        
    }
        
}
