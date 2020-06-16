package main.stage4;

import java.util.Scanner;

public class Vowel {

    public static boolean isVowel(char ch) {
        if(ch == 'a' ||  ch == 'A' || ch == 'e' || ch == 'E'|| ch == 'i' || ch == 'I'|| ch == 'o' || ch == 'O'|| ch == 'u' || ch == 'U' ){
            return true;
        }else {

        }
       return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}
