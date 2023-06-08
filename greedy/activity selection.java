package greedy;
import  java.util.*;
public class activityselection {
    public static void main (String args[]){
        int start [] = {1,3,0,5,8,5};
        int end []= {2,4,6,7,9,9}; // end time is sorted 
        
        int maxAct = 0;
        ArrayList<Integer> ans= new ArrayList<> ();

        maxAct = 1; // firts activity wil always be selected 
        ans.add(0);
        int lastEnd = end[0];
        for (int i =0;i<end.length;i++){
             if (start[i]>=lastEnd){
                maxAct++; // increase the count of max  activity 
                ans.add(i); // add it into the answer array 
                lastEnd = end[i]; 
             }
        }
        System.out.println("max activity = "+ maxAct); // printing the no of max act .
        for (int i =0 ; i<ans.size();i++){
            System.out.println("A"+ans.get(i)+" ");
        } 
        System.out.println();

    }
}
