package practiceJava.practiceAdvanced.practice01;

import java.util.Scanner;

public class Q02_Substring_AdSoyad {
    public static void main(String[] args) {

        /*

       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       Örn:
       Ad: Ali
       Soyad: Can
       */

        Scanner scan = new Scanner(System.in);
        System.out.println("Adinizi soyadinizi giriniz:");
        String name = scan.nextLine();
        
        int idx = name.indexOf(" ");
        String vorname = name.substring(0,idx);
        String nachname = name.substring(idx+1);

        System.out.println("vorname  +\" \"+nachname = " + vorname  +" "+nachname);
        
    }
}
