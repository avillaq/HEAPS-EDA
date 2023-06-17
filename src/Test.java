public class Test {
    public static void main(String[] args) {
        Heap<Integer> heap = new Heap<Integer>();

        /*
         * heap.insert(16);
         * heap.insert(14);
         * heap.insert(10);
         * heap.insert(8);
         * heap.insert(7);
         * heap.insert(9);
         * heap.insert(3);
         * heap.insert(2);
         * heap.insert(15);
         */
        /*
         * heap.insert(10);
         * heap.insert(20);
         * heap.insert(30);
         * heap.insert(40);
         * heap.insert(50);
         * heap.insert(60);
         * heap.insert(70);
         * heap.insert(80);
         */
        heap.insert(50);
        heap.insert(30);
        heap.insert(20);
        heap.insert(40);
        heap.insert(70);
        heap.insert(60);
        heap.insert(90);
        heap.insert(80);

        heap.remove();
        System.out.println(heap);

    }
}
