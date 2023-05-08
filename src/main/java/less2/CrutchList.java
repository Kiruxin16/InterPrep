package less2;



public interface CrutchList<T> {

    T get(int index);

    void add(T element);

    void replaceWith(int repIndex, T element);

    void setInPos(int repIndex, T element);





}
