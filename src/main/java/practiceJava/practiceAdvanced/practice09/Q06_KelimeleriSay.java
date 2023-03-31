package practiceJava.practiceAdvanced.practice09;

import java.util.HashMap;
import java.util.Map;

public class Q06_KelimeleriSay {
    /*
 Bir String içerisindeki kelimelerin kaç kez tekrar ettiğini bulan bir method yazınız.
 input: "Ali okula geldi ve Ayse de okula geldi."
 output: Ali = 1, okula = 2, geldi = 2, ve = 1, Ayse= 1, de = 1

*/
    public static void main(String[] args) {

        String str = "Ali ,,   okula geldi ve Ayse de okula geldi.";
        kelimeleriSay(str);
    }

    public static void kelimeleriSay(String str) {

        str = str.replaceAll("\\p{Punct}", "").replaceAll("\\s+", " ").trim();
        System.out.println("str = " + str);
        String[] arr = str.split(" ");

        Map<String, Integer> kelimeTekrarlari = new HashMap<>();

        for (String w : arr) {
            if (!kelimeTekrarlari.containsKey(w)) {

                kelimeTekrarlari.put(w, 1);

            } else {

                kelimeTekrarlari.put(w, kelimeTekrarlari.get(w) + 1);
            }
        }
        System.out.println("kelimeTekrarlari = " + kelimeTekrarlari);
    }
}
