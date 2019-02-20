package _03_ConditionalStatements;

import java.util.Scanner;

public class ConditionalStatements {

    private static final Scanner scanner = new Scanner(System.in);

    private static void printString(int N) {
        if (N % 2 == 1) {
            System.out.println("Weird");
        } else if (N % 2 == 0) {
            if ((N > 20) || (N >= 2 && N <= 5)) {
                System.out.println("Not Weird");
            }
            if ((N >= 6 && N <= 20)) {
                System.out.println("Weird");
            }
        }
    }
    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        printString(N);
        scanner.close();
    }
}
