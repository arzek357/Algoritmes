package HomeWork3;

import java.util.Arrays;

public class TestClassForDeque {
    public static void main(String[] args) {
        Deque<Integer> kek = new Deque<>(8);
        kek.inverseEnqueue(1);
        kek.normalEnqueue(2);
        kek.inverseEnqueue(3);
        kek.normalEnqueue(4);
        kek.normalEnqueue(5);
        kek.normalEnqueue(6);
        kek.inverseEnqueue(7);
        kek.inverseEnqueue(8);
        System.out.println(Arrays.toString(kek.getDeque()));
        System.out.println(kek.inverseDequeue());
        System.out.println(kek.inverseDequeue());
        System.out.println(kek.normalDequeue());
        System.out.println(kek.normalDequeue());
    }
}
