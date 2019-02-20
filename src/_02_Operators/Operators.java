package _02_Operators;

import java.util.Scanner;

public class Operators {

    private static final Scanner scanner = new Scanner(System.in);


    static void solve(double meal_cost, int tip_percent, int tax_percent) {
            double tip = meal_cost * tip_percent / 100;
            double tax = meal_cost * tax_percent / 100;
            double total = tip + tax + meal_cost;
            int test = Math.toIntExact(Math.round(total));
            System.out.println(test);
        }

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
