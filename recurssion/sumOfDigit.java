package recurssion;

public class sumOfDigit {
    static int sod(int n){

        //base case 

        
        if(n>= 0 && n<=9){
            return n ;
        }

        // n/10 will give us the n-1 digit of number and n%10 will give last digit of the number 
        return sod(n/10) + n%10;
    }

    public static void main(String[] args) {
        System.out.println(sod(12344));
    }
}
