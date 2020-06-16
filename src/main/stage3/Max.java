package main.stage3;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int currentMax = 0;
        int num;

        for (int i = 0; i < n; i++) {
            num = scanner.nextInt();
            if (num % 4 == 0 && num > currentMax){
                currentMax = num;
            }
        }
        System.out.println(currentMax);
    }
}
