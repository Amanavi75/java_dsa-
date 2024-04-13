package linkedList2;
public class implementation {
    
    public static class Node{
        int data ;
        Node next ;
        Node(int data){package linkedList2;
public class implementation {
    
    public static class Node{
        int data ;
        Node next ;
        Node(int data){
            this.data= data;

        }
    }

    public static void display(Node head){
        Node temp=head ;
        while(head!=null){
            System.out.println(temp.data);
            temp= temp.next;
        }
    }
    public static int counter(Node head){
        int count = 0;
     
        while(head!=null){
            count++;
            head= head.next;
            
        }

        return count;
    }

   public static class linkedList{
    Node head = null ;
    Node tail = null ;

    void insertAtEnd(int val){
        Node temp = new Node(val);
        if(head==null){
            head= temp ;
        }else{
            tail.next= temp;
        }
        tail = temp ;
    }


    void insertAtHead(int val){
        Node temp = new Node(val);
        if(head ==null){
            head = tail = temp;
        }else{
            temp.next =head;
            head = temp;
        }
       }


       void insertAt(int idx , int val){
        Node newNode = new Node(val);
        Node temp = head ;

        if(idx==0){
            insertAtHead(val);
        }/*elseif(idx==size){ corner cases 
            insertAtEnd(val);
        }

        */

        for(int i =1;i<idx-1;i++){
            temp = temp.next ;    // finding the idx - 1 

        }
        newNode.next = temp.next; // adding the new node next to temp.next node
        temp.next = newNode;
       }


       void getElementAt(int idx){
        Node temp = head ;
        int i =0;
        while(i<idx){
            temp = temp.next;
            i++;
        }
        System.out.println(temp.data);
       }
   }

  

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);

        a.next= b;
        b.next= c;
        c.next= d;
        d.next= e;


        display(a);
        

    }
}

            this.data= data;

        }
    }

    public static void display(Node head){
        Node temp=head ;
        while(head!=null){
            System.out.println(temp.data);
            temp= temp.next;
        }
    }
    public static int counter(Node head){
        int count = 0;
     
        while(head!=null){
            count++;
            head= head.next;
            
        }

        return count;
    }

   public static class linkedList{
    Node head = null ;
    Node tail = null ;

    void insertAtEnd(int val){
        Node temp = new Node(val);
        if(head==null){
            head= temp ;
        }else{
            tail.next= temp;
        }
        tail = temp ;
    }


    void insertAtHead(int val){
        Node temp = new Node(val);
        if(head ==null){
            head = tail = temp;
        }else{
            temp.next =head;
            head = temp;
        }
       }


       void insertAt(int idx , int val){
        Node newNode = new Node(val);
        Node temp = head ;

        if(idx==0){
            insertAtHead(val);
        }/*elseif(idx==size){ corner cases 
            insertAtEnd(val);
        }

        */

        for(int i =1;i<idx-1;i++){
            temp = temp.next ;    // finding the idx - 1 

        }
        newNode.next = temp.next; // adding the new node next to temp.next node
        temp.next = newNode;
       }
   }

  

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);

        a.next= b;
        b.next= c;
        c.next= d;
        d.next= e;


        display(a);
        

    }
}
