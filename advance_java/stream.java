import java.util.*;
 import java.util.stream.*;;
 public class streams {
     public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(2);
        arr.add(6);
        arr.add(8);
        arr.add(2);
        arr.add(8);
        System.out.println(arr);

        Stream<Integer> str = arr.stream();
        str = str.distinct().sorted();
        str.forEach(x->System.out.println(x));
     }
 }
 // streams ar used for storing the data temporarly ,it is immutable and will not perform any operation on the original array 
