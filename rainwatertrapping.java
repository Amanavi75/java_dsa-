package array;
import java.util.Scanner;
public class rainwatertrapping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Input the array elements
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Calculate the maximum element on the left and right of each element
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            leftMax[i] = max;
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        max = arr[n-1];
        for (int i = n-1; i >= 0; i--) {
            rightMax[i] = max;
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Calculate the amount of water trapped
        int waterTrapped = 0;
        for (int i = 0; i < n; i++) {
            int minMax = Math.min(leftMax[i], rightMax[i]);
            if (minMax > arr[i]) {
                waterTrapped += minMax - arr[i];
            }
        }

        System.out.println("The amount of water trapped is: " + waterTrapped);
        scanner.close();
    }
}
