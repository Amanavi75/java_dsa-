package queue;
/**
queue
**/

public class queuearr {
    static class queue {
        static int arr[];
        static int size ;
        static int rear ;
        static int front;
        queue(int n ){   
            // creating a constructor queue 
            arr = new int[n];
            size = n ;
            rear = -1;
            front= -1;

        }

        // isEmpty function checking  stack is empty on not ;
        public static boolean isEmpty(){
            return rear ==-1;
        }
        // add or enqueue function to add element in the queue
        public static void add(int data){
            if (rear == -1){
                System.out.println ("queue is full "); 
                // corner case when queue is full 
            }
            rear = rear+1 ;
            arr[rear]=data;
        }
        //  remove opertaions 
        // shift all the elemnets left by one position and rear of the queue will rear -1 
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1 ;
            }
            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear = rear -1 ;
            return front ;
        }

        //peek 
        public static int  peek(){
          if (isEmpty()){
            System.out.print("empty queue");
            return -1 ;
          }
          return arr[0];
        }
    } 
    public static void main (String args[]){
        queue q = new queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }

}
