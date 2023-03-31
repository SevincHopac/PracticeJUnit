package practiceJava.practiceAdvanced.practice06;

import java.util.Random;
import java.util.Scanner;

public class Q02_RandomSifreOlusturma {
    //Kullanıcıdan aldığınız sayi kadar karakter uzunluğuna sahip rastgele şifre üreten bir kod yazınız.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Sifreniz kac karakterli olsun : ");
        int uz = scan.nextInt();

        String password = "";
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int lngth = chars.length();

        for (int i = 0; i < uz; i++) {

            int idx = (int) (Math.random() * lngth);
            password += chars.charAt(idx);
        }

        System.out.println(password);



    }

}
