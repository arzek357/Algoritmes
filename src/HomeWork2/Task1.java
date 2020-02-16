package HomeWork2;

public class Task1 {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(5);
        myArray.printInConsole();
        myArray.remove(2);
        myArray.printInConsole();
        myArray.add(2,4);
        myArray.printInConsole();
        System.out.println(myArray.isContain(1));
    }
}
