package linkedlist;
public class linkedlist {
    public static class Node {
        int data ;
        Node next ;

        public Node (int data ){
            this.data= data;
            this.next=null;
        }
    }
    public static Node head ;
    public static Node tail;
    public static  int size;

    // methods for linkedlist
    //addFirst  
    public void addFirst(int data){ //0(1)
        // create new node 
        Node newNode = new Node(data);
         size++;
         // in case we dont have any node then 
         if (head==null){
            head = tail=newNode;
            return;
         }

        //  newNode next = head
        newNode.next = head ;

        // head = newNode 
        head = newNode;

    } 
    // addLast
    public void addLast(int data){  // 0(1)

        // create a new node add it on last 
        Node newNode = new Node(data);
        size++;


       // in case we dont have any node then 
       if (head==null){
        head = tail=newNode;
        return;
     }
        // point tail to newNode
        tail.next = newNode;
        
        // assign the tail to newNode 

        tail = newNode;  

    }

    // printing the linked list 
    public void printList(){ 
        // store head temp variable              // o(n)
        Node temp = head ;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
            // everytime change the next refernce to one point ahead 
        }
    }

    // addin middle of Linkedlist
    public void addMiddle(int idx , int data){

        // to add at index 0 we will call addafirst 
        if (idx==0){
            addFirst(data);
        }
        // create a newNode 
        Node newNode = new Node(data);
        size ++;
         
        // put head in a temp variable 
        Node temp = head ;
        // intialize i =0 for the next count which goes till i = idx-1
        int i =0;
        while (i<idx-1){
            // iterate for the count of index till i =idx-1
            temp = temp.next;
            i++;

        } // as soon as the i will be equal to idx-1 to find the exact location where we have to insert 
        
        //connect  the newNode referece in temp node or newhead node 
        newNode.next= temp.next;
        //  and temp next node to newNode 
        temp.next=newNode;


    }

    // removing first element 

    public int removeFirst(){
        if (size ==0){
            System.out.println("ll is empty ");
            return Integer.MIN_VALUE;
            // if linkedlist doesnot have any element 
        }else if ( size ==1){  // in caselinkelist has only one element 
            int val = head.data;
            head = tail = null;
            size =0;
            return val ;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }// removing last element 

    public int removeLast(){
        if (size ==0){  // if linkedlist doesnot have any element 
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if (size ==1 ){
            int val = head.data;
            head = tail = null; // now find the previous index using the loop as size -2 
            return val ;
        }
        Node prev = head ; // initalizing the previous = head
        for (int i =0;i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        size--;
        return val ;
    }
    // iterative search in linkedlist 
    public int itrSearch (int key ){ // O(n)
         Node temp = head;
         int i =0;
         while (temp!=null){
            if(temp.data==key){ 
                // search for the key if found return the index 
                return i;
            }
            temp = temp.next;
            i++;
         }
         return -1 ; // if key is not found in the whole linked list 
    }
// helper function for recurssive search 
    public int helper(Node head ,int key){
        if(head == null){
            return -1;

        }
        if (head.data==key ){
            return 0;
        }
        int idx = helper(head.next, key); 
        if (idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recsearch(int key){
        return helper(head, key);
    }
    public void reverse(){
        Node prev = null ; // at first every node is null 
        Node curr = tail = head ; // intitalize current as head 
        Node next ;
        while (curr!=null){
            next = curr.next; 
            curr.next=prev;
            prev = curr;
            curr = next;
        }
        head = prev ;
    }
    public void deletenthfromend (int n ){
        // calculate size of the linked list 
        int sz =0;
        Node  temp = head ;
        while (temp !=null){
            temp = temp.next;
            sz++;
        }
        
        if (n==sz){
            head = head.next;
            return; // if  n is the last index then the we use the remove first operation 
        }
        // reach at the sz- n index that is to be deleted 
        int i=1 ;
        int itofind = sz-n;
        Node prev = head ;
        while (i<itofind){
            prev= prev.next ;
            i++;
        }
        prev.next = prev.next.next ;// chnage the reference automatically that particukar bode will be deleted by garbagte collector ;
        return;
    }

    // check if ll a palindrome ;
    public Node findmid(Node head){
        Node slow = head;
        Node  fast  = head;
        // used slow fast approach 
        while (fast!=null&& fast.next!=null){
            slow = slow.next;//+1
            fast = fast.next.next;//+2
        }
        return slow;// slow is my middle node  
    }
    public boolean checkpalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        // step 1 = find mid node ;
        Node midNode = findmid(head);

        // reverse second half 
        Node prev =null;
        Node curr = midNode;
        Node next ;
        while (curr!=null){
            next = curr.next;
            curr.next= prev;
            prev=curr;
            curr= next;
        }
        Node right = prev; // right half head 
        Node left = head;

        // step 3 - check left half and right half is eual or not 
        while (right!=null){
            if (left.data!=right.data){
                return false ;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public boolean iscycle(){
       Node slow = head ;
       Node fast = head ;

       while (fast!= null && fast.next!=null){
        slow= slow.next; // +1
       fast = fast.next.next; //+2
       if(slow==fast){
        return true ; // cycle exist 
          }
        }
        return false ; // cycle does not exist 
    }
       
    public static void main(String artgs[]){
          
        linkedlist l1 = new linkedlist();
        l1.addFirst(1);
        l1.addFirst(2);
        l1.addLast(6);
        l1.addLast(5);
        

        l1.addMiddle(2,3 ); 
        l1.printList();
        System.out.println(linkedlist.size); // accessing the size of the linked list 

        l1.removeFirst();
        l1.printList();
        l1.removeLast();
        System.out.println(linkedlist.size);
        System.out.println(l1.itrSearch(3));
        System.out.println(l1.recsearch(6));
        l1.reverse();
        l1.printList();
       
        
    }
}




