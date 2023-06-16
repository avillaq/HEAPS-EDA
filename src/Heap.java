import java.util.ArrayList;

public class Heap<T extends Comparable<T>> {
    private ArrayList<T> array;
    public Heap(){
        array = new ArrayList<T>();
   
    }
    public void insert(T item) {
        array.add(item);
        T temp;
        for(int j=array.size(); j>1 && array.get(j).compareTo(array.get(j/2))>0; j/=2) {
            temp = array.get(j);
            array.set(j, array.get(j/2));
            array.set(j/2, temp);

        }

    }
}
