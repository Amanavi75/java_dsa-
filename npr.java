package function;
public class npr {

    public static void main(String[]args){
       
        
        int n = 5;
        int r = 4;

         //here we are using the same line of code again and again to avoid this we use the function


            int i;

            int nfact=1;
            for(i=1;i<=n;i++){
                nfact*=i;
            }
            int nmrfact = 1;
            for(i=1;i<=n-r;i++){
                nmrfact*=i; // logic for factorial  
            }
            int npr=nfact/nmrfact;
            System.out.println(n+"p"+r+" ="+npr);

            
    }

}


    
