package practiceJava.practiceAdvanced.practice07;

import java.util.Scanner;

public class Q03_AtbashCode {
    /*
      Kullanıcıdan aldığınız bir metni 'Atbash Code' yöntemi ile şifreleyen bir kod yazınız.
      Ortadoğuda kullanılan en eski şifreleme biçimlerinden biridir.
      Arami alfabesinin tersten yazılması ile oluşturulan bir kodlayıcıya sahiptir.
      Örn: A-->Z, B-->Y ...

      "abcdefghijklmnopqrstuvwxyz";
      "zyxwvutsrqponmlkjihgfedcba";

  */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("sifreyi giriniz:");
        String sifre = scan.nextLine();

        String str1 = "abcdefghijklmnopqrstuvwxyz";
        String str2 = "zyxwvutsrqponmlkjihgfedcba";

        //1.yol
        for (int i = 0; i < sifre.length(); i++) {

            for (int j = 0; j < str1.length(); j++) {

                if (sifre.charAt(i)==str1.charAt(j))
                    System.out.print(str2.charAt(j));
            }
        }

        System.out.println();

        //2.Yol

        System.out.println("sifreyi giriniz:");
        String sif = scan.nextLine();


        for (int i = 0; i < sif.length(); i++) {

            int idx= 'z'- sif.charAt(i);
            System.out.print((char) ('a'+idx));

        }
    }
}
