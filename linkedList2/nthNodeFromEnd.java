package linkedList2;  // brute force
/**
 * nthNodeFrom
 */
public class nthNodeFrom {

    public static  class Node {
        int data ;
        Node next ;
        Node(int data){
            this.data = data ; 
        }
        
    }

    public static  Node  nthFromEnd(Node head, int n){
        int size= 0;
        Node temp = head;


        while(head!=null){

            size++;
            temp = temp.next;

        } // finding the size  of the linked list 
    

        int m = size-n + 1; // m will be the nth node from the end

       for (int i =1;i<m-1;i++){
         temp = head ;

         temp = temp.next ;
       }

       return temp; // return the nth node 



    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;


    }
}
