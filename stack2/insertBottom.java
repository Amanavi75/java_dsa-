package stack2;

import java.util.Stack;

public class insertBottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(7);
        st.push(6);
        st.push(75);
        st.push(79);
        st.push(97);

        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }

        st.push(6);
        while(rt.size()>0){
            st.push(rt.pop());
        }

        System.out.println(st);

    }

}
