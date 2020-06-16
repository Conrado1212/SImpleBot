package main.stage3;

import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double avg = 0;
        double sum=0;
        double licznik=0;
        for(;a<=b;a++){
            if(a % 3 == 0 ){
                sum += a;
                licznik++;
                avg = sum/licznik;
            }
        }

        System.out.println(avg);
    }
}
