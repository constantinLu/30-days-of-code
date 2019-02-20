package day_07;

import java.util.Scanner;

public class Solution {

    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int nr = sc.nextInt();

        int[] arrayInts = new int[nr];

        for (int i = 0; i < nr; i++) {
            arrayInts[i] = sc.nextInt();

        }
        for (int j = 0; j < nr; j++) {
            int index = nr - j - 1;
            System.out.print(arrayInts[index] + " ");
        }
        sc.close();
    }
}
