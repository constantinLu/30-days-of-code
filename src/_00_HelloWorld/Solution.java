package _00_HelloWorld;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String inputString = sc.nextLine();

        sc.close();

        System.out.println("Hello, World.");
        System.out.println(inputString);
    }
}
