package queue;

public class queuell {
   static class Node {
    int data;
     Node next;
      Node (int data){
        this.data= data;
        this.next= null; 
      }
   }
   static class queue {
     static Node head = null;
     static Node tail = null;
 
     // to check queue is empty or not 
     public static boolean isEmpty(){
        return head==null & tail==null;
     }
    public static void add(int data ){
        Node newNode = new Node (data);
        if (head == null){
            head = tail = newNode;
        }  
        tail.next = newNode;
        tail = newNode ;
    }

    // remove  function 
    public static int remove(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1 ;
        }
        int front = head.data;
        //in case we have only one element 
        if (tail == head ){
            tail = head= null;
        } else {
            head = head.next;
        }
         return front ; 
    }
    // peek 
    public static int peek(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1 ;
        }
        return head.data; 
    }
   }
   public static void main (String args[]){
    queue q = new queue( );
    q.add(1);
    q.add(2);
    q.add(3);

    while (!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
    }

}
    
}
