package main.stage2;

import java.util.Scanner;

public class chocolate {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        if (k % n == 0 && m >= k / n || k % m == 0 && n >= k / m) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
