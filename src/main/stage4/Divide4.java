package main.stage4;

import java.util.Scanner;

public class Divide4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int max = 0;
        int nextNumber = 0;

        for (int i = 0; i < number; i++) {
            nextNumber = scanner.nextInt();
            if (nextNumber % 4 == 0) {
                if (max < nextNumber) {
                    max = nextNumber;
                }
            }
        }
        System.out.println(max);
      /*  int len = scanner.nextInt();
        int start = 0;
        int yep;
        int ans = 0;

        while (start < len) {
            yep = scanner.nextInt();
            start++;

            if (yep % 4 == 0 && yep > ans) {
                ans = yep;
            }
        }

        System.out.println(ans);*/
    }
}
