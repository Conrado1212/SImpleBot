package main.stage2;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       /* int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();

            if(h >= a && h <= b ){
                System.out.println("Normal");
            }else if(h >= a && h > b){
            System.out.println("Excess");
        }else if(h <= a && h < b){
                System.out.println("Deficiency");
            }*/
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    int num3 = scanner.nextInt();
    int num4 = scanner.nextInt();
        if (num1 == num3) {
            System.out.println("YES");
        } else if (num2 == num4) {
            System.out.println("YES");
        } else if (Math.abs(num1 - num3) == Math.abs(num2 - num4)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }

}
