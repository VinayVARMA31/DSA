import java.util.NoSuchElementException;

public class ArrayList {

    Object [] arr = new Object[10];
    int count;

    public void add (Object o){
       if (count==arr.length) {
         increaseArr();
                }
                arr[count++]=o;  
             }              
     public Object[] increaseArr(){

        Object [] temp = new Object[arr.length+5];
        for (int i = 0; i < temp.length; i++) {
            temp[i]=arr[i];
        }
        arr=temp;
    return arr;
  }
  public int size(){
    return count;
  }
  public Object remove(int index){
    if (index<0 || index>=arr.length) {
        throw new NoSuchElementException();
    }
    Object r = arr[index];
    for (int i = index; i < count-1; i++) {
        arr[i]=arr[i+1];
    }
    count--;
    arr[count]= null;//help with the GC
    return r;
  }
  public void addAtIndex(int index,Object o){
    if (index < 0 || index > count) {
        throw new IndexOutOfBoundsException();
    }
    if (index==arr.length) {
        increaseArr();
    }
    for (int i = count; i > index; i--) {
        arr[i]=arr[i-1];
    }
    arr[index]=o;
  }
}
