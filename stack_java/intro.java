 package stack;

import java.util.Stack;

public class intro {
    public static void main (String args[]){
        Stack<Integer>st=new Stack<>(); // declaring a stack with name st 
        st.push(10); // adiing items to the stack st 
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        st.pop();
        st.pop();
        System.out.println(st);// pop method is used to delete the element from the stack (st)
        st.peek();// method is used to display the top element of the stack 
        st.size();// gives the size of the stack 
        System.out.println(st.peek()+" "+ st.size());

    }
    
}

