package practiceJava.practiceAdvanced.practice07;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Q02_UzunKelime {
    /*
          Kullanıcıdan alınan cümledeki en uzun kelimeyi(kelimeleri) return eden bir method oluşturunuz.
         */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Cumleyi giriniz:");
        String cumle = scan.nextLine();
        System.out.println(uzunKelime(cumle));
    }

    public static ArrayList<String> uzunKelime(String cumle) {

        ArrayList<String> words = new ArrayList<>();
        String[] arr = cumle.split(" ");

        int max = 0;

        for (String w: arr) {
            if (w.length() > max) {
                max = w.length();
            }
        }

        for (String w : arr){
            if (w.length()==max)
                words.add(w);
        }

        return words;
    }
}
