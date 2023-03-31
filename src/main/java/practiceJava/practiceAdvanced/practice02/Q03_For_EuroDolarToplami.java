package practiceJava.practiceAdvanced.practice02;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q03_For_EuroDolarToplami {
    /*
      Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamların bulan bir kod yazınız.
      Ornek:
       [$1 $12 €34 €56 $45 €78]
        dolarToplami: 58
        euroToplami: 168
       */

    public static void main(String[] args) {

        String str = "$1 $12 €34 €56 $45 €78";
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
        int dol = 0;
        int eu = 0;

        for (String w : arr) {
            if (w.contains("$")) {
                dol += Integer.parseInt(w.replace("$", ""));
            }else {
                eu += Integer.parseInt(w.replace("€", ""));
            }
        }

        System.out.println("eu = " + eu + "€");
        System.out.println("dol = " + dol + "$");

    }
}
