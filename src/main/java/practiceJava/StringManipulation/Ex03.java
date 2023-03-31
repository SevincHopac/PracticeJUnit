package practiceJava.StringManipulation;

import java.security.SecureRandom;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        /*
         * startsWith()
         *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         *
         * endsWith()
         * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         */

        String cumle ="Kazananlar hic hata yapmayanlar degil, vazgecmeyenlerdir.";

        System.out.println(cumle.startsWith("K"));
        System.out.println(cumle.endsWith("dir."));

        String str = "hi";
        String str2 = "";

        System.out.println(str.isEmpty());
        System.out.println(str2.isEmpty());

        //kullanicidan aldiginiz string de bosluk olup olmadigini söyleyin

        Scanner scan = new Scanner(System.in);
        System.out.println("cumle:");
        String cumle1 = scan.nextLine();

        System.out.println(cumle1.contains(" ") ? true:false);


    }
}
