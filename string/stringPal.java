package array ;
 
public class stringPal {
    static boolean isPal(String str){
        int beg = 0;
        int end = str.length()-1;
        while(beg<end){
            if(str.charAt(beg)!=str.charAt(end)){
                return false;
            }
            beg++;
            end--;
        }
        return true ;
    }

    public static void main(String[] args) {
       String s = "ABCCBd";
       System.out.println(isPal(s));
    }
}
