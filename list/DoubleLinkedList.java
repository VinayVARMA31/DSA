import java.util.NoSuchElementException;

class Node{
    Node prev;
    Node next;
    Object ele;
    Node(Node p,Object o,Node n){
        prev=p;
        next=n;
        ele=o;
    }
}


public class DoubleLinkedList {
    Node first;
    int count;

    public void add(Object obj){
        if (first==null) {
            first = new Node(null, obj, null);
            count++;
            return;
        }
        Node curr=first;
        while (curr.next!=null) {
            curr=curr.next;
        }
        curr.next= new Node(curr, obj, null);
        count++;
    }
    public int size(){
        return count;
    }
    public void addAt(int index,Object obj){
         if (index<0 ||index>size()) {
            throw new IndexOutOfBoundsException();
         }
         if (index==0) {
            first = new Node(null, obj, first);
            count++;
         }
         Node curr=first;
         for (int i = 0; i < index-1; i++) {
            curr=curr.next;
         }
         Node n = new Node(curr, obj, curr.next);
         curr.next = n;
         curr.next.prev=n;  
    }
    public Object removeAt(int index){
        if (index<0 || index>=size()) {
            throw new NoSuchElementException();
        }
        if (index==0) {
            Object ele = first.ele;
            first = first.next;
            if (first != null) {
                first.prev = null;
            }
            count--;
            return ele;
        }
        Node curr = first;
        for (int i = 0; i < index; i++) {
            curr=curr.next;
        }
        Object ele = curr.ele;
        curr.prev.next=curr.next;
        curr.next.prev=curr.prev;
        count--;
        return ele;
    }
}
