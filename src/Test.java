public class Test {
    public static void main(String[] args) {
        Heap<Integer> heap = new Heap<Integer>();
        heap.insert(10);
        heap.insert(20);
        heap.insert(30);
        heap.insert(40);
        heap.insert(50);
        heap.insert(60);


        System.out.println(heap);
    }
}
