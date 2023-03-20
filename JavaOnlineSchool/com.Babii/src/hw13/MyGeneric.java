package hw13;

import java.util.Arrays;

public class MyGeneric<E> {
    E[] mas;
    int proportions;
    int capacity;

    public MyGeneric() {
        mas = (E[]) (new Object[10]);
        proportions = 0;
        capacity = 10;
    }

    public MyGeneric(int capacity) {
        mas = (E[]) (new Object[capacity]);
        proportions = 0;
        this.capacity = capacity;
    }

    public MyGeneric(E[] mas) {
        this.mas = Arrays.copyOfRange(mas, 0, mas.length);
        proportions = mas.length;
        capacity = mas.length;
    }

    public int size() {
        return proportions;
    }

    public boolean isEmpty() {
        return proportions == 0;
    }

    public E get(int index) {
        if (index < 0) {
            return null;
        }
        if (index >= proportions) {
            return null;
        }
        return mas[index];
    }

    public void add(E element) {

        if (proportions == capacity) {
            mas = Arrays.copyOfRange(mas, 0, (int) (mas.length * 1.75));
            capacity = mas.length;
        }

        mas[proportions] = element;

        proportions++;

    }

    public void add(int index, E element) {
        if (index < 0 || index > proportions) {
            System.out.println("індекс за межами");
            return;
        }
        if (proportions == capacity) {
            mas = Arrays.copyOfRange(mas, 0, (int) (mas.length * 3 / 2)+1);
            capacity = mas.length;
        }
        if (index < proportions) {
            for (int i = proportions; index < i; i--) {
                mas[i] = mas[i - 1];
            }
        }
        mas[index] = element;
        proportions++;

    }

    public void remove (int index){
        if (index < 0 || index > proportions-1) {
            System.out.println("індекс за межами");
            return;
        }

        if (index != proportions -1) {
            for (int i = index; i < proportions -1; i++) {
                mas[i] = mas[i + 1];
            }
        }
        mas[proportions-1] = null;
        proportions--;

    }

    @Override
    public String toString() {
        return Arrays.toString(mas) + " size=" + proportions + ", cap=" + capacity;
    }
}
