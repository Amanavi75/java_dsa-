package array;
import java.util.*;
public class maxconsecutiveones {
    public static void main (String args[]){
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array (0 or 1): ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int maxConsecutiveOnes = 0;
        int currentConsecutiveOnes = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                currentConsecutiveOnes++;
                if (currentConsecutiveOnes > maxConsecutiveOnes) {
                    maxConsecutiveOnes = currentConsecutiveOnes;
                }
            } else {
                currentConsecutiveOnes = 0;
            }
        }scanner.close();
        System.out.println("The maximum consecutive ones in the array is: " + maxConsecutiveOnes);
        scanner.close();
    }
}
