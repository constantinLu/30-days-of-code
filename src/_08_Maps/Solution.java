package _08_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    final static Scanner sc = new Scanner(System.in);

    final static Map<String, Integer> phoneBook = new HashMap<String, Integer>();

    public static void main(String[] args) {

        int nr = sc.nextInt();

        for (int i = 0; i < nr; i++) {

            System.out.println("Please enter the name:");
            String name = sc.next();
            System.out.println("Please enter the phoneNo:");
            int phone = sc.nextInt();
            phoneBook.put(name, phone);

        }

        while (sc.hasNext()) {
            System.out.println("Please search by name:");
                String s= sc.next();

                for (String string : phoneBook.keySet()) {
                    if (s.equals(string) && phoneBook.get(string) != null) {
                        System.out.println(string + "=" + phoneBook.get(string));
                    } else {
                        System.out.println("Not found");
                    }
                }


        }

        sc.close();
    }
}
