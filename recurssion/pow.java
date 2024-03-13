package recurssion;

public class pow {
    static int power(int p, int q ){

        if(q==0) return 1;
        return power(p,q-1)*p ;

    }

    public static void main(String[] args) {
        int n = 5;
        int m = 4;

        int answer = power(n, m);
        System.out.println(answer);

    }
}
