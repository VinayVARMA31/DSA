class Node{
    Node next;
    Object ele;
    Node(Node n,Object o){
        next=n;
        ele=0;
    }
}

public class LinkedList {

    Node first;
    int count;

    public void add(Object obj){
        if (first== null) {
            first = new Node(null, obj);
            count++;
        }
        Node curr = first;
        while (curr.next!=null) {
            curr=curr.next;
        }
        curr.next= new Node(null, obj);
        count++;
    }
    public int size(){
        return count;
    }
    public void addAt(int index,Object obj){
         if (index<0 || index>size()) {
            throw new IndexOutOfBoundsException();
         }
         Node curr =first;
         for (int i = 0; i < index; i++) {
            curr=curr.next;
         }
         curr.next=new Node(curr.next, obj);
         count++;
    }
    public Object removeAt(int index){
        if (index<0 || index>size()) {
            throw new IndexOutOfBoundsException();
         }
         if (index==0) {
            Node o = first;
            first=first.next;
            count--;
            return o.ele;
         }
         Node curr = first;
         for (int i = 0; i <index; i++) {
            curr=curr.next;
         }
         Node n = curr.next;
         curr.next= curr.next.next;
        count--;
        return n.ele;
    }
    public void reverse(){
        Node curr=first;
        Node next= null;
        Node prev= null;
        while (curr.next!=null) {
            next=curr.next;
            curr.next=prev;
            prev =curr;
            curr=next;
        }
        first =prev;
    }
}
