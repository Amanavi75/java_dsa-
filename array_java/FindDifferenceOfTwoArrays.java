package array;

import java.util.Scanner;

public class FindDifferenceOfTwoArrays {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter the number of elements in the first array: ");
      int n1 = input.nextInt();

      int[] arr1 = new int[n1];
      System.out.print("Enter the elements of the first array: ");

      for (int i = 0; i < n1; i++) {
         arr1[i] = input.nextInt();
      }

      System.out.print("Enter the number of elements in the second array: ");
      int n2 = input.nextInt();

      int[] arr2 = new int[n2];
      System.out.print("Enter the elements of the second array: ");

      for (int i = 0; i < n2; i++) {
         arr2[i] = input.nextInt();
      }

      int[] diff = new int[n1];
      int k = 0;

      for (int i = 0; i < n1; i++) {
         boolean found = false;

         for (int j = 0; j < n2; j++) {
            if (arr1[i] == arr2[j]) {
               found = true;
               break;
            }
         }

         if (!found) {
            diff[k] = arr1[i];
            k++;
         }
      }

      System.out.print("The difference of the two arrays is: " + diff);

      for (int i = 0; i < k; i++) {
         System.out.print(diff[i] + " ");
      }input.close();
   }
}
