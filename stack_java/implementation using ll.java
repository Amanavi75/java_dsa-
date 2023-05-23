// implementation using stack 
package stack;

public class stacll {
    static class Node {
        int data ;
        Node next;

        Node (int data){
            this.data= data;
            this.next= null;

        }
    }
    static class Stack {
         static Node head = null;

         // method to check that the stack is empty or not 
         public static boolean isempty(){
            return head==null;
         }

         //push 
         public static void push (int data){
            Node newNode = new Node(data);
            if(isempty()){
                head= newNode;
                return ;
            }

            newNode.next = head;
            head = newNode;
         }
         //pop
         public static int pop(){
            if(isempty()){
                
                return -1 ;
            } 
            int top = head.data;
            head = head.next;
            return top;
         } 
         // peek 
         public static int peek(){
            if(isempty()){
                
                return -1 ;
            } 
            return head.data;
         } 
    }
    public static void main (String args[]){
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);

        while(!Stack.isempty()){
            System.out.println(Stack.peek());
            Stack.pop();
        }

    }
}
