package HomeWork3;

public class Deque<T> {
    private T[] deque;
    private int front;
    private int rear;
    private int size;

    public T[] getDeque() {
        return deque;
    }

    public Deque(int size){
        deque = (T[]) new Object[size];
        front=0;
        rear=-1;
        size=0;
    }
    public void normalEnqueue(T item){
        if (rear== deque.length-1){
            rear=-1;
        }
        deque[++rear]=item;
        size++;
    }
    public T normalDequeue(){
        T tmp = deque[front++];
        if (front == deque.length){
            front=0;
        }
        size--;
        return tmp;
    }
    public void inverseEnqueue(T item){
        if(rear==-1){
            normalEnqueue(item);
            return;
            }
        front--;
        if (front<0){
            front=deque.length-1;
        }
        deque[front]=item;
        size++;
    }
    public T inverseDequeue(){
        T tmp = deque[rear];
        rear--;
        size--;
        return tmp;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size== deque.length;
    }
}
