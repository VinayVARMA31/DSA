import java.util.EmptyStackException;

class Node1{
    Node1 next;
    int o;
    Node1(int obj) {
        this.o = obj;
        this.next = null; // Initialize next to null
    }

     Node1(int o,Node1 next){
        this.o=o;
        this.next=next;
     }
}

public class LinkedStack {

    Node1 top;
    int size;

    public void push(int obj){
        if (top==null) {
            top=new Node1(obj);
            size++;
            return;
        }
        Node1 newNode=new Node1(obj, top);
        top=newNode;
        size++;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size()==0;
    }
    public int peek(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.o;
    }
    public int pop(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int data = top.o;
        top=top.next;
        size--;
        return data;
    }
    public int search(int obj){
        if (isEmpty()) {
            return -1;
        }
        int position =1;
        Node1 curr =top;
        while (curr!=null) {
           if (curr.o==obj) {
              return position;
           } 
           curr=curr.next;
           position++;
        }
        return -1;
    }
    //@Override
    // public String toString() {
    //     return "LinkedStack [top=" + top + ", size=" + size + ", toArray()=" + Arrays.toString(toArray()) + "]";
    // }
    // public Object[] toArray() {
    //     Object[] array = new Object[size];
    //     Node current = top;
    //     for (int i = 0; i < size; i++) {
    //         array[i] = current.o;
    //         current = current.next;
    //     }
    //     return array;
    // }
}

class Check{
    public static void main(String[] args) {
        LinkedStack l = new LinkedStack();
        l.push(10);
        l.push(5);
        l.push(8);
        l.push(3);
        l.push(9);

        System.out.println("Peek: " + l.peek()); // Should print 9
        System.out.println("Size: " + l.size()); // Should print 5
        System.out.println("Search 8: " + l.search(8)); // Should print 3
    }
}