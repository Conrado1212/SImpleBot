package main.stage2;

import java.util.Scanner;

public class divide6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i < n; i++){
            int  divide = scanner.nextInt();
             if(divide % 6 == 0 ){

                sum += divide;

             }
        }
        System.out.println(sum);
    }
}
