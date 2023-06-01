package queue;
import java.util.*;
public class queueutwostack {
    static class Queue{
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();
   // isEmpty function 
   public static boolean isEmpty(){
    return s1.isEmpty();
   }

   // add add function to add element in the queue
   // its time complexity is o(n)
   public static void add (int data){
    while (!s1.isEmpty()){
        s2.push(s1.pop());
    }

    s1.push(data);
    while (!s2.isEmpty()){
        s1.push(s2.pop());
    }
   }

   // remove function to remove data from the queue 
   public static int remove(){
    if (isEmpty()){
        System.out.println("queue empty");
        return -1 ; 
    }
    return s1.pop();
   }

   // peek to get the top element of the queue 
   public static int peek(){
    if (isEmpty()){
        System.out.println("queue empty");
        return -1 ; 
    }
    return s1.peek();
   }
}

   public static void main (String args[]){
    Queue q = new Queue() ;
    q.add(1);
    q.add(2);
    q.add(3);

    while (!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
    }

   }
}
