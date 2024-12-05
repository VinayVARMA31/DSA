package queue;

import java.util.NoSuchElementException;

class Node{
    Node next;
    Object o;
    Node(Object obj){
    o=obj;
    }
}
public class LinkedQueue {

    Node front;
    Node rear;
    int size;
    public void enqueue(Object o){
        Node n = new Node(o);
        if (isEmpty()) {
            front = rear = n;
        }else{
            rear.next = n;
            rear=n;
        }
        size++;

    }
    public boolean isEmpty(){
        return size==0;
    }
    public int size(){
        return size;
    }
    public Object dequeue(){
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        Object o = front.o;
        front= front.next;
        size--;

        if (front==null) {
            rear = null;
        }
    return o;
    }
    public Object peek (){
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return front.o;
    }
    public int search(Object o){
        int position =1;
        Node n = front;
        while (n!=null) {
            if (n.o.equals(o)) {
                return position;
            }
            n = n.next;
            position++;
        }
        return -1;
    }
}

class Test{
    public static void main(String[] args) {
        LinkedQueue q =new LinkedQueue();
        q.enqueue(1);
        q.enqueue(12);
        q.enqueue(31);
        q.enqueue(14);
        q.enqueue(8);
        System.err.println(q.peek());
        System.out.println(q.dequeue());
        System.out.println(q.peek());
        System.out.println(q.size());
    }
}
