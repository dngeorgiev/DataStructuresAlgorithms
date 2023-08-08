package com.dngeorgiev.arrays;

public class Array {
    private int[] _items;
    private int _currentSize;

    public Array(int length) {
        _items = new int[length];
    }

    public void print() {
        for (int i = 0; i < _currentSize; i++) {
            System.out.println(_items[i]);
        }
    }
}
