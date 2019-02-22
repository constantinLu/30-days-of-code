package _09_Recursion3;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main (String[]args)  {

        int n = scanner.nextInt();
        scanner.close();
        System.out.println(factorial(n));
    }

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        int  factorial = n * factorial(n-1);
        return factorial;

    }
}
