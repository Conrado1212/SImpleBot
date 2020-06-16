package main.stage3;

import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long sum=1;
        for(int i = a;i<b;i++){
            sum *= i;
        }
        System.out.println(sum);
    }
}
