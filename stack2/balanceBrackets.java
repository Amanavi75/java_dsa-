package stack2;

import java.util.Stack;

public class balanceBrackets {
    public static  boolean balance(String str){

        Stack<Character> s = new Stack<>();
        int n = str.length();

        for(int i =0;i<n;i++){
            char ch = str.charAt(i);

            if(ch == '('){
                s.push(ch);
            }else{
                if (s.size()==0) {
                    return false;
                }
                if(s.peek()=='('){
                    s.pop();
                }
            }

        }
        if(s.size()>0){
            return false;
        }
        return true;


    }
    public static void main(String[] args) {
        String str = "(()";
        System.out.println(balance(str));
    }
}
