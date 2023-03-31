package practiceJava.practiceAdvanced.practice05;

import java.util.Scanner;

public class Q1_Ascii {
    //Kullanıcıdan aldığınız iki karakterin arasında bulunan tüm karakterleri yazdıran bir kod yazınız.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("2 karakter giriniz:");
        char char1 = scan.next().charAt(0);
        char char2 = scan.next().charAt(0);

        int ilk = Math.min(char1, char2);
        int ikinci = Math.max(char1, char2);

        for (int i = ilk + 1; i < ikinci; i++) {

            System.out.print((char)i + " ");
        }

    }
}
