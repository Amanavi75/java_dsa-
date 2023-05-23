// stack using arraylist 
package stack;

import java.util.ArrayList;

public class Stackb {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();
    // method to check stack is empty or not ;
    public static boolean isempty(){
        return list.size()==0;
        }
    // method to add the element 
    public static void push(int data){
        list.add(data);
    }
    // method to delete the element 
    public static int  pop(){
       int top = list.get(list.size()-1);
       list.remove(list.size()-1);
       return top;

    }
    // peek to view the top most element 
    public static int  peek(){
       return list.get(list.size()-1);
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
 
