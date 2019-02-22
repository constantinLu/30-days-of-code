package _08_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    final static Scanner sc = new Scanner(System.in);

    final static Map<String, Integer> phoneBook = new HashMap<>();

    public static void main(String[] args) {

        //System.out.println("How many contacts do you want do add?");
        int nr = sc.nextInt();

        for (int i = 0; i < nr; i++) {

            //System.out.println("Please enter the name:");
            String name = sc.next();
            //System.out.println("Please enter the phoneNo:");
            int phone = sc.nextInt();
            phoneBook.put(name, phone);

        }
        //System.out.println("Please search by name:");
        while (sc.hasNext()) {
                String name = sc.next();

                    if (phoneBook.containsKey(name)) {
                        System.out.println(name + "=" + phoneBook.get(name));
                    } else if (name.equals("Quit")) {
                        break;
                    }
                    else {
                        System.out.println("Not found");
                    }
                }
        sc.close();
    }
}
