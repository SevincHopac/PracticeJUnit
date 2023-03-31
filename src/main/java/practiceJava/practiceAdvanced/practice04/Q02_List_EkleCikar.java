package practiceJava.practiceAdvanced.practice04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02_List_EkleCikar {

    /*
Kullanıcdan aldığınız bir sayıyı bir list'e ekleyen,
list'ten çıkaran yada mevcut bir elementi o sayı ile güncelleyen bir kod yazınız.
 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();


        while (true) {
            System.out.println(list);

            System.out.println("Ekleme yapmak icin 'add' \n" +
                    "Guncellemek icin 'update'\n" +
                    "Silmek icin 'delete' \n" +
                    "Cikmak icin 'quit' ");

            String option = scan.next();

            if (option.equalsIgnoreCase("add")) {
                System.out.println("Eklemek istediginiz sayi:");
                int ekleneceksayi = scan.nextInt();
                list.add(ekleneceksayi);
            } else if (option.equalsIgnoreCase("update")) {
                System.out.println("Guncellemek istediginiz sayi:");
                int guncelleneceksayi = scan.nextInt();
                System.out.println("Girmek istediginiz yeni sayi:");
                int yenisayi = scan.nextInt();
                list.set(list.indexOf(guncelleneceksayi), yenisayi);
            } else if (option.equalsIgnoreCase("delete")) {
                System.out.println("Silmek istediginiz sayi:");
                Integer silineceksayi = scan.nextInt();
                list.remove(silineceksayi);
            } else if (option.equalsIgnoreCase("quit"))
                break;
            else System.out.println("Gecerli bir konut giriniz!");

        }
        System.out.println("by by");
    }
}
