import com.dngeorgiev.arrays.Array;

public class Main {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(1);
        numbers.insert(10);
        numbers.insert(30);
        numbers.insert(420);
        numbers.insert(69);
        numbers.print();
    }
}
