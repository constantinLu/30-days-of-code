package _11_2DArrays;

import java.util.Random;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            //String[] arrRowItems = scanner.nextLine().split(" ");
            //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            for (int j = 0; j < 6; j++) {
                Random random = new Random();
                int number = 0 +  random.nextInt(10);
                arr[i][j] = number;
                //int arrItem = Integer.parseInt(arrRowItems[j]);
                //arr[i][j] = arrItem;
            }
        }

        for (int[] i : arr) {
            System.out.println(" ");
            for (int j : i) {
                System.out.print(j + " ");
            }
        }

        System.out.println("\n---------------");
        System.out.println("Result:");
        findMaxSumOfHourGlass(arr);
    }

    public static void findMaxSumOfHourGlass(int[][] arr) {
        int i;
        int j = 0;
        int max = -9 * 9;
        for (i = 0; i < 6; i++) {
            for (j = 0; j < 6; j++) {
                if (j + 2 < 6 && i + 2 < 6) {
                    int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                    if (sum > max) {
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
