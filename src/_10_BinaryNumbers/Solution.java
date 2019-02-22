package _10_BinaryNumbers;

import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        convertToBase2(n);
    }

    private static void convertToBase2(int n) {

        int count = 0, sum = 0;
        while (n > 0) {
            if ((n % 2) == 1) {
                sum++;
                if (sum > count) {
                    count = sum;
                }
            } else {
                sum = 0;
            }
            n = n / 2;
        }
        System.out.println(count);
    }
}


