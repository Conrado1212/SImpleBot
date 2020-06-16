package main.stage3;

import java.util.Scanner;

public class Buzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for(  ;a <= b ; a++){
            if(a % 5 == 0 && a % 3 == 0){
                System.out.println("FizzBuzz");
            }else if(a % 5 == 0){
                System.out.println("Buzz");
            }else if(a % 3 == 0){
                System.out.println("Fizz");
            }else {
                System.out.println(a);
            }
        }
    }
}
