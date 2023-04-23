package function;
public class nprfunction {
    public static int fact(int x){
        int rv =1 ;
        for (int i=1;i<=x;i++){
            rv*=i;
        }
        return rv;
    }
    // here we have created a function named fact and we used it twice below so that  code repeatibility is less and looks smooth 
    public static void main (String [] args){
    
        int n = 4;
        int r = 2;

        int nfact=fact(n);
        int nmrfact=fact(n-r);
        
        int npr = nfact/nmrfact;
        System.out.println(n + "p"+r+","+npr);

    }
    
}
