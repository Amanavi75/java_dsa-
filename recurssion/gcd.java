package recurssion;
// euclids algorithm 
public class gcd {
    static int greatestCommon(int x , int y ){

        while (x%y!=0) {
            int rem = x % y;
            x = y;
            y= rem ;
            
        }
        return y;
    }

    public static void main(String[] args) {
        int n = 12 ;
        int m = 16 ;

        int t = greatestCommon(n, m);

        System.out.println(t);
    }
}
