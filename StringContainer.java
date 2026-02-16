public class StringContainer<T> implements Container<T> {

    private T k;
    public void add(T item){
        this.k=item;
    }

    public T get(){
        return k;
    }
    
}
