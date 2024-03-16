package recurssion;

public class seriesSumWithAlternativeSIgn {
    static int  seriesSum(int n ){
        if (n==0) {
            return 0;
        }

        if(n%2==0){
           return  seriesSum(n-1)-n;
        }else{
            return  seriesSum(n-1)+n;
        }

    }

    public static void main(String[] args) {
       int n = 5 ;
       System.out.println(seriesSum(n));
    }
}
