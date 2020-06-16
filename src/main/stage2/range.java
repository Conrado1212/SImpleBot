package main.stage2;

import java.util.Scanner;

public class range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        if (a % n == 0) {
            System.out.println(b / n - a / n + 1);
        } else {
            System.out.println(b / n - a / n);
        }
    }
}
