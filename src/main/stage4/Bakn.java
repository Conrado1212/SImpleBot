package main.stage4;

import java.util.Scanner;

public class Bakn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double M = scanner.nextInt();
        double P = scanner.nextInt();
        double K = scanner.nextInt();
        double years =0;
        while( M != K){
            System.out.println(M);

            M = M * (1 + P / 100);

            System.out.println(M);
            years ++;

        }
        System.out.println(years);

    }
}
