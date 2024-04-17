package stack2;

import java.util.Stack;

public class copyStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(7);
        st.push(6);
        st.push(75);
        st.push(79);
        st.push(97);

        Stack<Integer> st2 = new Stack<>();

        while(st.size()>0){
            st2.push(st.pop());
        }

        System.out.println(st2);
    }
}
