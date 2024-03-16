package recurssion.array;
// recurssive traversal 
public class print {
      static void traverse(int arr [] , int i){
        if(i==arr.length){
            return;
        }

        //self work 
        System.out.println(arr[i]);

        traverse(arr,i+1);
      }

      public static void main(String[] args) {
        int arr1[] = {1,2,4,5,6,7,8} ;
        traverse(arr1,0);
      }
}
