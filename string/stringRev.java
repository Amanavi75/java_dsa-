package array;

public class stringRev {
    static char[] reverseStr(String str, int low , int high ){

        char[] s = str.toCharArray();
        while (low<high) {
            char temp = s[low];
            s[low] = s[high];
            s[high] = temp;

            low ++;
            high--;

        }

        return s;
    }

    public static void main(String[] args) {
        String s = "aman";
        char p[] = reverseStr(s, 0, 3);
        System.out.println(p);
        }
}
