package less2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CrutchArrayList<T> implements CrutchList<T> {

    private  Object[] array;
    private int size;

    public CrutchArrayList() {

        array = new Object[16];
        size=0;
    }

    @Override
    public T get(int index) {
        try {
            if (size<=index){
                throw new IndexOutOfBoundsException("Элемента с индексом "+index+" не существует");
            }
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }

        return (T)array[index];
    }

    @Override
    public void add(T element) {
        if (size>=array.length){
            resizeArray();
        }
        array[size]=element;
        size++;

    }

    @Override
    public void replaceWith(int index, T element) {
        try {
            if (size<=index){
                throw new IndexOutOfBoundsException("Элемента с индексом "+index+" не существует");
            }
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
        array[index]=element;
    }

    @Override
    public void setInPos(int index, T element) {
        if (size>=array.length){
            resizeArray();
        }
        for (int i = size; i >index+1 ; i--) {
            array[i]=array[i-1];
        }
        array[index]=element;
        size++;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            builder.append(array[i]+", ");
        }
        builder.delete(size,size+1);
        return builder.toString();
    }

    private void resizeArray(){
        Object[] newArray = new Object[array.length+array.length/2];

        for (int i = 0; i < array.length; i++) {
            newArray[i]=array[i];
        }
        array=newArray;

    }
}
