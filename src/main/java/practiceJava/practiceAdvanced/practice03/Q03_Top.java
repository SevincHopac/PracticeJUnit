package practiceJava.practiceAdvanced.practice03;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Q03_Top {
    /*
      Bir top belirli yükseklikten atılmaktadır.Scanner al
      Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
      Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
      Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.
      */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("atis yuksekligini giriniz:");
        double high =scan.nextDouble();
        double sum =0;
        int vurma =0;


        do {

            vurma++;
            sum +=high;
            high = (high*3)/4;
            sum += high;

        }while (high>=1);

        System.out.println("vurma = " + vurma);
        System.out.println("sum = " + sum);

        NumberFormat numberFormat = new DecimalFormat(".#");
        System.out.println( numberFormat.format(sum));



    }
}
