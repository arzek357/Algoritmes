package HomeWork2;

public class Task2 {
    public static void main(String[] args) {

        MyArray myArray1 = new MyArray(10000);
        long start1 = System.currentTimeMillis();
        myArray1.mergeSort();
        System.out.println(System.currentTimeMillis()-start1);

        MyArray myArray2 = new MyArray(10000);
        long start2 = System.currentTimeMillis();
        myArray2.insertionSort();
        System.out.println(System.currentTimeMillis()-start2);

        MyArray myArray3 = new MyArray(10000);
        long start3 = System.currentTimeMillis();
        myArray3.selectionSort();
        System.out.println(System.currentTimeMillis()-start3);

        MyArray myArray4 = new MyArray(10000);
        long start4 = System.currentTimeMillis();
        myArray4.bubbleSort();
        System.out.println(System.currentTimeMillis()-start4);
    }
}
