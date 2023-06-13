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
        System.out.print(root.data+" ");
        inorder(root.right); 
        // created the function for the inorder traversal for 
    }
    public static void main (String args[]){
        int values[]={5,1,3,4,2,7};
        Node root = null;
        for (int i=0;i<values.length;i++){
            root = insert(root,values[i]);
        }
        inorder(root);
    }
}
