import java.util.ArrayList;

public class HeapMax<T extends Comparable<T>> {
    private ArrayList<T> array;

    public HeapMax() {
        array = new ArrayList<T>();

    }

    public void insert(T item) {
        array.add(item);
        T temp;

        for (int j = getTamaño() - 1; j > 0 && array.get(j).compareTo(array.get((j - 1) / 2)) > 0; j = (j - 1) / 2) {
            temp = array.get(j);
            array.set(j, array.get((j - 1) / 2));
            array.set((j - 1) / 2, temp);

        }
    }

    public void remove() {

        array.set(0, array.get(getTamaño() - 1));
        array.remove(getTamaño()-1);

        int j = 1;

        int n = getTamaño();
        while(2*j-1 < n) { // mientras tenga algún hijo
            int k = 2*j-1; // el hijo izquierdo
            if ( k+1 < n && array.get(k+1).compareTo(array.get(k))>0)
                k = k+1; // el hijo derecho es el mayor
            if (array.get(j-1).compareTo(array.get(k)) > 0)
                break; // es mayor que ambos hijos
            T temp = array.get(j-1);
            array.set(j-1, array.get(k));
            array.set(k, temp);
            j = k+1; // lo intercambiamos con el mayor hijo
        }
    }
    public T getMax(){
        return array.get(0);
    }
    public T getMin(){
        return array.get(getTamaño()-1);
    }
    
    public int getTamaño(){
        return array.size();
    }

    @Override
    public String toString() {
        String info = "";
        for (T i : array) {
            info += i + "\n";
        }
        return info;
    }

}
