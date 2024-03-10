package array;
// using sum and difference 
//In Java, when you pass variables to a function, a copy of the variable is created and any changes made to the copy do not affect the original variable.
public class swap {
    static int[] swapN(int a, int b) {
        int[] swapped = new int[2];
        swapped[0] = a + b;
        swapped[1] = swapped[0] - b;
        swapped[0] = swapped[0] - swapped[1];
        return swapped;
    }

    public static void main(String[] args) {
        int c = 9;
        int d = 10;
        System.out.println("before swap");
        System.out.println(c);
        System.out.println(d);
        int[] swappedValues = swapN(c, d);
        c = swappedValues[0];
        d = swappedValues[1];
        System.out.println("after swap");
        System.out.println(c);
        System.out.println(d);
    }
}
