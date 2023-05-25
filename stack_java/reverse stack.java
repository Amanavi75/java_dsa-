package stack;
import java.util.*;
public class reversestack {
    public static void pab(Stack<Integer> s , int data){

        if (s.isEmpty()){  
            s.push(data);
            return ;
        }
        int top = s.pop();
        pab(s, data);
        s.push(top);
         
    }
    public static void reversess(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
       int top = s.pop();
       reversess(s);
       pab(s, top);
    }
    public static void printstack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    } 
    public static void main (String args []){
        Stack<Integer> s = new Stack<>();
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        reversess(s);
        printstack(s);

    }

}
