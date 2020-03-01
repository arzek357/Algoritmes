package HomeWork4;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class DoubleLinkedList<T> implements Iterable<T> {

    private Node<T> pre;
    private Node<T> post;

    public DoubleLinkedList() {
        pre = new Node<>(null);
        post = new Node<>(null);
        pre.next = post;
        post.prev = pre;
    }

    public void insertTail(T value) {
        Node<T> newNode = new Node<>(value);
        if (post.prev==null){
            newNode.next=post;
            newNode.prev=pre;
            post.prev=newNode;
            pre.next=newNode;
            return;
        }
        Node<T> last = post.prev;
        newNode.next = post;
        newNode.prev = last;
        post.prev=newNode;
        last.next=newNode;
    }

    public void insertHead(T value) {
        Node<T> newNode = new Node<>(value);
        if (pre.next==null){
            newNode.prev=pre;
            newNode.next=post;
            pre.next=newNode;
            post.prev=newNode;
        }
       Node<T> first = pre.next;
       newNode.prev=pre;
       newNode.next=first;
       pre.next=newNode;
       first.prev=newNode;
    }

    public T deleteHead() {
        T deletedValue = pre.next.value;
        pre.next.next.prev =pre;
        pre.next=pre.next.next;
        return deletedValue;
    }

    public T deleteTail() {
        T deletedValue = post.prev.value;
        post.prev.prev.next=post;
        post.prev = post.prev.prev;
        return deletedValue;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node<T> curr = pre.next;
            @Override
            public boolean hasNext() {
                return curr.next!=null;
            }
            @Override
            public T next() {
                T value = curr.value;
                curr = curr.next;
                return value;
            }
        };

    }
    private static class Node<T> {
        T value;
        Node<T> prev;
        Node<T> next;

        public Node(T value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList<Integer> ll = new DoubleLinkedList<>();
        ll.insertTail(1);
        ll.insertTail(2);
        ll.insertHead(3);
        ll.insertTail(4);
        ll.insertTail(3);
        ll.forEach(System.out::println);
        System.out.println("After delete Head and Tail");
        ll.deleteTail();
        ll.deleteHead();
        ll.forEach(System.out::println);
        System.out.println("After insert Head(7) and Tail(9)");
        ll.insertTail(9);
        ll.insertHead(7);
        ll.forEach(System.out::println);
        System.out.println("After delete 2xHead() and Tail()");
        ll.deleteHead();
        ll.deleteHead();
        ll.deleteTail();
        ll.forEach(System.out::println);
    }
}

