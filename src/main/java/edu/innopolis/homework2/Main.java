package edu.innopolis.homework2;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> array;
        array = new MyArrayList<>(Integer.class, 3);
        Iterator iterator = array.iterator();
        array.add(45);
        array.add(56);
        array.add(12);
        System.out.println(array.length());
        array.add(99);
        System.out.println(array.length());
        array.set(0, 1000);
        while (iterator.hasNext()) System.out.println(iterator.next());
    }

}
