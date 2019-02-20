package _06_LetsReview;

import java.util.Scanner;

public class Solution {

    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int noSpaces = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < noSpaces; i++) {
            String string = sc.nextLine();
            char[] charArray = string.toCharArray();

            for (int j = 0; j < charArray.length; j++) {
                if (j % 2 == 0) {
                    System.out.print(charArray[j]);
                }
            }
            System.out.print(" ");

            for (int j = 0; j < charArray.length; j++) {
                if (j % 2 != 0) {
                    System.out.print(charArray[j]);
                }
            }

            System.out.println();
        }

    sc.close();
    }
}
