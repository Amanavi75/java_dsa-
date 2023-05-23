package stack;
import java.util.*;
public class pushatbottom {
    public static void pab(Stack<Integer> s , int data){

        if (s.isEmpty()){
            s.push(data);
            return ;
        }
        int top = s.pop();
        pab(s, data);
        s.push(top);
         
    }
    public static void main (String args []){
        Stack<Integer> s = new Stack<>();
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);

        pab(s, 1);
        
        while(!s.isEmpty()){
            System.out.println(s.pop());
        } 


    }
}
