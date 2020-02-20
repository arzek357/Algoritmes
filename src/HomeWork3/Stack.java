package HomeWork3;

import java.util.Objects;

public class Stack<T> {
    T[] stack;
    int top;
    public Stack(int size){
        this.stack = (T[]) new Object[size];
        top=0;
    }
    public void push(T item){
        if (top==stack.length){
            System.out.println("Стек переполнен!");
            return;
        }
        stack[top++]=item;
    }
    public T pop(){
        if (top==stack.length){
            top--;
        }
        return stack[top--];
    }
    public boolean isEmpty(){
        return top==0;
    }
    public boolean isFull(){
        return top==stack.length;
    }
}
