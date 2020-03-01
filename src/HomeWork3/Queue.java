package HomeWork3;

public class Queue<T> {
    private T[] queue;
    private int front;
    private int rear;
    private int size;
    public Queue(int size){
        queue = (T[]) new Object[size];
        front=0;
        rear=-1;
    }
    public void enqueue(T item){
        if (rear==queue.length-1){
            rear=-1;
        }
        queue[++rear]=item;
        size++;
    }
    public T dequeue(){
        T tmp =queue[front++];
        if (front ==queue.length){
            front=0;
        }
        size--;
        return tmp;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size==queue.length;
    }
}
