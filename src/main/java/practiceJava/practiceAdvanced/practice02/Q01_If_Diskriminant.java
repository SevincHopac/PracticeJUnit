package practiceJava.practiceAdvanced.practice02;

import java.util.Scanner;

public class Q01_If_Diskriminant {
    /*     katsayıları verilen 1 bilinmeyenli denklemin kökleriniz bulunuz.
            ax^2 + bx + c;
            Çözüm adımları
            kullanıcıdan a,b,c yi alın.
            Diskriminant formulü: (-b +/- karekök(delta)) / (2a)
            Delta = bb - 4ac
            Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
            Delta = 0 => 1 tane kök vardır x = -b/2a
            Delta < 0 ise kök yoktur.
       */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Denklemin a,b ve c sayilarini sirayla giriniz:");

        double a =scan.nextInt();
        double b =scan.nextInt();
        double c =scan.nextInt();

        double delta =(b*b)-(4*a*c);

        if (delta<0){
            System.out.println("kok yoktur.");
        } else if (delta==0) {
            double x = (-b/(2*a));
            System.out.println("1 tane kök vardir : " + x);
        }else {

            double x1 = ( -b + Math.sqrt(delta))/(2*a) ;
            double x2 = ( -b - Math.sqrt(delta))/(2*a) ;

            System.out.println("Kokler : " + x1 +" " +x2);

        }


    }
}
