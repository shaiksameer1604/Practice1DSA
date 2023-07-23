import java.util.Scanner;

public class Question3 {

    public static int countNegativeSubarrays(int[] arr) {
        int n = arr.length;
        int count = 0;

        // Generate all subarrays
        for (int i = 0; i < n; i++) {
            int subSum = 0;
            for (int j = i; j < n; j++) {
                subSum += arr[j];
                // Check if the subarray sum is negative
                if (subSum < 0) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }

        // Output
        int result = countNegativeSubarrays(arr);
        System.out.println(result);

        sc.close();
    }
}
