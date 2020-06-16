package main.stage4;

import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =0;
        int sum=0;
        while((n = scanner.nextInt()) !=0){
            sum +=n;

            if(sum >= 1000){
                sum = sum - 1000;
                break;
            }

            }
        System.out.println();
        System.out.println(sum);
      /*  int input;
        int sum = 0;

        while ((input = scanner.nextInt()) != 0) {
            sum += input;
            if (sum >= 1000) {
                sum = sum - 1000;
                break;
            }
        }

        System.out.println(sum);*/
        }
    }

