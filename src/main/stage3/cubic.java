package main.stage3;

import java.util.Scanner;

public class cubic {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final long a = scanner.nextLong();
        final long b = scanner.nextLong();
        final long c = scanner.nextLong();
        final long d = scanner.nextLong();

        for (long x = 0, count = 0; x <= 1000 && count < 4; x++) {
            if (a * x * x * x + b * x * x + c * x + d == 0) {
                System.out.println(x);
                count += 1;
            }
        }
    }
}
