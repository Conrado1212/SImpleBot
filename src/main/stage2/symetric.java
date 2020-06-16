package main.stage2;


import java.util.Scanner;
public class symetric {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r,sum=0,temp;
        int n= scanner.nextInt();

        temp=n;
        while(n>0){
            r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("1");
        else
            System.out.println("2");
    }
  /*  int n = scanner.nextInt();
    int d1 = n / 1000;
    int d2 = n / 100 % 10;
    int d3 = n / 10 % 10;
    int d4 = n % 10;

        if (d1 == d4 && d2 == d3) {
        System.out.println(1);
    } else {
        System.out.println(0);
    }*/

}
