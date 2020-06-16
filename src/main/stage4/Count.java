package main.stage4;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int licznik = count;
        for (int i = 1; i <= count; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print(" "+i);
             if(i==4){

             break;
            }




            }
           // System.out.println(licznik);
        }

      /*  int a = scanner.nextInt();
        int b = a;

        for (int i = 1; i < a; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(i + " ");
                b--;
                if (b == 0) {
                    break;
                }
            }
            if (b == 0) {
                break;
            }
        }*/
    }
}
