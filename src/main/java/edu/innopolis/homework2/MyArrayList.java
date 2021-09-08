package edu.innopolis.homework2;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayList<T> {

    private static final int DEFAULT_SIZE = 100;
    private static final int SIZE_MULTIPLIER = 2;
    private T[] my_array;
    private int size;
    private int currentIndex;

    //Не совсем Generic-подход, однако такая инициализация более безопасна
    MyArrayList(Class<T> datatype) {
        this.size = DEFAULT_SIZE;
        this.my_array = (T[]) Array.newInstance(datatype, DEFAULT_SIZE);
        this.currentIndex = 0;
    }

    MyArrayList(Class<T> datatype, int initialCapacity) {
        this.size = initialCapacity;
        this.my_array = (T[]) Array.newInstance(datatype, initialCapacity);
        this.currentIndex = 0;
    }

    public void add(T o) {
        if (currentIndex == size) {
            //clone() -> использует первый конструктор
            T[] temp = my_array.clone();
            size *= SIZE_MULTIPLIER;
            my_array = (T[]) Array.newInstance(temp[0].getClass(), size);
            System.arraycopy(temp, 0, my_array, 0, temp.length);
        }
        my_array[currentIndex] = o;
        currentIndex++;
    }

    public T set(int index, T o) {
        checkIndex(index);
        T old = my_array[index];
        my_array[index] = o;
        return old;
    }

    public T get(int index) {
        checkIndex(index);
        return my_array[index];
    }

    public int length() {
        return size;
    }

    public Iterator<T> iterator() {
        return new MyIterator();
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("No such index");
        }
    }

    class MyIterator implements Iterator<T> {
        int current = 0;

        @Override
        public boolean hasNext() {
            return current < MyArrayList.this.currentIndex;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return my_array[current++];
        }
    }
}
