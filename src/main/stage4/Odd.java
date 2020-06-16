package main.stage4;

import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n =0;
        while((n = scanner.nextInt()) != 0){
            if(n % 2 ==0){
                System.out.println("even");
            }else{
                System.out.println("odd");
            }

        }
     /*   int num;

        while (scanner.hasNext()) {
            num = scanner.nextInt();
            if (num == 0) {
                break;
            }

            if (num % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }*/
    }
}
