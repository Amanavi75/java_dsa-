package bst;

public class buildbst {
    static class Node {
        int data;
        Node left ;
        Node right ;
        Node(int data){
            this.data =data;

        }
    }
    public static Node insert(Node root, int val){
        if (root==null){
            root = new Node(val);
            return root;
        }
        if(root.data>val){  // conftion for left subtree 
            root.left= insert(root.left , val );
        } else {
            root.right= insert(root. right,val); // condition for right subtree  
        }
        return root;
    }
    public static void inorder(Node root ){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right); 
        // created the function for the inorder traversal for 
    }
    public static boolean search (Node root , int key ){
        if (root ==null){
            return false ;
        }
        if (root.data==key){
            return  true;
        }
        if (root.data>key){
            return search(root.left, key);
        }else {
            return search(root.right,key);
        }
    }
    public static Node delete(Node root, int val ){
        if (root.data<val){
            root.right= delete(root.right, val);
        }else if (root.data>val){
            root.left= delete(root.left,val);
        }else {
              //case 1 leaf node 
            if (root.left == null && root.right==null){
                return null ; 
            } 
            // case 2 - single child 
            if(root.right==null){
                return root.right;
            } 
            else if (root.right==null){
                return root.left;
            }
            // case 3 = both children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
           root.right = delete(root.right,IS.data);

        }
        return root;
    }
    public static Node findInorderSuccessor(Node root){
        while (root.left!=null){
            root = root.left;
        }
        return root; 
    }
    public static void main (String args[]){
        int values[]={8,5,3,1,4,6,10,11,14}; 
        Node root = null;
        for (int i=0;i<values.length;i++){
            root = insert(root,values[i]);
        }
        inorder(root);
        if (search(root,1)){
            System.out.println("found ");
        }
        root = delete(root, 10);
        System.out.println();

        inorder(root);

    }
}
 
