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

    public int max() {
        if (_currentSize == 0) {
            throw new UnsupportedOperationException("Can't get max item when array is empty.");
        }

        int currentMax = _items[0];
        for (int i = 1; i < _currentSize; i++) {
            if (_items[i] > currentMax) {
                currentMax = _items[i];
            }
        }

        return currentMax;
    }

    public int[] intersect(int[] otherArray) {
        int[] foundItems = new int[otherArray.length];
        int numberOfFoundItems = 0;

        for (int k : otherArray) {
            for (int j = 0; j < _currentSize; j++) {
                if (_items[j] == k) {
                    foundItems[numberOfFoundItems++] = k;
                    break;
                }
            }
        }

        int[] reducedFoundItems = new int[numberOfFoundItems];
        System.arraycopy(foundItems, 0, reducedFoundItems, 0, numberOfFoundItems);
        return reducedFoundItems;
    }

    public void reverse() {
        int[] reversedArray = new int[_currentSize];
        for (int i = 0; i < _currentSize; i++) {
            reversedArray[i] = _items[_currentSize - i - 1];
        }

        _items = reversedArray;
    }

    public void insertAt(int item, int index) {
        if (index < 0 || index >= _currentSize) {
            throw new IllegalArgumentException();
        }

        _items[index] = item;
    }

    public void print() {
        for (int i = 0; i < _currentSize; i++) {
            System.out.println(_items[i]);
        }
    }
}
