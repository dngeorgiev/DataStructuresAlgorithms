import com.dngeorgiev.arrays.Array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(1);
        numbers.insert(10);
        numbers.insert(30);
        numbers.insert(420);
        numbers.insert(69);

        numbers.removeAt(4);
        numbers.print();

        System.out.println("Index of 420: " + numbers.indexOf(420));
        System.out.println("Index of 69: " + numbers.indexOf(69));

        System.out.println("Max number is: " + numbers.max());

        int[] arrayToIntersect = { 1, 420, 69 };
        System.out.println("Common items: " + Arrays.toString(numbers.intersect(arrayToIntersect)));

        System.out.println("Reversing array...");
        numbers.reverse();
        numbers.print();
    }
}
