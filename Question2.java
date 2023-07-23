import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        bufferedReader.close();

        int maxSum = findMaxHourglassSum(arr);
        System.out.println(maxSum);
    }

    public static int findMaxHourglassSum(List<List<Integer>> arr) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int sum = calculateHourglassSum(arr, i, j);
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }

    public static int calculateHourglassSum(List<List<Integer>> arr, int row, int col) {
        int sum = 0;

        // Top part of the hourglass
        sum += arr.get(row).get(col);
        sum += arr.get(row).get(col + 1);
        sum += arr.get(row).get(col + 2);

        // Middle part of the hourglass
        sum += arr.get(row + 1).get(col + 1);

        // Bottom part of the hourglass
        sum += arr.get(row + 2).get(col);
        sum += arr.get(row + 2).get(col + 1);
        sum += arr.get(row + 2).get(col + 2);

        return sum;
    }
}
