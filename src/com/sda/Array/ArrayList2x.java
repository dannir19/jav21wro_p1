package com.sda.Array;


public class ArrayList2x<T> implements IList<T> {

    private T[] array;
    private final int arraySizeIncrValue = 2;
    private int size;

    public ArrayList2x() {                               // pusta lista argumentów
        array = (T[]) new Object[arraySizeIncrValue];
    }

    public boolean isEmpty() {
        return size == 0;  // mozna bez tego dac ? true : false ;
    }

    public int size() {
        return size;
    }

    public void add(T value) { // dodac element do listy bo size =0
        if (array.length > size) {
            array[size] = value;
            ++size;
            return; // dalsza czesc nie wykonuje sie bo jest return
        }
        int newArraySize = array.length * arraySizeIncrValue;
        T[] tmp = (T[]) new Object[newArraySize];
        for (int i = 0; i < array.length; i++)
            tmp[i] = array[i];
        tmp[size] = value;
        array = tmp; // podmieniany tablice
        ++size;
    }

    public void add(int index, T value) {
        if (index > size)
            throw new IndexOutOfBoundsException();
        int newArraySize = array.length > size ?
                array.length : array.length * arraySizeIncrValue;
        T[] tmp = (T[]) new Object[newArraySize];

        for (int i = 0; i < index; i++)
            tmp[i] = array[i];
        tmp[index] = value;
        for (int i = index + 1; i < array.length + 1; i++)
            tmp[i] = array[i - 1];
        if (array.length > size) {
            newArraySize -= arraySizeIncrValue;
        }
        ++size;
        return;
    }

    public T get(int index) { // sprawdzamy rozmiar
        if (index >= size) throw new ArrayIndexOutOfBoundsException();
        return array[index];
    }

    public void remove(int index) {
        if (index > size)
            throw new IndexOutOfBoundsException();
        T[] tmp = (T[]) new Object[array.length];
        for (int i = 0; i < index; i++)
            tmp[i] = array[i];
        for (int i = index + 1; i < array.length; ++i)
            tmp[i - 1] = array[i];
        array = tmp;
        size--;


    }
}



