package JE1.ArrayList;

import java.util.Arrays;

public class IntArrayList implements IntList {

    private int[] myArray = new int[5];
    private int size;

    @Override
    public String toString() {
        return "IntArrayList{" +
                "myArray=" + Arrays.toString(myArray) +
                ", size=" + size +
                '}';
    }

    @Override
    public void add(int element) {
        if (size == myArray.length) {
            int newSize = myArray.length * 2;
            int[] newMyArray = new int[newSize];
            for (int i = 0; i < size; i++) {
                newMyArray[i] = myArray[i];
            }
            myArray = newMyArray;
        }
        myArray[size] = element;
        size++;
    }

    @Override
    public boolean add(int index, int element) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public int get(int index) {
        return myArray[index];
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    @Override
    public boolean removeByValue(int value) {
        return false;
    }

    @Override
    public boolean set(int index, int element) {
        myArray[index] = element;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public IntList subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public int[] toArray() {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = myArray[i];
        }
        return result;

    }
}


