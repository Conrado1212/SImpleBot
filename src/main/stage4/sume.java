package main.stage4;

import java.util.Scanner;

public class sume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int sum=0;
        while((i =scanner.nextInt()) !=0 ){
            sum += i;
        }
        System.out.println(sum);
    }
}
