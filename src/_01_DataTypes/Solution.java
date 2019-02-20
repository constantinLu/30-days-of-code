package _01_DataTypes;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        Integer integer = scan.nextInt();
        Double doubleVal = scan.nextDouble();
        String str = "is the best place to learn and practice coding!";

        System.out.println(integer + i);
        System.out.println(doubleVal + d);
        System.out.println(s + str);
    }
}
