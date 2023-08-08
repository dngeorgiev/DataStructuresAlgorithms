package com.dngeorgiev.arrays;

public class Array {
    private int[] _items;
    private int _currentSize;

    public Array(int length) {
        _items = new int[length];
    }

    public void insert(int item) {
        if (_items.length == _currentSize) {
            int[] newItems = new int[_items.length * 2];
            System.arraycopy(_items, 0, newItems, 0, _items.length);
            _items = newItems;
        }

        _items[_currentSize++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= _currentSize) {
            throw new IllegalArgumentException();
        }

        for (int i = index; i < _currentSize; i++) {
            _items[i] = _items[i + 1];
        }

        _currentSize--;
    }

    public int indexOf(int item) {
        for (int i = 0; i < _currentSize; i++) {
            if (_items[i] == item) {
                return i;
            }
        }

        return -1;
    }

    public void print() {
        for (int i = 0; i < _currentSize; i++) {
            System.out.println(_items[i]);
        }
    }
}
