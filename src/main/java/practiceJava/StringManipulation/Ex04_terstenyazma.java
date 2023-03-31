package practiceJava.StringManipulation;

import java.util.Scanner;

public class Ex04_terstenyazma {
    public static void main(String[] args) {


        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 4 karakterli bir kelime giriniz:");
        String str =scan.next();
        int strLength=str.length();
        String newstr ="";

        if (strLength ==4){
            for (int i = strLength-1 ; i>=0 ; i--){

                char a = str.charAt(i);
                newstr +=a;

            }
        }

        System.out.println(newstr);


    /*    Scanner input = new Scanner(System.in);
        System.out.println("4 harfli kelime girin");
        String kelime = input.next();
        StringBuilder ad = new StringBuilder(kelime);
        System.out.println(ad.reverse());*/

    }
}
