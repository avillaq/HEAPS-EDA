public class Node<T extends Comparable<T>> implements Comparable<Node<T>> {
    private T data;
    private int priority;

    public Node(T data, int priority) {
        this.data = data;
        this.priority = priority;
    }
    
    public T getData() {
        return data;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Node<T> elem) {
        return priority>elem.getPriority() ? 1:-1;
    }
        
}
